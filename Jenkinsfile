pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn -B package --file web/pom.xml'
      }
    }
    stage('post') {
      steps {
        pushplus {
          "001"
        }
      }
    }
  }
  tools {
    maven 'M3'
  }
}
