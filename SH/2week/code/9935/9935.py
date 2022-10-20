from sys import stdin
from re import sub

r_line = stdin.readline
string = r_line().strip()
bomb_string = r_line().strip()

while bomb_string in string:
    string = sub(bomb_string, '', string)
if len(string):
    print(string)
else: print('FRULA')