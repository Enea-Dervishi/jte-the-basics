void call(Map args) {
    node {
        stage('Checkout'){
            actions = [
                "checkout": { branch ->
                    sh "git checkout 'https://github.com/jenkinsci/kubernetes-plugin.git'" }
            ]
        }
    }
}