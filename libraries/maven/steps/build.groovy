void call() {
    stage('build') {
      docker.image("maven:3.3.3").inside{
        sh 'mvn --version && mvn clean install'
      }
    }
}