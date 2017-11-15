package cn.uc.bean;

import java.io.Serializable;
import java.util.Date;

//当数据库设计完毕并设计合理之后根据第一映射产生javabean
public class NewsPost implements Serializable {
	
	private int id;
	private int t_t_id;
	private String n_title;
	private String n_source;
	private String n_content;
	private Date n_createtime;
	private int n_commcount;
	private int n_readcount;
	private String n_author;
	private int n_sharecount;
	private boolean n_ifhot;
	private boolean n_ifreport;
	
	
	public NewsPost() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getT_t_id() {
		return t_t_id;
	}


	public void setT_t_id(int t_t_id) {
		this.t_t_id = t_t_id;
	}


	public String getN_title() {
		return n_title;
	}


	public void setN_title(String n_title) {
		this.n_title = n_title;
	}


	public String getN_source() {
		return n_source;
	}


	public void setN_source(String n_source) {
		this.n_source = n_source;
	}


	public String getN_content() {
		return n_content;
	}


	public void setN_content(String n_content) {
		this.n_content = n_content;
	}


	public Date getN_createtime() {
		return n_createtime;
	}


	public void setN_createtime(Date n_createtime) {
		this.n_createtime = n_createtime;
	}


	public int getN_commcount() {
		return n_commcount;
	}


	public void setN_commcount(int n_commcount) {
		this.n_commcount = n_commcount;
	}


	public int getN_readcount() {
		return n_readcount;
	}


	public void setN_readcount(int n_readcount) {
		this.n_readcount = n_readcount;
	}


	public String getN_author() {
		return n_author;
	}


	public void setN_author(String n_author) {
		this.n_author = n_author;
	}


	public int getN_sharecount() {
		return n_sharecount;
	}


	public void setN_sharecount(int n_sharecount) {
		this.n_sharecount = n_sharecount;
	}


	public boolean isN_ifhot() {
		return n_ifhot;
	}


	public void setN_ifhot(boolean n_ifhot) {
		this.n_ifhot = n_ifhot;
	}


	public boolean isN_ifreport() {
		return n_ifreport;
	}


	public void setN_ifreport(boolean n_ifreport) {
		this.n_ifreport = n_ifreport;
	}


	public NewsPost(int id, int t_t_id, String n_title, String n_source, String n_content, Date n_createtime,
			int n_commcount, int n_readcount, String n_author, int n_sharecount, boolean n_ifhot,
			boolean n_ifreport) {
		super();
		this.id = id;
		this.t_t_id = t_t_id;
		this.n_title = n_title;
		this.n_source = n_source;
		this.n_content = n_content;
		this.n_createtime = n_createtime;
		this.n_commcount = n_commcount;
		this.n_readcount = n_readcount;
		this.n_author = n_author;
		this.n_sharecount = n_sharecount;
		this.n_ifhot = n_ifhot;
		this.n_ifreport = n_ifreport;
	}


	@Override
	public String toString() {
		return "NewsPost [id=" + id + ", t_t_id=" + t_t_id + ", n_title=" + n_title + ", n_source=" + n_source
				+ ", n_content=" + n_content + ", n_createtime=" + n_createtime + ", n_commentcount=" + n_commcount
				+ ", n_readcount=" + n_readcount + ", n_author=" + n_author + ", n_sharecount=" + n_sharecount
				+ ", n_ifhot=" + n_ifhot + ", n_ifreport=" + n_ifreport + "]";
	}
	



	
	
				
}
