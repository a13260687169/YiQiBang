package cn.uc.bean;

public class Admin {
	
	private int id;
	private int t_u_id;
	private boolean u_state;
	private int u_level;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getT_u_id() {
		return t_u_id;
	}

	public void setT_u_id(int t_u_id) {
		this.t_u_id = t_u_id;
	}

	public boolean isU_state() {
		return u_state;
	}

	public void setU_state(boolean u_state) {
		this.u_state = u_state;
	}

	public int getU_level() {
		return u_level;
	}

	public void setU_level(int u_level) {
		this.u_level = u_level;
	}

	public Admin(int id, int t_u_id, boolean u_state, int u_level) {
		super();
		this.id = id;
		this.t_u_id = t_u_id;
		this.u_state = u_state;
		this.u_level = u_level;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", t_u_id=" + t_u_id + ", u_state=" + u_state + ", u_level=" + u_level + "]";
	}
	
	
	
	
	

}
