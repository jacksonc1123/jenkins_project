pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('Build') {
            steps {
                sh 'python --version'
            }
        }
        stage('Deploy') {
            steps {
                sh 'python ./jenkins_project/app.py'
            }
        }
        post {
            always {
                echo 'Running jenkins_project'
            }
            success {
                echo 'Successfull'
            }
            failure {
                echo 'Failure'
            }
        }
    }
}