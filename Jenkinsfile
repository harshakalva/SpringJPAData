pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World .... '
                checkout scmGit(branches: [[name: '**']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-ssh', url: 'git@github.com:harshakalva/SpringJPAData.git']])
                echo 'Hello World Complete'
            }
        }
        stage('Build') {
            withGradle {
                gradle clean build
            }
        }
    }
}
