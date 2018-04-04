
public class MovingStrig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String Animal[]={"Dog","Cat","Bird","Fish"};

	String a=Animal[0];
	String b=Animal[2];
	Animal[0]=b;
	Animal[2]=a;
	
	System.out.println(Animal[0]);
	System.out.println(Animal[1]);
	System.out.println(Animal[2]);
	System.out.println(Animal[3]);
	
	}

}
