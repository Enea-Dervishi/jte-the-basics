libraries {
    maven
    sonarqube
    ansible
    splunk {
        afterSteps = [ "static_code_analysis", "unit_test"  ]
    }
}
stages {
    continuous_integration {
        build
        static_code_analysis
    }
}