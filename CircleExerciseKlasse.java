public class CircleExerciseKlasse {
	
	public static void main(String[] args) {
		CircleKlasse k1=new CircleKlasse();
		EmmaCircle k4=new EmmaCircle("Peter",9,true);
		//grundklasse von allen:
//		Object o1=new Object();
		//k1.radius=3; ->des is vor der kapselung also geht nur wenn radius public oder halt static is
		//Rungung muss no besser wean
		
		k1.ausgabe("");
		k4.ausgabe();
	}
	
}
