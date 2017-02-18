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

node {
	checkout scm
	stage('SonarQube analysis') {
		// requires SonarQube Scanner 2.8+
		//def scannerHome = tool 'SonarQube Scanner 2.8';
		withSonarQubeEnv('Sonar') {
			//sh "${scannerHome}/bin/sonar-scanner"
			sh './gradlew sonarqube'
		}
	}
}