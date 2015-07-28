import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        n = sum(1 for m in re.finditer(r'(?=(<--<<|>>-->))', line))
        print(n)
