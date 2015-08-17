import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        words = list(re.split('\s', e) for e in re.split('(0+\s0+)\s', line.rstrip()) if e != '')
        for e in words:
            if e[0] == '00':
                e[1] = '1'*len(e[1])
        print(int(''.join(e[1] for e in words), 2))
