pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Good Day'
            }
        }
    }
}
