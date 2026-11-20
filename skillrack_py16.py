rows = 5

for i in range(1, rows + 1):
    # Print leading spaces
    for j in range(rows - i):
        print(" ", end=" ")
        
    # Print descending numbers (from i down to 1)
    for j in range(i, 0, -1):
        print(j, end=" ")
        
    # Print ascending numbers (from 2 up to i)
    for j in range(2, i + 1):
        print(j, end=" ")
        
    print()
