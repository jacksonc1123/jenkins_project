pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd ./jenkins && mvn clean install dockerfile:build'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    def scannerHome = tool 'SonarQube Scanner 2.8'
                    withSonarQubeEnv('Local SonarQube') {
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
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