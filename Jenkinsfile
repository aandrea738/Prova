pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                sh 'curl https://sdk.cloud.google.com | bash'

                sh 'echo "source $HOME/google-cloud-sdk/path.bash.inc" >> $HOME/.bashrc'
                sh 'echo "source $HOME/google-cloud-sdk/completion.bash.inc" >> $HOME/.bashrc'

                sh 'source $HOME/.bashrc'
                echo "Google Cloud SDK è stato installato con successo!"
            }
        }
    }
}