public class Fibonacci{

	public static int count = 0;
	//To run java Fibonacci
	// java Fibonacci <printUntilNth> <nth>
	// java Fibonacci 10
	// java Fibonacci -1 10
	public static void main(String[] args){
		count=0;
		int num=1;
		if(args!=null && args.length>1){
		  num = Integer.parseInt(args[1]);
		  System.out.println(num+": "+fibonacci(num));
		  System.out.println("The method got called : "+count);
		}

		int printSequenceUntil = 21;
		if(args!=null && args.length>0){
		  printSequenceUntil = Integer.parseInt(args[0]);
		}
		//Print 21 numbers in fibonacci sequence
		for(int i=0;i<printSequenceUntil;i++){
			System.out.println(i+": "+fibonacci(i));
		}
	}

	//0,1,1,2,3,5,8,
	public static int fibonacci(int n){
		count++;
		if(n==0)
		{
		  return 0;
		}
		if(n==1){
		  return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
