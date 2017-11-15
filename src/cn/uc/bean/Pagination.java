package cn.uc.bean;

public class Pagination {
	
	
	private int pagenum;
	private int pageCount;
	
	
	public Pagination() {
		// TODO Auto-generated constructor stub
	}
	public int getPagenum() {
		return pagenum;
	}
	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	@Override
	public String toString() {
		return "Pagination [pagenum=" + pagenum + ", pageCount=" + pageCount + "]";
	}
	public Pagination(int pagenum, int pageCount) {
		super();
		this.pagenum = pagenum;
		this.pageCount = pageCount;
	}
	

	
	
}
