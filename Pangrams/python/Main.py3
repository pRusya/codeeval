import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        d = 'abcdefghijklmnopqrstuvwxyz'
        for x in line.rstrip().lower():
            if x in d:
                d = re.sub(x, '', d)
        print(d if len(d)>0 else 'NULL')
