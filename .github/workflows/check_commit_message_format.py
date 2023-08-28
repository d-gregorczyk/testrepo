import os
import sys

os.system('git fetch origin')
os.system('git checkout master')
output = os.popen('git rev-list --ancestry-path master..' + sys.argv[1]).read()

for git_hash in output.split():
    print(git_hash)

