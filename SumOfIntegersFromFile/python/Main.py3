import sys

with open(sys.argv[1], 'r') as file:
    n = 0
    lines = file.readlines()
    for line in lines:
        n = n + int(line)
    print(n)
