import os
import sys

os.system('git fetch')
os.system('git log --left-right --graph --cherry-mark --oneline master...' + sys.argv[1])
