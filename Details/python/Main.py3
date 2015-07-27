import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        match = re.findall('X\.*Y', line)
        print(len(sorted(match)[-1])-2)