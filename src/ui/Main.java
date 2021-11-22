package ui;

import model.Maraton;

public class Main {
	
	public static Maraton mn;
	public static void main(String[]args) {
		mn= new Maraton();
		
		mn.addProgrammer("Juan", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		mn.addProgrammer("Laura", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		mn.addProgrammer("Lola", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		mn.addProgrammer("Esteban", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		mn.addProgrammer("Francisco", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		mn.addProgrammer("Xavi", "3154622014", "CR 51 #56-45", "juan@gmail.com");
		
		mn.ejectInorden();
		mn.countHeigth();
	}
}
