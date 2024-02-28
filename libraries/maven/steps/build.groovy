void call() {
    agent { docker { image 'maven:3.3.3' } }
    stage('log version info') {
        steps {
            script {
                def mavenVersion = sh(script: 'mvn --version', returnStdout: true).trim()
                println "Maven version: $mavenVersion"
                sh 'mvn clean install'
            }
        }
    }
}