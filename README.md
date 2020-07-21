## iTechMavenProject
## Maven - Build,Pack,Manage Dependency
## CountrySearch
* Used to find the country details getting input parameter as country code
* **mvn clean package** run this command where pom.xml is located. It will generate a jar file in target folder.
* Non executable jar - since it does not have Main class.
* If you give **mvn clean package**, Maven by default generates jar in target folder. In pom.xml no need to specify jar plugin.

## CountryProject
* This project is an example for invoking other project as a dependency jar.
* This project contains a Main class which is invoking the class CountryFinder in CountrySearch Project to get the details of the country.
* In pom.xml specify other project whichever you want to include as a dependency. For example
```xml
 <dependencies>
        <dependency>
            <groupId>com.iamgirupa</groupId>
            <artifactId>CountrySearch</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
```
* We need to include, **maven-shade-plugin** to specify other project as dependencies


## How to run this project
* **mvn clean install**
* **java -jar target/CountryProject-1.0-SNAPSHOT**

## Git push and pull commands
* create a repository in github
### To make your project as a git
* Initialize as a git directory by running this command **git init**
### Create .gitignore file
* This file ignores whatever you don't want to track
### To Track the files you have to add
* **git add .**
### Commit 
* **git commit -m "commit message"**
### You can view the status of your files which is tracked
* **git status**
### You can view the commit history
* **git log**
### To configure your git account for the first time
* git config --global user.name "your username"
* git config --global user.email "your mail ID"
### Connect to your github account
* git remote add origin https://github.com/GirupaShankari/iTechMavenProject/
### Push your code into github repository
* **git push -u origin master** or **git push -f origin master**
### Pull your code from github repository
* **git pull origin master**
