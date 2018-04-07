
pipeline {

agent {
	label 'home'
}

environment {
MSG = "PiplelineVariable"

}

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
}  


	post {

		always {
			archiveArtifacts artifacts: 'dist/*.jar' , fingerprint: true
		}
	}

  }


