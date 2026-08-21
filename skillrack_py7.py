"""Python - VERY-EASY - PART001
ProgramID-1876
SKILLRACK
Hyphen Separated Co-Primes
Two numbers A and B which are co-prime to each other are passed as input. The program must print the numbers with a hyphen between A and B
Example Input/Output 1:
Input:
5
7
Output:
5-7
Example Input/Output 2:
Input:
25
36
Output:
25-36
Max Execution Time Limit: 5000 millisecs"""


#Your code below
a=int(input().strip())
b=int(input().strip())
print(a,"-",b,sep="")