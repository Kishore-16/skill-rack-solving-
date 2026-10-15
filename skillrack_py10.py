"""
Python-VERY-EASY-PART003
ProgramID-1563
SKILLRACK
Check if the sum of two numbers is odd or even.
Write a program to find whether the sum of two input numbers is odd or even.
Please note that the output is case sensitive and hence Y in You must be in upper case.
Boundary Conditions:
0 < N < 1000
Example Input/Output 1:
Input: 6
13
Output:
odd
Explanation:
6 + 13 = 19 which is odd.
Example Input/Output 2:
Input: 4
2
Output:
even
Explanation:
4 + 2 = 6 which is even.
Max Execution Time Limit: 5000 millisecs


"""
#Your code below
def isodd(a):
    if(a%2!=0):
        return True
    return False
m=int(input())
n=int(input())
if(isodd(m) and isodd(n)):
    print("even")
elif(isodd(m) or isodd(n)):
    print("odd")
else:
    print("even")
    