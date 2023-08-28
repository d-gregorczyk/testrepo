import re
import sys

from git import Repo


def eprint(*args, **kwargs):
    print(*args, file=sys.stderr, **kwargs)


repo = Repo("../..")
git = repo.git
output = git.rev_list("--ancestry-path", "origin/master..{}".format(sys.argv[1]))

git_hashes = output.split()
last_wrong_commit_message = 0
for idx, git_hash in enumerate(git_hashes):
    commit_message = git.log("-1", "--pretty=format:%s", git_hash)
    if re.search('^#\\d+\\s.+', commit_message) is None:
        eprint("Commit {} does not contain a valid commit message. Please fix before merge".format(git_hash))
        eprint("Message: {}".format(commit_message))
        eprint("Commit message format: '#<issue-id> <text>'")
        eprint("")
        last_wrong_commit_message = idx

if last_wrong_commit_message > 0:
    eprint("Use the following commands to perform a change locally:")
    eprint("1. $ git rebase -i HEAD~{}".format(last_wrong_commit_message + 1))
    eprint("2. In the commit file list, replace 'pick' with 'reword' before each message that needs to be changed.")
    eprint("3. Save and close the commit list file.")
    eprint("4. In each resulting commit file, type the new commit message, save the file, and close it.")
    eprint("5. $ git push --force-with-lease origin {}".format(sys.argv[1]))
    sys.exit(1)
