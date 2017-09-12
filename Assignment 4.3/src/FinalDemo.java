import java.util.*;    //importing util class to use scanner method
class Age{		//class age creation
	final int age;	//final variable created in integer type
	public Age() {		//constructor of Age class 
		age = 18;	//assigning value to age
	}
}
final class Check extends Age{		//creation of final class Check which is extended by the age class 
    public final void Checkdata(int check_age) {    //creation of final method to chech the age 
		if(age == check_age) {		//checks if the age passed is equal to the age assigned
			System.out.println("The age matches!");   //if true prints a message on sonsole as matches
		}
		else {
			System.out.println("The age doesnot match!");   //if not prints a message on console as doesnt match
		}
	}
}
public class FinalDemo {		//main class holding the main method of the program	

	public static void main(String[] args) {    //Main method of the program
		
		int check_age;		//intialization of variable in integer type
		
		Scanner sc = new Scanner(System.in);   //creating object of scanner class 
		
		Check chk = new Check();     //creating object of class check
		System.out.println("Enter Age: ");  //Prints message to get input from user
		check_age = sc.nextInt();	//stores the value to the variable check_age using scanner object
		chk.Checkdata(check_age);	//calling of mehod Checkdata using the object of Check class
		sc.close();	//closing the scanner method 
		
	}

}
