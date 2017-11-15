package cn.uc.bean;

public class Picture {
	
	private  int id;
	private int t_n_id;
	private String  p_path;
	private  String p_info;
	private String p_author;
	private String p_sourse;
	
	public Picture() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getT_n_id() {
		return t_n_id;
	}

	public void setT_n_id(int t_n_id) {
		this.t_n_id = t_n_id;
	}

	public String getP_path() {
		return p_path;
	}

	public void setP_path(String p_path) {
		this.p_path = p_path;
	}

	public String getP_info() {
		return p_info;
	}

	public void setP_info(String p_info) {
		this.p_info = p_info;
	}

	public String getP_author() {
		return p_author;
	}

	public void setP_author(String p_author) {
		this.p_author = p_author;
	}

	public String getP_sourse() {
		return p_sourse;
	}

	public void setP_sourse(String p_sourse) {
		this.p_sourse = p_sourse;
	}

	@Override
	public String toString() {
		return "picture [id=" + id + ", t_n_id=" + t_n_id + ", p_path=" + p_path + ", p_info=" + p_info + ", p_author="
				+ p_author + ", p_sourse=" + p_sourse + "]";
	}

	public Picture(int id, int t_n_id, String p_path, String p_info, String p_author, String p_sourse) {
		super();
		this.id = id;
		this.t_n_id = t_n_id;
		this.p_path = p_path;
		this.p_info = p_info;
		this.p_author = p_author;
		this.p_sourse = p_sourse;
	}
	
	

}
