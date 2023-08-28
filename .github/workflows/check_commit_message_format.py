import os
import sys
from git import Repo

# os.system('git fetch origin')
# os.system('git checkout master')
# os.system('git pull')
# os.system('git checkout ' + sys.argv[1])
# os.system('git rev-list --ancestry-path master..' + sys.argv[1])
# output = os.popen('git rev-list --ancestry-path master..' + sys.argv[1]).read()

# for git_hash in output.split():
#     print(git_hash)

repo = Repo(".")
git = repo.git
git.fetch("origin")
git.checkout("master")
git.checkout(sys.argv[1])
output = git.rev_list("--ancestry-path", "master.." + sys.argv[1])
for git_hash in output.split():
    print(git_hash)
