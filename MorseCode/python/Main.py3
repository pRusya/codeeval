import sys
import re

with open(sys.argv[1], 'r') as file:
    lines = file.readlines()
    d = {'.----': '1',
         '..---': '2',
         '...--': '3',
         '....-': '4',
         '.....': '5',
         '-....': '6',
         '--...': '7',
         '---..': '8',
         '----.': '9',
         '-----': '0',
         '.-': 'A',
         '-...': 'B',
         '-.-.': 'C',
         '-..': 'D',
         '.': 'E',
         '..-.': 'F',
         '--.': 'G',
         '....': 'H',
         '..': 'I',
         '.---': 'J',
         '-.-': 'K',
         '.-..': 'L',
         '--': 'M',
         '-.': 'N',
         '---': 'O',
         '.--.': 'P',
         '--.-': 'Q',
         '.-.': 'R',
         '...': 'S',
         '-': 'T',
         '..-': 'U',
         '...-': 'V',
         '.--': 'W',
         '-..-': 'X',
         '-.--': 'Y',
         '--..': 'Z'}
    for line in lines:
        words = re.split('\s\s', line.rstrip())
        for word in words:
            letters = re.split('\s', word)
            print(''.join([d[letter] for letter in letters]), end=' ')
        print()
