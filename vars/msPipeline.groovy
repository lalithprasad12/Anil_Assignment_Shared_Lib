
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
        lalith_static_code()
    }

     stage('Build')
    {
        lalith_build()
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
