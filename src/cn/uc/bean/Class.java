package cn.uc.bean;

public class Class {

	private int id;
	private int teacherId;
	private String cName;

	
	public Class() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	@Override
	public String toString() {
		return "Class [id=" + id + ", teacherId=" + teacherId + ", cName=" + cName + "]";
	}


	public Class(int id, int teacherId, String cName) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.cName = cName;
	}
	
	
}
