To create accounts project

Create E:\dev\keithsjohnson\accounts Directory
gradle init --type java-library

In Eclipse -> File >- Import... -> Gradle -> Gradle Project

In E:\dev\keithsjohnson\accounts Directory
git init

git remote add origin https://github.com/keithsjohnson/accounts.git

git add .

git commit -a -m "Initial commit"

In Chrome https://github.com/keithsjohnson
Create Repository accounts

git push -u origin --all

to get Git support in Eclipse
- Delete project from Eclipse (without deleting from disk)
- In Eclipse -> File >- Import... -> Gradle -> Gradle Project 

Make sure .gradle and build directories are in .gitingnore and contain nothing when committing and pushing to github.
