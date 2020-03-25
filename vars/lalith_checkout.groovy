def call() {

  echo "Checkout"
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'PAC1', url: 'git@github.com:lalithprasad12/Anil_Assignment.git']]])
  
}
