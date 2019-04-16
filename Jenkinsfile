pipeline {
    agent any
    stages {
        stage('SonarQube Analysis') {
            def scannerHome = tool 'SonarQube Scanner 2.8';
            withSonarQubeEnv('SonarQube-Jenkins') {
            sh "${scannerHome}/bin/sonar-scanner"
            }
        }
        stage('Build') {
            steps {
                sh 'cd ./jenkins && mvn clean install'
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