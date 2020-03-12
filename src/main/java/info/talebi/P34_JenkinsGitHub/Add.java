package info.talebi.P34_JenkinsGitHub;



/*

*** Creating A GitHub Repo and Connect it to eclipse project ***
1. Create a private repository in GitHub.
2. In Eclipse do:
	a. Right click on project >> Team >> Share project
	b. Choose an empty folder for git repository (Choose parent so the main project will be the parent of local)
	c. Select project >> finish
	d. The first time for each project do:
		i. right click on the project >> Team >> Add to Index
	e. Right click on project >> Team >> commit
		i. Give it a description and push commit button
	d. Right click on project >> Team >> push
		i. Enter GitHub repository URI
		ii. Give your GitHub username and password
		iii. click on "Preview"
		iv. Enter your password again
		v. If master already commit something then we first need to pull
		vi. We push to master
		
*** Connecting GitHub to jenkins and Run Tests after each commit ***
0. Create an application token in GitHub so Jenkins can use for private projects:
	Link: https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line
1. Create new jobs
	a. Freestyle project
	b. give it a name >> Ok
	c. Source Code Management >> Git
		i. Repository URL (From GitHub)
		ii. Crdentials >> Add >> Jenkins
			* App username, password and Add
		iii. check "Build when a change is pushed to BitBucket" so every time we push to bitbucket it will build
		==============iv. check "Delete workspace before build starts" so when several working at same time not confilict
2. NOTE COMPLETE HERE

 */

public class Add {

	public static void main(String[] args) {
		System.out.println("This is from GitHub Eclipse Test");
	}

}
