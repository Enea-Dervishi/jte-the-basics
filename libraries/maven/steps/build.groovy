void call() {
  podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
    ]) {
        agent {
      node(POD_LABEL) {
        label 'master'
        stages {
          stage('Build a Maven project') {
            steps {
              container('maven') {
                sh 'mvn -B clean install'
              }
            }
          }
        }
      }
        }
    }
}

