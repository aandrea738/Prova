pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                sh "docker-compose build"
                sh "gcloud version"
            }
        }
    }
}