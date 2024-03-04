void call() {
    node {
            stage('Checkout') {
                steps {
                    sh 'git clone https://github.com/jenkinsci/kubernetes-plugin.git'
                }
            }
        }
    }

