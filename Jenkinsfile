pipeline {
    agent any

    stages {
        stage('Install Python and Google Cloud SDK') {
            steps {
                script {
                    sh 'apk update'
                    sh 'apk add python3'
                    sh 'curl https://sdk.cloud.google.com | bash'
                    sh 'echo "source $HOME/google-cloud-sdk/path.bash.inc" >> $HOME/.bashrc'
                    sh 'echo "source $HOME/google-cloud-sdk/completion.bash.inc" >> $HOME/.bashrc'
                    sh 'source $HOME/.bashrc'
                    sh 'gcloud components install kubectl'
                    echo "Python and Google Cloud SDK installed successfully!"
                }
            }
        }
    }
}
