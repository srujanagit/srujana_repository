package abstact.interfac;

public class Cow extends AnimalAbsCls {

	public Cow(boolean isMammal, boolean isCarnivorous) {
		super(isMammal, isCarnivorous);
		
		if(this.isMammal==true && this.isCarnivorous==true){
			System.out.println(" cow :"+ getGreeting() +" It is Mammal . Carnivorous");
		}
		else if(this.isMammal==true && this.isCarnivorous==false){
			System.out.println(" cow :"+ getGreeting() +" It is Mammal . not Carnivorous");
		}
		
		else if (this.isMammal==false && this.isCarnivorous==false){
			System.out.println(" cow :"+ getGreeting() +" It is not Mammal . not Carnivorous");
		}
	}

	@Override
	public String getGreeting() {
		return "Moo";
	}
	
	
}

	
	