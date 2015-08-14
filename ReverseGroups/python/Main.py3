import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        e = re.sub(';.*', '', line.rstrip())
        e = re.split(',', e)
        n = int(re.sub('.*;', '', line.rstrip()))
        groups = [e[i:i+n] for i in range(0, len(e), n)]
        rgroups = list(list(reversed(x)) if n == len(x) else x for x in groups)
        line_list = []
        for subgroup in rgroups:
            line_list += subgroup
        print(','.join(x for x in line_list))
