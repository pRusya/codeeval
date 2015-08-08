import sys
import re
from itertools import combinations

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        numbers = re.sub(';.*', '', line.rstrip())
        numbers = re.split(',', numbers)
        numbers = list(map(int, numbers))
        numbers = list(combinations(numbers, 2))

        x = re.sub('.*;', '', line.rstrip())
        x = int(x)

        pairs = ';'.join( [str(e[0])+','+str(e[1]) for e in numbers if sum(e)==x])
        if len(pairs) > 0:
            print(pairs)
        else:
            print('NULL')
