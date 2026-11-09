"""
Python - AVERAGE - PART004
ProgramID-2
SKILLRACK
Arrange the alphabets in a string in descending order
A string (with only alphabets) S is passed as input. The program should print the alphabets in the string in descending order. Assume all alphabets will be in lower case.
Boundary Conditions:
The length of string S is between 2 and 100.
Example input and output:
If the input is "cake", the output should be "keca"
If the input is "innovation", the output should be "vtonia" (n or o or i should not be repeated)
Max Execution Time Limit: 5000 millisecs
"""

s = list(input().strip())
s.sort(reverse=True)

b = ""
for i in s:
    if i not in b:
        b += i

print(b)
