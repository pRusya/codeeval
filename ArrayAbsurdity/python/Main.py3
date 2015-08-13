import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        li = re.sub('.*;', '', line.rstrip())
        li = re.split(',', li)
        s = set(li)
        for x in s:
            del li[li.index(x)]
        print(li[0])
