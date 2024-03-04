void call() {
    agent {
        node {
            label 'git checkout'
            stage('checkout') {
                steps {
                    script {
                        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/jenkinsci/kubernetes-plugin.git']]])
                    }
                }
            }
        }
    }
}
