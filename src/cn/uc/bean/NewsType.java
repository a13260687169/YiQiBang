package cn.uc.bean;

import java.io.Serializable;

public class NewsType implements Serializable{
	
	private int id;
	private String t_name;
	
	public NewsType() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public NewsType(int id, String t_name) {
		super();
		this.id = id;
		this.t_name = t_name;
	}

	@Override
	public String toString() {
		return "NewsType [id=" + id + ", t_name=" + t_name + "]";
	}
	
	

}
