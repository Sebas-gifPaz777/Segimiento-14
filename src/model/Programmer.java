package model;

public class Programmer {
	
	private String name;
	private String phone;
	private String address;
	private String eMail;
	private Programmer rigth;
	private Programmer left;
	private Programmer up;
	
	
	public Programmer(String name, String phone, String address, String eMail) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.eMail = eMail;
		this.rigth=null;
		this.left=null;
		this.up=null;
		
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public String geteMail() {
		return eMail;
	}

	public Programmer getRigth() {
		return rigth;
	}

	public void setRigth(Programmer rigth) {
		this.rigth = rigth;
	}

	public Programmer getLeft() {
		return left;
	}

	public void setLeft(Programmer left) {
		this.left = left;
	}
	
	public Programmer getUp() {
		return up;
	}

	public void setUp(Programmer up) {
		this.up = up;
	}
	
	public void insert(Programmer newProgrammer) {
		if(name.compareTo(newProgrammer.name)>0) {
			if(getLeft()==null) {
				setLeft(newProgrammer);
			}
			else {
				getLeft().insert(newProgrammer);
			}
		}
		else {
			if(getRigth()==null) {
				setRigth(newProgrammer);
			}
			else {
				getRigth().insert(newProgrammer);
			}
		}
	}
}
