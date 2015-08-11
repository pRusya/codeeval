import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        seq = re.sub('\s\d+$', '', line.rstrip())
        seq = re.split(' ', seq)
        ind = int(re.sub('.*\s', '', line.rstrip()))
        if ind <= len(seq):
            print(seq[-ind])
        else:
            pass
