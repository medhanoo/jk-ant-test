
pipeline {

agent any

  stages {
  
    stage('build'){
    
      steps
      
      {
      
        sh 'ant -v -f build.xml'
      }
    
    
    }
      stage('run code'){
    
      steps
      
      {
      
        sh 'java -jav dist/Main.jar 10'
      }
    
    
    }
  

  
  }

}

