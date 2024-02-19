libraries {
    maven
    sonarqube
    ansible
    splunk {
        afterSteps = [ "static_code_analysis", "unit_test"  ]
    }
}