import java.util.*;
class Age{
	final int age;
	public Age() {
		age = 18;
	}
}
final class Check extends Age{
    public final void Checkdata(int check_age) {
		if(age == check_age) {
			System.out.println("The age matches!");
			//return 0;
		}
		else {
			System.out.println("The age doesnot match!");
			//return 1;
		}
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		
		int check_age;
		
		Scanner sc = new Scanner(System.in);
		
		Check chk = new Check();
		System.out.println("Enter Age: ");
		check_age = sc.nextInt();
		chk.Checkdata(check_age);
		sc.close();
		
	}

}
