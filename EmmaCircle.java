public class EmmaCircle extends CircleKlasse {
	//erbt alles ausser die 2 variablen weil de private sind -> darum getter und setter
	private String name;
	
	public EmmaCircle(String n, int r, boolean b) {
		super(r,b);		//statt super könnte man sich VORSTELLEN dass da Circle steht
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
	//wie methode mit name??
	public void pruefenName() {
		System.out.println("\n"+getName()+" hat folgende Maße : ");
	}
}
