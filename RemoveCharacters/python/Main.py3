import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        string = re.split(", ", line.rstrip())
        for e in string[1]:
            string[0] = string[0].replace(e, '')
        print(string[0])
