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
print(git.fetch("origin", sys.argv[1]))
print(git.checkout(sys.argv[1]))
print(git.fetch("origin", "master"))
print(git.checkout("master"))
print(git.checkout(sys.argv[1]))
output = git.rev_list("--ancestry-path", "origin/master.." + sys.argv[1])
#output = git.rev_list("origin..HEAD")
print(git.branch())
for git_hash in output.split():
    print(git_hash)
