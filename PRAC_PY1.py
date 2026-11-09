"""
Python - EASY - PART005
ProgramID-2601
SKILLRACK
Identify correct operator.
An expression E is passed as an input to the program. The expression will contain three numbers A, B and C, one equal symbol and one of the mathematical operators + - * /
But the given mathematical operator is incorrect and hence the expression is not valid. Hence the program must identify the correct operator and print that as the output.
Input Format:
First line will contain the expression E
Output Format:
First line will contain the correct mathematical operator
Sample Input/Output:
Example 1:
Input:
5-4-20
Output: *
Explanation:
Only 5 multiplied with 4 gives 20. Hence - must be replaced with *.
Example 2:
Input:
999+9=111
Output: /
Explanation:
Only 999 divided by 9 gives 111. Hence + must be replaced with/.
Max Execution Time Limit: 10000 millisecs

"""

import sys
import re

def solve():
    # Read the input expression from standard input
    expr = sys.stdin.read().strip()
    if not expr:
        return

    # Use regular expressions to extract the numbers from the expression
    # The pattern matches the first number, followed by an operator, 
    # followed by the second number, an equals sign, and the result.
    match = re.match(r"(\d+)[+\-*/](\d+)=(\d+)", expr)
    
    if match:
        A = int(match.group(1))
        B = int(match.group(2))
        C = int(match.group(3))
        
        # Check which operator satisfies the mathematical equation
        if A + B == C:
            print("+")
        elif A - B == C:
            print("-")
        elif A * B == C:
            print("*")
        elif B != 0 and A // B == C:  # Using integer division to handle basic test cases cleanly
            print("/")

if __name__ == '__main__':
    solve()
