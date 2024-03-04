void call() {
    node {
            stage('Checkout') {
                steps {
                    sh 'git checkout https://github.com/jenkinsci/kubernetes-plugin.git'
                }
            }
        }
    }
}
