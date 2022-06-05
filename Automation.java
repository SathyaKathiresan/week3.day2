package week3.day2;

public class Automation extends MultipleLanguage {
	
	public void java() {
		System.out.println("Java");
		
	}

	public void selenium() {
	
		System.out.println("Selenium");
	}
	

	public static void main(String[] args) {
	Automation objAuto = new Automation();
	objAuto.python();
	objAuto.ruby();
	objAuto.java();
	objAuto.selenium();

	}

	

}
