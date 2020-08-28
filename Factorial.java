public class Factorial{
	static int count = 0;
	public static void main(String[] args){
		count=0;
		
		String  method = "ITERATIVELY";//RECURSIVELY
		if(args!=null && args.length>2){
		  method = args[2];
		}
		if(!"ITERATIVELY".equalsIgnoreCase(method)){
		    System.out.println("Calculating using RECURSION");
		}
		int num=1;
		if(args!=null && args.length>1){
		  num = Integer.parseInt(args[1]);
		  if("ITERATIVELY".equalsIgnoreCase(method)){
		      System.out.println(num+": "+factorial_By_Iteration(num));
		  }
		  else{

		      System.out.println(num+": "+factorial(num));
		  }
		  System.out.println("The method got called : "+count);
		}

		int printSequenceUntil = 21;
		if(args!=null && args.length>0){
		  printSequenceUntil = Integer.parseInt(args[0]);
		}
		
		
		for(int i=0;i<=printSequenceUntil;i++){
		    if("ITERATIVELY".equalsIgnoreCase(method)){
			System.out.println(i+":"+factorial_By_Iteration(i));
		    }
		    else{
			System.out.println(i+":"+factorial(i));
		    }
		
		}

	}


	public static int factorial(int n){//head recursion
	    count++;
	    //Called n times - Big O = O(n)
	    //Since called recursively call stack is piled up and we have space complexity of O(n)
	    //Now compare against iterative way of calculating factorial
	    if(n<=1){
		return 1;
	    }
	    return n*factorial(n-1); // note after function returns multiplication operation is performed. stack is needed
	}
	
	public static int factorial_By_Iteration(int n){
	  count++;
	  int p = 1;
	  //Statement executed n times - Big O = O(n)
	  //Since not called recursively call stack space complexity O(1)
	  //Now compare against iterative way of calculating factorial
	  //https://www.youtube.com/watch?v=xnVZeb907VA
	  for(int i =n;i>1;i--){
	      p = p*i;
	  
	  }
	  return p;
	}
	
	public static int factorial_by_tail_recursion(int n, int accumulator){
	  if(n<=1){
	    return accumulator;
	  }
	  return factorial_by_tail_recursion(n-1, n*accumulator); //Note: after function returns no op	eration is performed.
	  //During compiiler optimization, the code is converted in to iteration code. Hence no overhead of stack usage
	  //https://www.youtube.com/watch?v=Wpkh5YSqwqg&t=615s
	  //Less lines of code, with no sapce complexity
	  
	  //TODO create a class file and decomplie the class file and see how the code looks like
	}

}
