import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    d = {'one': '1',
         'two': '2',
         'three': '3',
         'four': '4',
         'five': '5',
         'six': '6',
         'seven': '7',
         'eight': '8',
         'nine': '9',
         'zero': '0'}
    for line in lines:
        words = re.split(';', line.rstrip())
        print(''.join([d[word] for word in words]))
