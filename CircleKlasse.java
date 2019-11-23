public class CircleKlasse {
	private double radius;
	private boolean filled;

	//modifier is wenn nix da is is default 
	//Konstruktor immer public ... des kann ned falsch sein
	public CircleKlasse() {		
		//des is da wrkliche default konstruktor
		// radius=1; auch gut aber man muss ja die konstruktoen verknüpfen
		this(1, false);	//nennt man konstruktorverknüpfung
		//oder so : this.radius=1; this.filled=false;
		//oder so : setRadius(1);  setFilled(false);
	}

	public CircleKlasse(int r) {	
		this(r, false);		//this geht lei wenn i mi halt auf an anderen bezieh
		//eig muss man false ned schreiben weil wenn nix ist dann is es einfach false von vornherein
	}

	public CircleKlasse(int r, boolean f) {	
		setRadius(r);
		setFilled(f);

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		radius = r;
		if (r <= 0) {
			System.out.println("Radius muss immer groesser 0 sein!!!"
					+ "\nVerwendeter Radius bei ungültigen Eingaben ist 1\n");
			radius = 1;
		}
	}

	public double getCircumference() {
		return 2 * SomeMathKlasse.getPi() * radius;
	}

	public double getArea() {
		return SomeMathKlasse.getPi() * radius * radius;
	}

	public boolean getFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public void pruefen() {
		if (getFilled()==true) {
			getArea();
		} 
		else {
			getCircumference();
		}
	}
}