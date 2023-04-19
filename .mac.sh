#!/bin/bash

libDir="libs"
classpath="-cp ."
libs="-cp"

# Validate if a path was given by parameters
# If not, set currentDirectory with the terminals pwd path
if [ $# -eq 0 ]; then
	currentDirectory="$(pwd)"
elif [ ! -z "$1" ]; then
    currentDirectory=$1
fi


# Create java run classpath execution parameter
if [ -d "$currentDirectory/$libDir/" ]; then
	libraries="$(ls $currentDirectory/$libDir/)"
	for library in $libraries
	do
		libs="$libs $currentDirectory/$libDir/$library"
		classpath="$classpath:$currentDirectory/$libDir/$library"
	done
fi;

# Find every source file on src folder and concatenate it
sourcePath="$(find "$currentDirectory/src" -type f -name "*.java")"
sourcePath="${sourcePath//[$'\t\r\n']/ }"


# Compile java whether or not having libraries
javac $libs $sourcePath -d $currentDirectory/bin


# Find every class file on bin folder and concatenate it
binClassPath="$(find "$currentDirectory/bin" -type d)"
binClassPath="${binClassPath//[$'\t\r\n']/:}"
classpath="$classpath:$binClassPath"

# If the compilation stage does not gave any error
# Execute java program with given parameters
if [ $? -eq 0 ]; then
	java $classpath marketplace.App
fi;
