"""Python - VERY-EASY - PART003
ProgramID-2204
SKILLRACK
Print Social Network
A letter (character) L is passed as the input. Based on the value of L, the program must print the following output.
If L is w or W, the program must print whatsapp
If L is t or T, the program must print twitter
If L is f or F, the program must print facebook
For any other value, the program must print undefined
Input Format:
The first line denotes the value of L.
Output Format:
The first line contains the output value based on the given conditions.
Example Input/Output 1:
Input: t
Output:
twitter
Example Input/Output 2:
Input: f
Output: facebook
Example Input/Output 3:
Input:
a
Output:
undefined
Max Execution Time Limit: 5000 millisecs"""

#Your code below
ch=input().lower()
match ch :
    case "w":
        print("whatsapp")
    case "t":
        print("twitter")
    case "f":
        print("facebook")
    case _:
        print("undefined")
        
        