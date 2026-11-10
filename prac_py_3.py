
# Capitalize the first letter of every word in a given string

s = input()

words = s.split(' ')

result = []

for word in words:
    if word:
        word = word[0].upper() + word[1:]
    result.append(word)

print(' '.join(result))
