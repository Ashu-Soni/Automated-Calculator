pipeline{
    agent any
    environment {
        MAVEN_HOME="/Users/ashutoshsoni/.jenkins/tools/hudson.tasks.Maven_MavenInstallation/maven"
        PATH = "$MAVEN_HOME/bin:$PATH"
    }
    stages {
        stage('Clone GitHub Repository') {
            steps {
                sh 'git clone https://github.com/Ashu-Soni/Automated-Calculator.git'
            }
        }
        stage('Test'){
            steps {
                dir('Automated-Calculator'){
                    sh 'mvn clean test'
                }
            }
        }
        stage('Build'){
            steps {
                dir('Automated-Calculator'){
                    sh 'mvn install'
                }
            }
        }
        stage('Deploy'){
            steps {
                sh 'ls -r'
            }
        }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
    }
}