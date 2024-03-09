pipeline {
    agent any

    environment {
        CLOUDSDK_CORE_DISABLE_PROMPTS = '1'
    }

    stages {
        stage('Install Python and Google Cloud SDK') {
            steps {
                script {
                    sh 'apt-get update -y'
                    sh 'apt-get install -y python3'

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
