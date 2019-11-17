public class EmmaCircle extends CircleKlasse {
	//erbt alles ausser die 2 variablen weil de private sind
	private String name;
	
	public EmmaCircle(String n, int r, boolean b) {
		super(r,false);
		setName(n);
	}
	
	public EmmaCircle(String n, int r) {
		super(r,false);
		setName(n);
	}
	
	public EmmaCircle(String n) {
		super(1,false);
		setName(n);
	}

	public void setName(String n) {
		this.name=n;
	}
	
	public String getName() {
		return name;
	}
}
