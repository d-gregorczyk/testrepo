import os
import sys

os.system('git fetch')
output = os.popen('git log --left-right --graph --cherry-mark --oneline master...' + sys.argv[1]).read()
print(output)
