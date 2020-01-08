pipeline {
  agent {
    label 'maven'
  }
  environment {
    CODECOV_TOKEN = credentials('common-model-codecov-token')
  }
  tools {
    jdk 'jdk8'
    maven 'm3'
  }
  stages {
    stage('Tools') {
      steps {
        sh 'java -version'
        sh 'mvn -B --version'
      }
    }
    stage('Test') {
      when {
        not {
          branch 'feature/*'
        }
      }
      steps {
        sh 'mvn -B clean test'
      }
      post {
        always {
          junit '**/surefire-reports/*.xml'
          jacoco(
              execPattern: '**/coverage-reports/*.exec'
          )
        }
      }
    }
    stage('Deploy') {
      when {
        anyOf {
          branch '1.1.develop'
          branch '1.1.master'
        }
      }
      steps {
        sh 'mvn -B -P deploy clean deploy'
      }
    }
    stage('Site') {
      when {
        anyOf {
          branch '1.1.develop'
          branch '1.1.master'
        }
      }
      steps {
        sh 'mvn -B site-deploy'
      }
    }
    stage('Deploy Feature') {
      when {
        branch 'feature/*'
      }
      steps {
        sh 'mvn -B -P feature,allow-features clean deploy'
      }
      post {
        always {
          junit '**/surefire-reports/*.xml'
          jacoco(
              execPattern: '**/coverage-reports/*.exec'
          )
        }
      }
    }
  }
}