package cn.uc.bean;

public class Teacher {

	
	private int in;
	private String tName;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return "Teacher [in=" + in + ", tName=" + tName + "]";
	}

	public Teacher(int in, String tName) {
		super();
		this.in = in;
		this.tName = tName;
	}
	
}
