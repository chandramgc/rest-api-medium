# remgit.sh
# Creates a remote git repository from the current local directory

# Configuration
# Replace SSH_USERNAME, SSH_HOST, SSH_GIT_PATH with your details
USER=chandramgc1991
USEREMAIL=chandramgc@gmail.com
HOST=github.com
GIT_PATH=chandramgc1991

REPO=${PWD##*/}
GIT_REMOTE_URL=https://$HOST/$USER/$REPO.git

echo "-------------------------------------------"
echo "------ Building New Git Repository --------"
echo "-------------------------------------------"

# Setup remote repo

echo "--"
echo "-- Creating bare remote repo at:"
echo "-- https://$HOST/$USER/$REPO.git"
echo "--"

#ssh $USER@$HOST 'mkdir '$GIT_PATH'/'$REPO' && cd '$GIT_PATH'/'$REPO' && git --bare init && git --bare update-server-info && cp hooks/post-update.sample hooks/post-update && chmod a+x hooks/post-update && touch git-daemon-export-ok'

# Configure local repo

echo "--"
echo "-- Initializing local repo & pushing to remote"
echo "--"

touch .gitignore
git config --global user.name $USER
git config --global user.email $USEREMAIL
git init
git add *
git commit -m 'initial commit'
#git push --all $GIT_REMOTE_URL
git remote add origin $GIT_REMOTE_URL
#git remote add origin https://github.com/chandramgc1991/rest-api-medium.git
#git config branch.master.remote origin
#git config branch.master.merge refs/heads/master
#git fetch
#git branch --unset-upstream
#git remote set-url origin $GIT_REMOTE_URL
git remote -v
git push -u origin master
#git merge master
#git branch -a

echo "--"
echo "-- Your new git repo '$REPO' is ready and initialized at:"
echo "-- https://$HOST/$USER/$REPO.git"
echo "--"