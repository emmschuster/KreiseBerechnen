public class CircleKlasse {
	private double radius;
	private boolean filled;
	
	public CircleKlasse() {
		//radius=1; auch gut aber man muss ja die konstruktoen verknüpfen
		this(1,false);
	}
	public CircleKlasse(int r) {
		this(r,false); 
	}
	public CircleKlasse(int r, boolean f) {
		setRadius(r);
		setFilled(f);
	}
	
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius=r;
		if (r<0) {
			System.out.println("Er muss groeßer 0 sein!!!");
			radius=1;
		}
	}
	
	public double getCircumference() {
		return 2*SomeMathKlasse.getPi()*radius;
	}
	public double getArea() {
		return SomeMathKlasse.getPi()*radius*radius;
	}
	
	public boolean getFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	
}
