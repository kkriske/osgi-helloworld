#!groovy
pipeline {
	agent any
	
	stages {
		stage('Build'){
			steps {
				sh './gradlew clean assemble'
			}
		}
		stage('Test'){
			steps {
				sh './gradlew check'
			}
		}
		
	}
}
pipeline {
stages {
  stage('SonarQube analysis') {
    // requires SonarQube Scanner 2.8+
    def scannerHome = tool 'SonarQube Scanner 2.8';
    withSonarQubeEnv('My SonarQube Server') {
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
  }
}