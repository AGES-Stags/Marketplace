#!/bin/bash

javac ./src/*.java -d ./bin

if [ $? -eq 0 ]; then
	java -cp ./bin App
fi;
