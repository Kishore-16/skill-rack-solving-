rows = 5

# Upper half (Pyramid)
for i in range(1, rows + 1):
    # Print leading spaces
    for j in range(rows - i):
        print(" ", end="")
    # Print stars
    for k in range(2 * i - 1):
        print("*", end="")
    print()

# Lower half (Inverted Pyramid)
for i in range(rows - 1, 0, -1):
    # Print leading spaces
    for j in range(rows - i):
        print(" ", end="")
    # Print stars
    for k in range(2 * i - 1):
        print("*", end="")
    print()
