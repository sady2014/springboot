pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn -B package --file web/pom.xml'
      }
    }

    stage('copy') {
      steps {
        sh 'cp -r ./ ~/java_repo'
      }
    }

  }
  tools {
    maven 'M3'
  }
}