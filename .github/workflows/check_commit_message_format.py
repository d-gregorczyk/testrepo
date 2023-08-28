import re
import sys

from git import Repo


def eprint(*args, **kwargs):
    print(*args, file=sys.stderr, **kwargs)


repo = Repo(".")
git = repo.git
output = git.rev_list("--ancestry-path", "origin/master.." + sys.argv[1])
found_invalid_commit_messages = False

for git_hash in output.split():
    commit_message = git.log("-1", "--pretty=format:%s", git_hash)
    if re.search('^#\\d+\\s.+', commit_message) is None:
        eprint("Commit {} does not contain a valid commit message. Please fix before merge".format(git_hash))
        eprint("Commit message format: '#<issue-id> <text>'")
        found_invalid_commit_messages = True

if found_invalid_commit_messages:
    sys.exit(1)
