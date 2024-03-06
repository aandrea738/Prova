pipeline{
    agent any
    stages{
        stage('clone'){
            git branch: 'master', url: 'https://github.com/aandrea738/Prova.git'
            stash name:'scm', includes:'*'
        }

        stage('build'){
            steps{
                unstash 'scm'
                script{
                    sh "./gradlew build"
                    echo "hello"
                }
            }
        }
    }
}