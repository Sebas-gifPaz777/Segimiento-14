package model;

public class Maraton {
	
	private Programmer rootProgrammer;
	
	public Maraton() {
		rootProgrammer=null;
	}
	
	public void addProgrammer(String name, String phone, String address, String eMail) {
		if(rootProgrammer==null) {
			rootProgrammer=new Programmer(name, phone, address,eMail);
		}
		else
			rootProgrammer.insert(new Programmer(name, phone, address,eMail));
	}
	
	public void ejectInorden() {
		inorden(rootProgrammer);
	}
	
	public void inorden(Programmer node) {
		if(node==null) {
			return;
		}
		else {
			inorden(node.getLeft());
			System.out.println(node.getName());
			inorden(node.getRigth());
		}
	}
}
