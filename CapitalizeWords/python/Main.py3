import sys
import re
from itertools import combinations

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        words = re.split(' ', line.rstrip())
        for word in words:
            print(word[0].upper(), word[1:], end=' ', sep='')
        print()
