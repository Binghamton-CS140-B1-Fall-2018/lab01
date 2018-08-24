# lab01 - Due Tuesday, August 23 at 11:59 PM
First lab

By accepting this lab, you have made a new git "repository" (basically a collection of files all related to a single topic... in the case, lab01), that is available in the cloud.  Furthermore, git has initialized this repository with code I have provided for you.  The first step in this lab is to copy this repository from the cloud onto your local UNIX machine, a process in gitHub called "cloning" your repository.

## Cloning your Repository

To clone your repository, first find the green button above this README file named "Clone or Download". When you press that button, there is a pop-up with a URL address. Copy that URL address. Then, go to your UNIX command window, in the "cs140/src" sub-directory, and type the command:

>  git clone *URL from the Clone or Download Button*
  
When this command finishes, you should be able to do an "ls" to see a "lab01-*userid*" directory.  CD to that directory and do an "ls" to list the files in the directory. You should see several files in the directory.  

## Compiling and Running your First Java Program

The next step is to compile and test the Hello.java file. First, edit Hello.java (e.g. using the command `gedit Hello.java&`) so that you understand what it does. Once it makes sense to you, then you can try to compile and run this code.

To compile the Hello.java program, use the command: 

>  javac -d ../../classes Hello.java

Note that the Hello.java file has a statement on the first line that says "package lab01;". This causes the Hello.java file to be in the "lab01" package. When you compile, the "-d ../../classes" parameter tells the compiler to put the binary .class file in the lab01 package directory starting at the parent of the parent of the current directory. Remember that the current directory is "~/cs140/src/lab01", so the parennt of the parent of the current directory is "~/cs140/classes". Since the Hello class is in the lab01 package, that means the compiler will create "~/cs140/classes/lab01/Hello.class".) Use the UNIX "ls" command to verify that you have created the class file in the expected directory.

Now, you can run the main method in the Hello class (in the lab01 package) by running the command:

>  java -cp ../../classes lab01.Hello 
  
This command tells java to start the Java Virtual Machine (JVM) to interpret the Java byte code, and look in the class path of ../../classes (or ~/cs140/classes) for package lab01 (i.e. the lab01 sub-directory) and class Hello (i.e. the Hello.class Java byte code file) for a method called "main", and run that method. If you did everything correctly, you should get the message:

>  Hello world!
 
## Working on Savings Accounts

There is another file in the lab01 repository called "SavingsAccount.java". This file contains the Java code to model a savings account in a bank.  A savings account is opened with a starting balance, and has an interest rate. In the simplest model, there are three things you can do with this savings account - deposit more money to the savings account, withdraw money from the savings account, or let it sit for a year and accumulate interest - that interest is also added to the balance of the savings account.  

The SavingsAccount class has several methods to mimic these actions. There is a SavingsAccount method to create a new savings account, which takes parameters that define the opening balance and the interest rate. There is a deposit method that allows you to deposit more money to the account. There is an addInterest method which assumes a year has passed, and the interest for that year needs to be calculated and added to the account. (We assume that interest is based on the balance at the end of the year. Real, more complicated savings accounts manage the problem that you may have a different balance in the account at the start of the year than at the end of the year, but we are ignoring that reality to simplify our code.) There is a withdrawal method which allows you to take money out of the account - at least as long as you have enough of a balance in the account to cover the withdrawal.  It should also be possible to ask the account what the current balance is, and what the current interest rate is.  

The "SavingsAccount.java" file has ALMOST all of the code to model a savings account - but there are two pieces missing, marked by comments that start out:

    // TODO : ...
    
Your job is to replace these comments with the actual code to make the SavingsAccount class work correctly.  Once you have made those changes, look at the SavingsAccountTester.java file.  This is already coded for you, and contains a "main" function that creates a new savings account, performs various manipulations on that account, and then prints out the resulting balance.  No changes should be made to the SavingsAccountTester.java file, but please look through the code so you understand what is going on.

Compile this code by running the command "javac -d. SavningsAccount.java SavingsAccountTester.java". Then run the result (once you get a clean compile) using the command "java lab01.SavingsAccountTester".  If you made the changes correctly, you should get the following result:

  Your account has 868.875 dollars.

## Managing your Repository with git

Your code will reside in a git repository. In order to update that repository, when you want to save your changes, you should "commit" those changes to the repository.  When you do so, you should add a comment to keep track of the changes you have made.  For instance, in the cs140/labs/lab01-*userid* directory, you could use the command:

>  git commit -m "Fixed SavingsAccount first TODO"
  
 Once you commit your changes, you can also to run the command:
 
>  git push
  
This command actually copies you changes to the "cloud" so that they are available to you on a different machine.  From another machine, you can clone your repository again to get a copy on the second machine. On the second machine you can do commits and pushes as well, which will make the repository on your first machine out of date.  But if you do a "git pull" on the first machine in the repository directory, it will retreive all the changes made from the second machine, and get everything synchronized again.
  
Multiple commits make sense... it's like saving a file in case the system goes down. The more often you commit, the more likely there will be a state you can go back to, before you made a mistake.
  
## Submitting you Lab
  
Once you have finished the lab (before midnight tonight) please do a 

  git commit --allow-empty -m "Finshed lab01"
  
The "--allow-empty" flag allows you to commit and add a new commit comment even if there are no changes to the code itself. Once you have done your final commit, run the command:

  git rev-parse HEAD
  
This will cause the system to print a long hexadecimal number like:

  8680a832fb99f1389d85ecfc715c4c8a291a6d49
  
This number is a hash code that uniquely identifies this commit of this repository. If the repository changes in any way, this hash code will change as well. The hash code also gives the CA's the information they need to download that version of your repository and grade it.

To complete your submission, you must copy and paste this hash code into myCourses. Go to myCourses, select CS140-B1, and go to Content-> Lab Submissions. Select lab01, and where it says text submission, paste your commit hash (you may have to click on the "write submission" button to open up a field to paste the hash into). The CAs will only grade your submission that corresponds to the hash you submitted. You can update this as often as you like until the deadline of 11:59 PM this evening.

⚠️ You MUST submit the commit hash on myCourses before the deadline to be considered on time even if your lab is completely working before the deadline. ⚠️
