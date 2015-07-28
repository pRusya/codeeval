import re
import sys

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    for line in lines:
        coord = re.split(' ', line.strip())
        coord = list(map(int, coord))
        if coord[2]==coord[0] and coord[3]==coord[1]:
            print('here')
        elif coord[2]==coord[0] and coord[3]>coord[1]:
            print('N')
        elif coord[2]>coord[0] and coord[3]==coord[1]:
            print('E')
        elif coord[2]==coord[0] and coord[3]<coord[1]:
            print('S')
        elif coord[2]<coord[0] and coord[3]==coord[1]:
            print('W')
        elif coord[2]>coord[0] and coord[3]>coord[1]:
            print('NE')
        elif coord[2]>coord[0] and coord[3]<coord[1]:
            print('SE')
        elif coord[2]<coord[0] and coord[3]<coord[1]:
            print('SW')
        else: #coord[2]<coord[0] and coord[3]>coord[1]
            print('NW')