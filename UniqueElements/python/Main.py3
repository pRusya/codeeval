import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = re.split(',', line.rstrip())
        e = {x for x in e}
        e = sorted(list(map(int, e)))
        print(','.join(str(x) for x in e))
