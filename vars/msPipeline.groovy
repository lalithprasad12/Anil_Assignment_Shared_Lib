

node
{

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
