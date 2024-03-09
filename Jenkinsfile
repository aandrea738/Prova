pipeline {
    agent any

    environment {
        CLOUDSDK_CORE_DISABLE_PROMPTS = '1'
    }

    stages {
        stage('Install Google Cloud SDK') {
            steps {
                script {
                    sh 'curl https://sdk.cloud.google.com | bash'
                    sh 'echo "source $HOME/google-cloud-sdk/path.bash.inc" >> $HOME/.bashrc'
                    sh 'echo "source $HOME/google-cloud-sdk/completion.bash.inc" >> $HOME/.bashrc'
                    sh 'source $HOME/.bashrc'
                    sh 'gcloud components install kubectl'
                    echo "Google Cloud SDK installed successfully!"
                }
            }
        }

        // Altri stage del tuo processo di build possono seguire qui
    }

    // Altre configurazioni del tuo Jenkinsfile possono seguire qui
}
