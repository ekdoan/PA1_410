
public class Modeltoworld {

	String driverFilename = "" ;
	
	public void readDriverFile(String[] args){
		driverFilename = args[0];
		if(driverFilename.substring(driverFilename.length()-4).equals(".txt")){
			System.out.println("It is a txt file!! Yay");
		}
	}
	
	public static void main(String[] args) {
		Modeltoworld m = new Modeltoworld();
		
		if(args.length != 1){
			System.err.println("Expecting driver file as arg");
			return;
		}
		
		m.readDriverFile(args);
		

	}

}
