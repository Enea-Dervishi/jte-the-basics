void call() {
    podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
    ]) {
        node(POD_LABEL) {
            stage('Build a Maven project'){
                container('maven') {
                    stage('Build a Maven project') {
                        sh 'mvn -B clean install'
                    }
                }
            }
        }
    }
}

