pipeline {
    agent any

    tools {
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Building the project'
                dir('CalcDmo') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests'
                dir('CalcDmo') {
                    bat 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging application'
                dir('CalcDmo') {
                    bat 'mvn package'
                }
            }
        }
    }

    post {
        success {
            echo 'Build completed successfully'
        }
        failure {
            echo ' Build failed'
        }
    }
}
