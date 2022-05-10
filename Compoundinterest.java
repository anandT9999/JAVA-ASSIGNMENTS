package javademo;
public class Compoundinterest { //class

   public static void main(String[] args) { //main method 
   	 // TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);  // created an object of Scanner class
      double principal = 0 , rate = 0 , time = 0 , ci = 0; //declaring the variables
  
      System.out.print("Enter the Principal amount : ");  // taking input from users
      principal = input.nextDouble(); //Initializing the variables

      System.out.print("Enter the Rate : ");  // taking input from users
      rate = input.nextDouble(); //Initializing the variables

      System.out.print("Enter the Time : ");  // taking input from users
      time = input.nextDouble(); //Initializing the variables

      // calculate the compound interest
      ci  = principal * Math.pow((1 + rate/100),time); 
      System.out.println("The Compound Interest is : " + ci ); //Printing the compound interest
  
   }

}

/* output: Enter the Principal amount : 1200
Enter the Rate : 9
Enter the Time : 3
The Compound Interest is : 1554.0348000000004 */