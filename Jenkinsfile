pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('Build') {
            steps {
                cd ./jenkins
                mvn clean install
            }
        }
    }
    post {
        failure {
            echo 'Build failed'
        }
        success {
            echo 'Build passed'
        }
    }
}