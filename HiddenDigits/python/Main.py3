import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    flag = 0
    for line in lines:
        for ch in line:
            if ch in 'abcdefghij':
                print(ord(ch)-97, end='')
                flag = 1
            elif ch in '0123456789':
                print(ch, end='')
                flag = 1
        if flag:
            print()
            flag = 0
        else:
            print('NONE')