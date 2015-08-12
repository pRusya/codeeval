from itertools import product
import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        data = re.split(',', line.rstrip())
        s = {''.join(x) for x in product(data[1], repeat = int(data[0]))}
        print(','.join(x for x in sorted(s)))
