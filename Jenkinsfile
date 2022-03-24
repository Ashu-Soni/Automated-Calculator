pipeline{
    agent any
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
}