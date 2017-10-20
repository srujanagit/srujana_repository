package abstact.interfac;

public abstract class AnimalAbsCls {
	
	protected boolean isMammal;
	protected boolean isCarnivorous;
	

	public AnimalAbsCls (boolean isMammal,boolean isCarnivorous){
		this.isMammal=isMammal;
		this.isCarnivorous=isCarnivorous;
	}
	
	public boolean isMammal() {
		return isMammal;
	}

	public void setMammal(boolean isMammal) {
		this.isMammal = isMammal;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}

	public void setCarnivorous(boolean isCarnivorous) {
		this.isCarnivorous = isCarnivorous;
	}

	public abstract  String getGreeting();
}
