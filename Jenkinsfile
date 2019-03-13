pipeline{
    agent any
    tools {
        maven 'maven'
        jdk 'java'
 }
 stages{
    stage('checkout code'){
        steps{
            git branch: 'master',
            credentialsId: 'rohan_git',
            url: 'https://github.com/rohanjoshi95/jen.git'
        }
    }
 }
}
