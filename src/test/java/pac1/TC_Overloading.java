package pac1;

class car{
	int noofcyl;
	int nofvalves;
	int enginepower;
	boolean ispowerster;
	
	car(){
		noofcyl=3;
		nofvalves=4;
		enginepower=46;
		ispowerster=false;
	
	}
	car(boolean ispowerster){
	this.ispowerster=ispowerster;
	
}
	
	car(int noofcyl, int nofvalves,int enginepower){
		this.noofcyl=noofcyl;
		this.nofvalves=nofvalves;
		this.enginepower=enginepower;
		this.ispowerster=true;
		
		
	}
}
public class TC_Overloading {
	
	public static void main(String[]args) {
		car obj1=new car();
		System.out.println(obj1.noofcyl);
		
		car obj2=new car(true);
		System.out.println(obj2.ispowerster);
		
	}

}
