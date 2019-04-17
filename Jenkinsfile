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
                // script {
                //     def scannerHome = tool 'SonarQube Scanner 2.8'
                //     withSonarQubeEnv('Local SonarQube') {
                //         sh "${scannerHome}/bin/sonar-scanner"
                //     }
                // }
                sh 'cd ./jenkins && mvn sonar:sonar'
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