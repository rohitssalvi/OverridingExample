package overridingexample;

public class OveridingExample {
	public static void main(String[] args) {
		
		Bank bank1=new ICICIBank();
		Bank bank2=new SBIBank();
		Bank bank3=new AXIS();
		
		bank1.getRateOfInterest();
		bank2.getRateOfInterest();
		bank3.getRateOfInterest();
		
		
	}

}


class Bank
{
     void getRateOfInterest()
     {
    	 System.out.println("Bank Interest");
     }
} 


class ICICIBank extends Bank
{
	
	@Override
	void getRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("ICIC Bank Gives 8% interest");
	}
	
}

class  SBIBank extends Bank {
	@Override
	void getRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Bank Gives 9% interest");
	}
}


class  AXIS extends Bank {
	@Override
	void getRateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("AXIS Bank Gives 10% interest");
	}
}