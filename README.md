# CSX42: Assignment 1
## Name: Krupa Sawant
-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in wordPlay/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile wordPlay/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile wordPlay/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile wordPlay/src/build.xml run -Dinput="input.txt" -Doutput="output.txt" -Dmetrics="metrics.txt"

Note: Arguments accept the absolute path of the files.


-----------------------------------------------------------------------
## Description:
WordRotator class takes an individual word and position of the word and rotates it
wrt corresponding index while checking for boundary conditions and end of sentence(".").
MetricsCalculator takes an individual words, computes the number of characters in every word
and measures average word length and number of words in a sentence.
Results class prints the resulant output onto standard console and respective files.

Data structure used to store and entire resultant sentence is array list.
The reason array list is used:
It's a resizable array, can add or remove elements anytime without defining a fixed size 
which helps in saving memory and time.


-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken. "

Date: [6/12/2020]


