package chan.interfaces.concept;

public class Artist implements Singer{

	public static void main(String[] args) {
		
		Singer a=new Artist();
		a.Singing();
		
		
	}

	@Override
	public void Singing() {
		// TODO Auto-generated method stub
		System.out.println("Singing....");
	}
	
	public void Dancing(){
		System.out.println("Dancing....");
	}

}
