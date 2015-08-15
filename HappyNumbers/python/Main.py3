import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        flag = 1
        n = line.rstrip()
        s = set()
        while True:
            temp = []
            for x in n:
                temp.append(int(x)**2)
            n = str(sum(x for x in temp))
            if n == '1':
                flag = 1
                break
            elif n in s:
                flag = 0
                break
            else:
                s.add(n)
        print(flag)
