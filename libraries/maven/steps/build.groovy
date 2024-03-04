void call() {
    podTemplate(containers: [
        containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
    ]) {
        node {
            label 'build-maven'
            stage('mavenbuild') {
                steps{
                container('maven') {
                    ('build') {
                        sh 'mvn -B clean install'
                    }
                }
                }
            }
        }
    }
}
