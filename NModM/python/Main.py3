import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = re.split(',', line.rstrip())
        e = list(map(int, e))
        if e[0] < e[1]:
            print(e[0])
        else:
            print(e[0] - e[1] * int(e[0] / e[1]))
