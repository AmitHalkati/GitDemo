import demopack.CentralTraffic;

public class AustralianTraffic  implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Need to create class object for this AustralianTraffic class to implement
		//the method present in CentralTraffic interface
		CentralTraffic a = new AustralianTraffic();
		a.greenGo();
        a.redStop();
        a.yellowWait();
		
		

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println( "Green go implementation" );
		}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println( "Red stop implementation" );
	}

	@Override
	public void yellowWait() {
		// TODO Auto-generated method stub
		System.out.println( "Yellow wait implementation" );
	}

}
