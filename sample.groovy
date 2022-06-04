pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Have A Good Day'
            }
        }
    }
}
