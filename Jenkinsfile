pipeline {
    agent any

    tools {
        maven 'Maven_3.9.11'   // your maven installation name in Jenkins
        jdk 'Java_17'          // your jdk installation name in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/sayoojya-sv/Day_06_maven.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
