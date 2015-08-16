import sys
import re

d = {'(': ')',
     '{': '}',
     '[': ']'}

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    counter = 1
    for line in lines:
        flag = True
        counter += 1
        line = line.rstrip()
        if len(line) % 2 != 0 or \
                line[0] not in d.keys() or \
                line[-1] not in d.values():
            flag = False
        else:
            while True:
                x = len(line)
                for e in d.keys():
                    line = line.replace(e+d[e], '')
                if x == len(line):
                    flag = False
                    break
                if len(line) == 0:
                    break
        print(flag)
