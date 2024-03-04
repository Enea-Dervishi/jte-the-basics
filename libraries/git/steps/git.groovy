void call() {
    node {
        podTemplate(containers: [
            containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
        ]) {
            stage('Checkout') {
                container('maven') {
                    sh 'git clone https://github.com/jenkinsci/kubernetes-plugin.git'
                }
            }
        }
    }
}
