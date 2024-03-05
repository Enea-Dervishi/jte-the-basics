void call() {
    agent {
        node {
            label 'git checkout'
            stage('checkout') {
                steps {
                    script {
                       checkout scmGit(
    branches: [[name: 'master']],
    userRemoteConfigs: [[url: 'https://github.com/jenkinsci/kubernetes-plugin.git']])
                    }
                }
            }
        }
    }
}
