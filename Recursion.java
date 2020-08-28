public class Recursion{

  public static int basicRecursion(int j, int max){

    if(j>max){
	    return j;
    }

    basicRecursion(j+1,5);
    System.out.println(j);


    return j;
  }

  public static void main(String[] args){
	  basicRecursion(1,5);
  }


}