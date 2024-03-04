libraries{
  git
  maven
}

stages {
    continuous_integration {
        build
        //static_code_analysis
    }
}