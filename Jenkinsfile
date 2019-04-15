pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post {
        failure {
            sh "echo 'failed to build'"
        }
        success {
            sh "echo 'build passed'"
        }
    }
}