pipeline {
	agent any
	stages {
		stage("build") {
			when {
				expression {
					env.CODE_CHANGES == true
				}
			}
			steps {
				echo 'Building the application...'
			}
		}
		stage("test") {
			steps {
				echo 'Testing the application...'
			}
		}
		stage("deploy") {
			when {
				expression {
					env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
				}
			}
			steps {
				echo 'Deploying the application...'
			}
		}
	}
}