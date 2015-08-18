import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        string = []
        flag = 1
        for ch in line.rstrip():
            if ch.isalpha():
                if flag:
                    string.append(ch.upper())
                    flag = 0
                else:
                    string.append(ch)
                    flag = 1
            else:
                string.append(ch)
        print(''.join(e for e in string))
