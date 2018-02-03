# Description
Measure how different string B is from string A.

# Scoring

Missing characters. Missing characters are given +X points. Missing characters are characters that are in string A at a particular position that aren't in string B at the same position. These characters must be added to string B in order to create string A. 

Incorrect characters. Incorrect characters are given -X points. Incorrect characters are characters that are in string B that aren't in string A. These characters must be removed from string B in order to create string A.

# Method descriptions

removeIncorrectChars(String A, String B)
-loop through string looking at each char.
-IF (char in B does not exist in A)
--subtract X amount of points from total (or add to negative score).
end method.

addMissingChars(String A, String B)
-loop through string looking at each char.
-IF (char exists in A but not in B)
--Add X amount of points to total (or add to positive score).
--Insert missing char into B.


calculateScore(int total, int stringALen) or calculateScore(int negative, int positive, int stringALen)

