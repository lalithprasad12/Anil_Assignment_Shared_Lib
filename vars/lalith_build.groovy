def call() {
  
  echo "Build the code"
  sh label: '', script: 'mvn clean install'

  
}
