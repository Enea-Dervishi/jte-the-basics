void call() {
            stage('mavenbuild') {
              agent { docker 'maven:3.9-eclipse-temurin-21' }
                steps{
                container('maven') {
                    ('build') {
                        sh 'mvn -B clean install'
                    }
                }
                }
            }
        }
    

