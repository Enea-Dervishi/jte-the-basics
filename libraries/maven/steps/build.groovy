void call() {
    agent { docker { image 'maven:3.3.3' } }
    stage('log version info') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
}