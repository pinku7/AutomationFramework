pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo 'Building the application'
            }
        }
        stage('Test') { 
            steps {
                 echo 'Testing the application' 
                 mvn clean install
            }
        }
        stage('Deploy') { 
            steps {
                 echo 'Deploy the application'
            }
        }
    }
}
