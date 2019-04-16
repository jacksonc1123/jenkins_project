pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd ./jenkins && mvn clean install'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                def scannerHome = tool 'SonarQube Scanner 2.8';
                withSonarQubeEnv('SonarQube-Jenkins') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }
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