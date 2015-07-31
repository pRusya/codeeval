import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = [int(n) for n in line.rstrip()]
        n = sum([x**len(e) for x in e])
        if str(n)==line.rstrip():
            print(True)
        else:
            print(False)
