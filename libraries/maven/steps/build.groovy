void call() {
    podTemplate(
        containers: [
            containerTemplate(name: 'maven', image: 'maven:3.9-eclipse-temurin-21', ttyEnabled: true, command: 'cat')
        ]
    ) {
        def extWorkspace = exwsAllocate 'disk1'
        node(POD_LABEL) {
            exws(extWorkspace){
            container('maven') {
                stage('Build a Maven project') {
                    sh 'mvn -B -ntp clean install'
                }
            }
            }
        }

        /*stage('Get a Golang project') {
            git url: 'https://github.com/hashicorp/terraform.git', branch: 'main'
            container('golang') {
                stage('Build a Go project') {
                    sh '''
                    mkdir -p /go/src/github.com/hashicorp
                    ln -s `pwd` /go/src/github.com/hashicorp/terraform
                    cd /go/src/github.com/hashicorp/terraform && make
                    '''
                }
            }
        }
        }*/
    }
}
