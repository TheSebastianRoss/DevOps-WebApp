pipeline {

	agent any
	
	parameters {
		booleanParam(name: 'executeTests', defaultValue: true, description: 'Whether to execute or skip tests')
	}
	
	tools {
		maven 'Maven'
	}
	
	stages {
	
		stage("build") {
		
			steps {
				echo 'Building the application...'
			}
		}
		
		stage("test") {
		
			when {
			
				expression {
					
					params.executeTests == true
				}
			}
			steps {
				echo 'Testing the application...'
			}
		}
		
		stage("deploy") {
		
			steps {
				echo 'Deploying the application...'
			}
		}
	}
}