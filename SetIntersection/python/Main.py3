import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        lists = re.split(';', line.rstrip())
        list1 = re.split(',', lists[0])
        list2 = re.split(',', lists[1])
        print(','.join(str(e) for e in list1 if e in list2))
