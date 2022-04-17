# Automated-Calculator

## Problem Statement

###Scientific Calculator with DevOps		

Create a scientific calculator program with user menu driven operations:
- Square root function - √x
- Factorial function - x!
- Natural logarithm (base е) - ln(x)
- Power function - xb

Create the DevOps automation pipeline on the top of the above development that helps to integrate and deploy the application in a continuous manner.


### Tools/Technology used

- Development Language - Java
- Unit Testing Library - Junit
- Centralized Version Control System - Git
- Source Code Management - GitHub
- Package Builder - Maven
- Containerization - Docker/Docker Hub
- Configuration Management - Ansible
- Continuous Integration/Continuous Deployment - Jenkins
- Continuous Monitoring - ELK

### Solution Approach

We developed a scientific calculator as a small project to better understand the concepts of source control, continuous integration, and deployment.		

This cycle entails creating a simple calculator with functions such as square root, natural log, power, and factorial and we will be delivering the whole application continuously. We are using the git/github for version control and source code management, maven package builder for package manager, docker for containerization and ansible for configuration management(basically deploying the image in the remote machine). All procedures mentioned above will be managed through the Jenkins(CI/CD tool) as Jenkins helps to automatically integrate new changes in the existing application and deploy them in a very efficient way. Briefly above the jenkins pipeline, it contains the steps like cloning the repository, perform unit testing and building using maven, dockerize the application using docker and deploy the image using ansible.


