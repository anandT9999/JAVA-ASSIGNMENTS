
/* corona class  */
package javademows;
import java.util.ArrayList;

class Corona { 	//attributes
	String Statename;
	int active;
	int recovered;
	int death;
	int total;
	// constructor of corona class with required parameters
	public Corona(String Statename,	int active,int recovered,int death) {
		this.Statename=Statename;
		this.active=active;
		this.recovered=recovered;
		this.death=death;
		this.total=active+recovered+death;
	}
	// method to return details of a single state 
	public String displayinfo(){
		return ("in the state : "+Statename
				+" active cases are : "+active+" and recovered cases are :"+
				recovered+" and no of deaths are : "+death+" total : "+total);
	}

}

public class coronatest {
	//arrayList to hold corona class  objects  // holds the class variables
	static ArrayList<Corona> coronalist =new ArrayList<>();
	
	public static void main(String[] args) {
		
		Corona c1=new Corona("Andhra pradesh",12000,50000,3000);
		Corona c2=new Corona("maharastra",20000,90000,5000);
		Corona c3=new Corona("kerala",15000,65000,3500);
		Corona c4=new Corona("telangana",4000,10000,1500);
		
		// method to return details of a single state 
		System.out.println(c1.displayinfo());
		System.out.println(c2.displayinfo());
		System.out.println(c3.displayinfo());
		System.out.println(c4.displayinfo());
		
		coronalist.add(c1);
		coronalist.add(c2);
		coronalist.add(c3);
		coronalist.add(c4);
		
		findtotal();
		
		

	}
	// method to find total cases in all states
	public  static void findtotal() {
		int total=0;
		for(Corona c:coronalist) {	
			total+=c.total;
		}
		
		System.out.println("The total cases of all the states :" +total); // total cases of all the states
		
	}

}

/* corona class  */
package javademows;

public class Corona {
	//attributes
	private String statename;
	private int active,recovered,death,total;
	public int getTotal() {
		return total; // it return total cases
	}
	
	//Parameterized constructor
	public void Corona(String statename, int active, int recovered, int death, int total ) {
		this.statename=statename;
		this.active=active;
		this.recovered=recovered;
		this.death=death;
		this.total=total;	
	}
	//display function is used to display and return the information
	public String displayInfo() {
		this.total=this.active+this.recovered+this.death;
		String coronaInfo="State Name : "+this.statename+'\n'+"Active cases :"+this.active+'\n'+"Recovered cases :"+this.recovered+'\n'+"Death :"+this.death+'\n'+"Total cases :"+this.total;
		return coronaInfo;
	}
}


/* corona test class */

package javademows;
import java.util.*;

public class CoronaTest {

	public static void main(String[] args) {
		
		  //corona is an object
        // default constructor
        Corona corona = new Corona();
        corona.Corona("Uttar Pradesh",10000,1000, 100,0);
        String coronainfo = corona.displayInfo();
        
        //corona1 is an object
        Corona corona1 = new Corona();      // default constructor
        corona1.Corona("Madhya Pradesh",1000,500, 100,0);
        String coronainfo1 = corona1.displayInfo();
        
        //corona2 is an object
        // default constructor
        Corona corona2 = new Corona();
        corona2.Corona("Maharastra",50000,10000, 1000,0);
        String coronainfo2 = corona2.displayInfo();

        
        //corona3 is an object
        // default constructor
        Corona corona3 = new Corona();
        corona3.Corona("Uttar Pradesh",10000,1000, 100,0);
        String coronainfo3 = corona3.displayInfo();
       
        // adding product to a corona Arraylistlist
        // list interface , ArrayList
        List<Corona> coronalist = new ArrayList<Corona>();
        coronalist.add(corona);
        coronalist.add(corona1);
        coronalist.add(corona2);
        coronalist.add(corona3);
        
        
        int totalcases=0;
        for (int i=0;i<coronalist.size();i++) {
            Corona coronanew =coronalist.get(i); 
            
            totalcases = totalcases +coronanew.getTotal(); //adding total cases from all the state
            System.out.println("Corona cases update in the state "+(i+1)+": "+'\n'+coronanew.displayInfo()+'\n');//display information
        }
       System.out.println("The total cases of all the states :" +totalcases);//total cases from all four states

	}

}


