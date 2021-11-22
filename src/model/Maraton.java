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
	
	public void countHeigth() {
		int hg= countHeigth(rootProgrammer);
		System.out.println("The heigth of the tree is: "+hg);
	}
	
	private int countHeigth(Programmer node) {
		if(node==null) {
			return 0;
		}
		else {
			int hl= countHeigth(node.getLeft());
			int hr= countHeigth(node.getRigth());
			
			if(hl>hr)
				return hl+1;
			else
				return hr+1;
		}
	}
}
