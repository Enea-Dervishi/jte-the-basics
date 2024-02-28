libraries {
    maven
    git
    sonarqube
    splunk {
        afterSteps = [ "static_code_analysis", "unit_test"  ]
    }
}
stages {
    continuous_integration {
        build
        static_code_analysis
    }
    stage('log version info') {
      steps {
        sh 'mvn --version'
        sh 'mvn clean install'
      }
    }
}