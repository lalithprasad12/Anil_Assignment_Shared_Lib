def call() {

node
	{
	     stage('Checkout')
	    {
	        echo "Checkout the code"
	    }
	

	    stage('Static Code Analysis')
	    {
	        echo "Static Analysis the code"
	    }
	

	     stage('Build')
	    {
	        echo "Build the code"
	    }
	    
	     stage('Unit Testing')
	    {
	        echo "Test the code"
	    }
	

	     stage('Deploy')
	    {
	        echo "Deploy the code"
	    }
	

	}

}
