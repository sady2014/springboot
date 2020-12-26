pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn -B package --file web/pom.xml'
      }
    }
  }
  tools {
    maven 'M3'
  }
}
