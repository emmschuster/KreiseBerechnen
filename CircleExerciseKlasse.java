public class CircleExerciseKlasse {
	
	public static void main(String[] args) {
		CircleKlasse k1=new CircleKlasse();
		CircleKlasse k2=new CircleKlasse(8,true);
		CircleKlasse k3=new CircleKlasse(-3);	//fragen wegen besserer abicherung ... meine is scheisse
		EmmaCircle k4=new EmmaCircle("Peter",9,true);
		EmmaCircle k5=new EmmaCircle();
		//k1.radius=3; ->des is vor der kapselung also geht nur wenn radius public oder halt static is
		//Rungung muss no besser wean
		
		System.out.println("Kreis 1");
		System.out.println("Radius : "+k1.getRadius());
		System.out.println("Umfang : "+k1.getCircumference());
		System.out.println("Flaeche : "+k1.getArea());
		System.out.println("gef�llt = "+k1.getFilled());
		
		System.out.println("\nKreis 2");
		System.out.println("Radius : "+k2.getRadius());
		System.out.println("Umfang : "+k2.getCircumference());
		System.out.println("Flaeche : "+k2.getArea());
		System.out.println("gef�llt = "+k2.getFilled());
		
		System.out.println("\nKreis 3");
		//k3.pruefen(); geht ned
		System.out.println("Radius : "+k3.getRadius());
		System.out.println("Umfang : "+k3.getCircumference());
		System.out.println("Flaeche : "+k3.getArea());
		System.out.println("gef�llt = "+k3.getFilled()); 
		
		//System.out.println("\n"+k4.getName());
		k4.pruefenName();
		System.out.println("Radius : "+k4.getRadius());
		System.out.println("Umfang : "+k4.getCircumference());
		System.out.println("Flaeche : "+k4.getArea());
		System.out.println("gef�llt = "+k4.getFilled()); 
		
		System.out.println("\n"+k5.getName());
		System.out.println("Radius : "+k5.getRadius());
		System.out.println("Umfang : "+k5.getCircumference());
		System.out.println("Flaeche : "+k5.getArea());
		System.out.println("gef�llt = "+k5.getFilled()); 
	}
	
}
