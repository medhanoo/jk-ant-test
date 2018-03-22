
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
      
        sh 'java -jar dist/Main.jar 10'
      }
    
    
    }
  

    stage('deploy code'){
    
      steps
      
      {
      
        sshagent(['git']) {
          sh 'scp  git@localhost:/tmp/'
        }
      
      }
    
    
    }
  


  
  }

}

