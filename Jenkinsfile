pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
    post {
        failure {
            echo 'Build failed'
        }
        success {
            echo 'build passed'
        }
    }
}