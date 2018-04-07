
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
stage('print environment') {
	steps{
		echo '=============================='
		sh 'env'
		echo '=============================='
	}
}	

stage('Ansible pong'){

steps{

sh '/usr/local/bin/ansible-playbook -vvvvv -i ansible/inventory/hosts ansible/playbooks/deploy-code.yml' 

}
}


}  



	post {

		always {
			archiveArtifacts artifacts: 'dist/*.jar' , fingerprint: true
		}
	}

  }


