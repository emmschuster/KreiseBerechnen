public class EmmaCircle extends CircleKlasse {
	//erbt alles ausser die 2 variablen weil de private sind -> darum getter und setter
	private String name;
	
	public EmmaCircle(String n, int r, boolean b) {
		//statt super könnte man sich VORSTELLEN dass da Circle steht
		super(r,b);		
		setName(n);
	}
	
	public EmmaCircle(String n, int r) {
		//super(r,false); //super greift auf die konsturktoren vom elternKlasse zu
		//this.name=n;
		//Konstruktorenverkettung:
		this(n,r,false);
	}
	
	public EmmaCircle(String n) {
		//super(1,false); setName(n);
		this(n,1,false);
	}

	public EmmaCircle() {
		//super(1,false); setName("DefaultName");
		this("Namenslos",1,false);
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return name;
	}

	public void ausgabe() {
		System.out.println("Der Kreis mit dem Namen "+this.name+" hat die Werte:");
		System.out.println("Radius : "+super.getRadius());
		super.pruefen();
//		System.out.println("Umfang : "+super.getCircumference());
//		System.out.println("Flaeche : "+super.getArea());
		this.getFilledS();
	} 
}
