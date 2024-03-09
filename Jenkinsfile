pipeline{
    agent any
    agent{
        docker{
            image 'node:16-alpine'
        }
    }
    stages{
        stage('build'){
            steps{
                sh "ipconfig"
            }
        }
    }
}