#!/usr/bin/groovy

def workspace

node
{
    stage('Checkout')
    {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'PAC1', url: 'git@github.com:lalithprasad12/Anil_Assignment.git']]])
        workspace=pwd()
        
    }
    
    stage('Static Code Analysis')
    {
        echo "Static Code Analysis"
    }
    
     stage('Build')
    {
        echo "Build the code"
    }
    
     stage('Unit Testing')
    {
        echo "Unit Testing"
    }
    
     stage('Deploy')
    {
        echo "Deploy the code"
    }
    
}
