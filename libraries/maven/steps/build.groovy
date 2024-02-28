void call() {
    agent { docker { image 'maven:3.3.3' } }
    stage('logVersionInfo') {
        steps {
            script {
                def mavenVersion = sh(script: 'mvn --version', returnStdout: true).trim()
                println "Maven version: $mavenVersion"
                sh 'mvn clean install'
            }
        }
    }
}