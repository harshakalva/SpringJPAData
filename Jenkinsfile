pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                withGradle {
                    ./gradlew build
                }
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
                withGradle {
                    ./gradlew test
                }
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
