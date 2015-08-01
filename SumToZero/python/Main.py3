import sys
import re
from itertools import combinations

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = re.split(',', line.rstrip())
        e = list(map(int, e))
        e = list(combinations(e, 4))
        print(sum(1 for x in e if sum(x)==0))
