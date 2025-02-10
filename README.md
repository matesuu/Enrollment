# The Enrollment Group Project Implementation for Group 6 (CS401-02)


If you are unfamiliar to git or Github, here is a list of steps to start!


                                                                    1. Getting Started


Assuming you have git installed (if not then refer to https://git-scm.com/book/en/v2/Getting-Started-Installing-Git),
start by typing in the following commands in your terminal application:

    git clone https://github.com/matesuu/Enrollment.git

This will will clone our project onto your local device. For this project, we will be pushing all changes to a secondary branch called "feature". This is because it will allow us to add changes to a test branch for the sake of unit testing before we merge our final changes into our projects "main" branch. Type:

    git checkout -b feature

                                                                    2. Adding and Pushing Changes

To push all changes that you have made to your files (be careful before pushing!) type the following:

    git add . --all
    git commit -m "<ENTER A COMMIT MESSAGE HERE>"
    git push -u origin feature

After this, you should see all changes made to your files on the most recent commit to the "feature" branch.
If an error message along the lines of "could not push refs", type the following:

    git pull --rebase origin feature

This should fix the issue.

                                                                    3. Pulling from Branches

Pulling is the act of getting the latest changes from a branch into your local folder repository. Type the following to pull

    git pull origin feature


                                                                    4. Merging with Main

When your code has been TESTED AND WORKS, we will then push the changes made onto our "feature" branch with our "main" branch.

    git checkout main
    git pull origin feature
    
    git add . --all
    git commit -m "<ENTER A COMMIT MESSAGE HERE>"
    git push -u origin main

This will then cause the changes to appear onto our "main" branch and will be apart of the actual source code for our projects' final submission.


Hopefully this helps a bit. Please let me know if you have any further questions or suggestions regarding the project!







