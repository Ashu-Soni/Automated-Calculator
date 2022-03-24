pipeline{
    agent any
    environment {
        MAVEN_HOME="/opt/maven"
        PATH = "$MAVEN_HOME/bin:$PATH"
    }
    stages {
        stage('Clone GitHub Repository') {
            steps {
                sh 'git clone https://github.com/Ashu-Soni/Automated-Calculator.git'
                sh 'cd Automated-Calculator'
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
            }
        }
//         stage('Deploy'){
//         }
    }
    post {
        always {
            echo 'One way or another, I have finished'
            deleteDir() /* clean up our workspace */
        }
    }
}