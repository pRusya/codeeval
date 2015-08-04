import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    n = int(lines[0])
    lines = list(map(str.strip, lines))
    lines.sort(key=len, reverse=True)
    for line in lines[:n]:
        print(line)
