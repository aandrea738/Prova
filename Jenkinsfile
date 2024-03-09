pipeline{
    agent any
    stages{
        stage('build'){
            steps{
                // Scarica ed esegui lo script di installazione di Google Cloud SDK
                sh 'curl https://sdk.cloud.google.com | bash'

                // Aggiungi il percorso di Google Cloud SDK al tuo file di profilo
                sh 'echo "source $HOME/google-cloud-sdk/path.bash.inc" >> $HOME/.bashrc'
                sh 'echo "source $HOME/google-cloud-sdk/completion.bash.inc" >> $HOME/.bashrc'

                // Carica il profilo corrente per rendere effettive le modifiche
                sh 'source $HOME/.bashrc'
                echo "Google Cloud SDK è stato installato con successo!"
            }
        }
    }
}