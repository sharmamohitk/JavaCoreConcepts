# JavaCoreConcepts
create a new repository on the command line
1. go to project folder on your machine
2. git init  // it will mark your folder as a git repository and it will be a local repository
3. git add *  // here you are adding all the files for stagging i.e. these are the files which we will commit in local repository
4. git commit -m "first commit"  // here we have commit the changes from stage to local repository and now we can add these changes to remote repository
5. git remote add origin https://github.com/sharmamohitk/JavaCoreConcepts.git  // here we are made a link / adding a remote repository with local repository
6. git push -u origin master  // all the changes available in local repository will be added/commit to remote repository


// working with branch

push an existing repository from the command line

1. git checkout branch_name // here you will swith branch respective to your master branch
2. git branch <test-core-concepts> // it will either swith/create new branch 
3. git add * // here you are adding all the files for stagging i.e. these are the files which we will commit in local repository
4. git commit -m "test commit branch" // here we have commit the changes from stage to local repository and now we can add these changes to remote repository
5. here you are working on branch so you need to set the upstream
6. git remote add origin https://github.com/sharmamohitk/JavaCoreConcepts.git // here we are setting the upstream of current branch
1. git push -u origin  test-core-concepts // now we can push changes to branch as we have set the master

now you want to merge the branch changes to master branch or other branch to current branch
1. git checkout master  // first we moves to here master branch
2. git merge test-core-concepts  // here master branch will be merged with branch named test-core-concepts
// if there is any conflict then you need to resolve those conflicts
// now you are on master branch so you can simple commit
3. git push origin master


// some useful commands
1. git status // tell the current status
2. git branch // current all branch name while highlighting the branch you are working upon