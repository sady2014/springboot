//c00ea581a9f839ca76788d0aaee23024b3cefb5c

pipeline {
  agent any
  tools {
    maven 'M3'
  }
  stages {
    stage('build') {
      steps {
        echo 'Start'
        sh 'mvn -B package --file web/pom.xml'
      }
      steps {
        echo 'Start'
        sh 'mvn -B package --file web/pom.xml'
      }
    }

  }
}
