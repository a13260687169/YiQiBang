package cn.uc.bean;

import java.io.Serializable;

public class User implements Serializable {

	
	private int id;
	private String  u_username;
	private String u_nickname;
	private String u_password;
	private boolean u_sex;
	private String u_phonenum;
	private String u_email;
	private String u_headimg;
	private boolean u_state;
	private String u_creatime;
	private String u_birthday;
	private String u_remark;
	private String u_update;
	private int u_provinceid;
	private int u_cityid;
	private int u_areaid;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", u_username=" + u_username + ", u_nickname=" + u_nickname + ", u_password="
				+ u_password + ", u_sex=" + u_sex + ", u_phonenum=" + u_phonenum + ", u_email=" + u_email
				+ ", u_headimg=" + u_headimg + ", u_state=" + u_state + ", u_creatime=" + u_creatime + ", u_birthday="
				+ u_birthday + ", u_remark=" + u_remark + ", u_update=" + u_update + ", u_provinceid=" + u_provinceid
				+ ", u_cityid=" + u_cityid + ", u_areaid=" + u_areaid + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getU_username() {
		return u_username;
	}


	public void setU_username(String u_username) {
		this.u_username = u_username;
	}


	public String getU_nickname() {
		return u_nickname;
	}


	public void setU_nickname(String u_nickname) {
		this.u_nickname = u_nickname;
	}


	public String getU_password() {
		return u_password;
	}


	public void setU_password(String u_password) {
		this.u_password = u_password;
	}


	public boolean isU_sex() {
		return u_sex;
	}


	public void setU_sex(boolean u_sex) {
		this.u_sex = u_sex;
	}


	public String getU_phonenum() {
		return u_phonenum;
	}


	public void setU_phonenum(String u_phonenum) {
		this.u_phonenum = u_phonenum;
	}


	public String getU_email() {
		return u_email;
	}


	public void setU_email(String u_email) {
		this.u_email = u_email;
	}


	public String getU_headimg() {
		return u_headimg;
	}


	public void setU_headimg(String u_headimg) {
		this.u_headimg = u_headimg;
	}


	public boolean isU_state() {
		return u_state;
	}


	public void setU_state(boolean u_state) {
		this.u_state = u_state;
	}


	public String getU_creatime() {
		return u_creatime;
	}


	public void setU_creatime(String u_creatime) {
		this.u_creatime = u_creatime;
	}


	public String getU_birthday() {
		return u_birthday;
	}


	public void setU_birthday(String u_birthday) {
		this.u_birthday = u_birthday;
	}


	public String getU_remark() {
		return u_remark;
	}


	public void setU_remark(String u_remark) {
		this.u_remark = u_remark;
	}


	public String getU_update() {
		return u_update;
	}


	public void setU_update(String u_update) {
		this.u_update = u_update;
	}


	public int getU_provinceid() {
		return u_provinceid;
	}


	public void setU_provinceid(int u_provinceid) {
		this.u_provinceid = u_provinceid;
	}


	public int getU_cityid() {
		return u_cityid;
	}


	public void setU_cityid(int u_cityid) {
		this.u_cityid = u_cityid;
	}


	public int getU_areaid() {
		return u_areaid;
	}


	public void setU_areaid(int u_areaid) {
		this.u_areaid = u_areaid;
	}


	public User(int id, String u_username, String u_nickname, String u_password, boolean u_sex, String u_phonenum,
			String u_email, String u_headimg, boolean u_state, String u_creatime, String u_birthday, String u_remark,
			String u_update, int u_provinceid, int u_cityid, int u_areaid) {
		super();
		this.id = id;
		this.u_username = u_username;
		this.u_nickname = u_nickname;
		this.u_password = u_password;
		this.u_sex = u_sex;
		this.u_phonenum = u_phonenum;
		this.u_email = u_email;
		this.u_headimg = u_headimg;
		this.u_state = u_state;
		this.u_creatime = u_creatime;
		this.u_birthday = u_birthday;
		this.u_remark = u_remark;
		this.u_update = u_update;
		this.u_provinceid = u_provinceid;
		this.u_cityid = u_cityid;
		this.u_areaid = u_areaid;
	}
	
	
}
