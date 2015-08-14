import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    d = [['ONE HUNDRED', 100.00],
         ['FIFTY', 50.00],
         ['TWENTY', 20.00],
         ['TEN', 10.00],
         ['FIVE', 5.00],
         ['TWO', 2.00],
         ['ONE', 1.00],
         ['HALF DOLLAR', 0.50],
         ['QUARTER', 0.25],
         ['DIME', 0.10],
         ['NICKEL', 0.05],
         ['PENNY', 0.01]]
    for line in lines:
        money = re.split(';', line.rstrip())
        diff = float(money[1]) - float(money[0])
        rest = []
        if diff < 0:
            print('ERROR')
        elif diff == 0:
            print('ZERO')
        else:
            while diff > 0:
                for x, y in d:
                    if diff >= y:
                        rest.append(x)
                        diff = float('{:.2f}'.format(diff - y))
                        break
            print(','.join(x for x in rest))
