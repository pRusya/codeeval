import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        seq = re.split(' ', line.rstrip())
        counter = 1
        for i in range(0, len(seq)):
            if i == len(seq)-1:
                if seq[i] == seq[i-1]:
                    print(counter, seq[i])
                else:
                    print(1, seq[i])
            else:
                if seq[i] == seq[i+1]:
                    counter += 1
                else:
                    print(counter, seq[i], end=' ')
                    counter = 1
