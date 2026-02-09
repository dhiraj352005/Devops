pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                echo "Building application..."
                sh 'javac Hello.java'
            }
        }

        stage('Test') {
            steps {
                echo "Testing application..."
                sh 'java Hello'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
                echo "Deployment Successful!"
            }
        }
    }

    post {
        success {
            echo "Pipeline executed successfully!"
        }
        failure {
            echo "Pipeline failed!"
        }
    }
}
