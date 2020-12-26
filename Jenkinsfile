pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh 'mvn -B package --file web/pom.xml'
      }
    }
    post {
       always {         
           pushplus (
               "你的群组编码"
           )            
       }
   }
  }
  tools {
    maven 'M3'
  }
}
