import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = re.split(' ', line.strip())
        for ch, code in zip(e[0], e[1]):
            if code == '1':
                print(ch.upper(), end='')
            else:
                print(ch, end='')
        print()
