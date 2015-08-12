import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        digits = re.sub('\s.*', '', line.rstrip())
        a = re.sub('.*?\s([a-z]+).*', r'\1', line.rstrip())
        x = re.sub('^(\d{%d}).*' % len(a), r'\1', digits)
        y = re.sub('^\d{%d}(.*)' % len(a), r'\1', digits)
        if '-' in line:
            print(int(x) - int(y))
        else:
            print(int(x) + int(y))
