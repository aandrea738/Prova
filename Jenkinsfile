pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                dir('ci/prova'){
                    sh "docker-compose build"
                }
                sh "gcloud version"
            }
        }
    }
}