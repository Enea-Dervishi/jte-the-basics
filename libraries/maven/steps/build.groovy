void call() {
    agent { docker { image 'maven:3.3.3' } }
    stage('logVersion') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
}