"""
Python - EASY - PART001
ProgramID-1566
SKILLRACK
Find Prime Number
Check if the input number is a prime number.
Input Format:
N is the input number.
Output Format:
Print "YES" if N is a prime number otherwise print "NO"
Example Input/Output 1:
Input: 3
Output
YES
Example Input/Output 2:
Input:
4
Output
NO
Max Execution Time Limit: 5000 millisecs

"""
#Your code below
def isnotprime(a):
    for i in range(2,int(a**0.5)+1,1):
        if(a%i==0):
            return True
    return False
if(not isnotprime(int(input()))):
    print("YES")
else:
    print("NO")