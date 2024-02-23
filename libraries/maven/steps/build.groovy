void call() {
    stage("Maven: Build") {
        ssh 'mvn clean verify'
    }
}