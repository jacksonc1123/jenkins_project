pipeline {
    // agent { 
    //     docker { 
    //         image 'maven:3.3.3' 
    //     } 
    // }
    agent any
    stages {
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