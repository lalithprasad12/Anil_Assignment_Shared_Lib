def call() {
    
    
node
{
     stage('Checkout')
    {
        lalith_AWS_checkout()
    }

    stage('Static Code Analysis')
    {
        lalith_static_code()
    }

     stage('Build')
    {
        lalith_AWS_build()
    }

     stage('Unit Testing')
    {
        lalith_unit_test()
    }

     stage('Deploy')
    {
        lalith_deploy()
    }

}

}
