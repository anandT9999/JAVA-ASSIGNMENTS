package javademo;
public class Simpleinterest { //class
    public static void main(String args[]) // main method
    // TODO Auto-generated method stub
    {
        float p, r, t , si ; //declaring the variables
        // created an object of Scanner class
        Scanner s = new Scanner(System.in); 

        System.out.print("Enter the Principal : "); // taking input from users
        p = s.nextFloat(); //Initializing the variables

        System.out.print("Enter the Rate of interest : "); // taking input from users
        r = s.nextFloat(); //Initializing the variables

        System.out.print("Enter the Time period : "); // taking input from users
        t = s.nextFloat(); //Initializing the variables
        // calculate the simple interest
        si = (p * t * r) / 100;
        System.out.print(" Simple Interest is : " + si) ; //Printing the simple interest
    }
}

/* output: Enter the Principal : 1200
Enter the Rate of interest : 5
Enter the Time period : 3
Simple Interest is: 180.0 */