@ECHO OFF
DEL /Q "C:\Users\cdimaio\Dropbox\MyProjects\DifferenceAlgorithm\*.class"

javac -d C:\Users\cdimaio\Dropbox\MyProjects\DifferenceAlgorithm\ *.java 

DIR /B *.class

cd "C:\Users\cdimaio\Dropbox\MyProjects\DifferenceAlgorithm"
java -cp C:\Users\cdimaio\Dropbox\MyProjects\DifferenceAlgorithm\; StringDiff %1 %2 %3 %4 %5 %6 %7 %8 %9

ECHO ON