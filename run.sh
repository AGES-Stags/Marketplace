#!/bin/bash

javac *.java -d ./bin

if [ $? -eq 0 ]; then
	java -cp ./bin App
fi;