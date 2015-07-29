import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        words = re.split("[^a-zA-Z]+", line)
        print(' '.join(words).strip().lower())
