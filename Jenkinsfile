pipeline{
    agent any
    environment {
        MAVEN_HOME="/Users/ashutoshsoni/.jenkins/tools/hudson.tasks.Maven_MavenInstallation/maven"
        PATH = "$MAVEN_HOME/bin:$PATH"
    }
    stages {
        stage('Clone GitHub Repository') {
            steps {
                git url: 'https://github.com/Ashu-Soni/Automated-Calculator.git', branch: 'master',
                 credentialsId: '8fda2e29-a4fb-4ab7-a277-452f7d43c7da'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn install'
                sh 'cp ./target/Automated-Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./application.jar'
            }
        }
        stage('Docker Build and Push'){
            steps {
                sh 'docker build -t ashu07soni/auto_calculator .'
                sh 'docker push ashu07soni/auto_calculator'
            }
        }
//         stage('Ansible Deploy') {
//              steps {
//                   ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy.yml'
//              }
//         }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
    }
}