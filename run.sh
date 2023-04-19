#!/bin/bash

# Validate if a path was given by parameters
# If not, set currentDirectory with the terminals pwd path
if [ $# -eq 0 ]; then
	currentDirectory="$(pwd)"
elif [ ! -z "$1" ]; then
    currentDirectory=$1
fi

# Create java run classpath execution parameter
if [ -d "$currentDirectory/libs/" ]; then
	libraries="$(ls $currentDirectory/libs)"
	classpath="-cp ."
	libs="-cp "
	
	for library in $libraries
	do
		libs="$libs $currentDirectory/libs/$library"
		classpath="$classpath:$currentDirectory/libs/$library"
	done

	classpath="$classpath:$currentDirectory/bin"
else
	classpath="-cp $currentDirectory/bin"
fi;

# Compile java whether or not having libraries
javac $libs $currentDirectory/src/*.java -d $currentDirectory/bin

# If the compilation stage does not gave any error
# Execute java program with given parameters
if [ $? -eq 0 ]; then
	java $classpath App
fi;
