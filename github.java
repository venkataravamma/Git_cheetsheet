GIT COMMANDS
============
1.mkdir project
2.git init 				-> Intilization of git
3.ls -a					-> show hidden files
4.ls .git 				-> To see inside .git
5.touch name.txt		-> To create file
6.git status			-> To check the status of files which are untracked
7.git add .				-> Adding to staging area which are untracked
8.git add names.txt 	-> Adding specific file to staging area
9.git commit -m "names file added" -> file commited in local repository
10.vi names.txt			-> To made changes inside file
11.cat names.txt 		-> To read content inside of the file
12.git restore --staged names.txt ->Remove from staging area
13.git log 				-> To see the entire history of commits
14.rm -rf names.txt		-> Remove file
15.git reset commitId	-> To go back to particular commit and top of commits will be removed
13.git stash			-> When file added to staging area but don't want to commit. Whenver i want i will take this changes into account.go to backstage
14.git stash pop 		-> Come back from backstage to unstaging area
15.git stash clear 		-> To clear backstage files
16.git remote add origin url -> adding github repository urls to git
17.git remote -v 		-> Its shows urls attached to the folder
18.git push origin master -> pushing to github
19.git branch  feature	->Created  sub branch
20.git checkout feature  ->head pointing to sub branch like switch
21.git checkout mail	->head pointing to main
22.git merge feature	->merging sub branch code
23.fork				    ->copy project from communtity where you don't have access to your own account
24.git clone url		->downloading the folder into your local for do code changes
25.git remote add upstream url-> From where you have forked this project that is known as upstream url by convention
26.git push origin feature     ->pushing to sub branch ,we have access.
27.git push origin feature -f  ->force push,when github does  contain commit that don't have in local
28.git  fetch --all  --prune  =>fetch all changes 
29.git reset --hard upstream/main  => reset the main branch of origin to  the main brnch of upstream branch
30.git push origin feature
31.git pull upstream main
32.git push origin main
33.git  rebase -i		pick<=s(squash)	 squash commits merged to pick	=>merge all commits into one
34:esc:x 						-> To give commit msg to rebase
35.git reset --hard				->to remove merged commits