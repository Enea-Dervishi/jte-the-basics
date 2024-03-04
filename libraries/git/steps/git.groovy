void call() {
    podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
    ]) {
        agent {
            node(POD_LABEL) {
                label 'master'
                stages {
                    stage('Checkout') {
                        steps {
                            container('maven') {
                                sh "git clone https://github.com/jenkinsci/kubernetes-plugin.git"
                            }
                        }
                    }
                }
            }
        }
    }
}