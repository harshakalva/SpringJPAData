pipeline {
    agent any

    environment {
        scannerHome = tool 'SonarQubeScanner'
        ALL_STEPS = "SONAR" 
    }

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World .... '
                //checkout scmGit(branches: [[name: '**']], extensions: [], userRemoteConfigs: [[credentialsId: 'github-ssh', url: 'git@github.com:harshakalva/SpringJPAData.git']])
                echo 'Hello World Complete'
            }
        }

        stage('Build') {
            when { 
                environment name: "ALL_STEPS", value: "YES"
            }    
            steps {
                // withGradle {
                //     gradle clean build
                // }
                echo 'Build  .... '
            }
        }
    }
}
