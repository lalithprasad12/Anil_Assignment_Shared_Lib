
def call() {
    
    
node
{
     stage('Checkout')
    {
        echo "Checkout"
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'PAC1', url: 'git@github.com:lalithprasad12/Anil_Assignment.git']]])
    }

    stage('Static Code Analysis')
    {
        echo "Static Code Analysis"
    }

     stage('Build')
    {
        echo "Build the code"
        sh label: '', script: 'mvn clean install'
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

}
