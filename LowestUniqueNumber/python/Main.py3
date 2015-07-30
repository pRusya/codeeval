import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        data = re.split(' ', line.rstrip())
        a = list(map(int, data))
        b = {x for x in a}
        [a.remove(x) for x in b]
        a = {x for x in a}
        [b.remove(x) for x in a]
        if len(b)>0:
            print(data.index(str(sorted(b)[0]))+1)
        else:
            print(0)
