# Find the digital sum of a given number.
# A number N is passed as input. Print the digital sum
# by recursively adding its digits until a single digit is obtained.

n = int(input())

while n > 9:
    total = 0

    while n > 0:
        total += n % 10
        n //= 10

    n = total

print(n)
