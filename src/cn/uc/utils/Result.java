package cn.uc.utils;

public class Result {

	
	//该对象是请求的统一响应对象，会将其转化为JSON格式的字符串给客户端
	
	private int retCode;
	
	//响应结果
	private boolean retmsg;
	
	//响应数据
	private Object retData;

	
	public Result() {
		// TODO Auto-generated constructor stub
	}
	
	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}

	public boolean isRetmsg() {
		return retmsg;
	}

	public void setRetmsg(boolean retmsg) {
		this.retmsg = retmsg;
	}

	public Object getRetData() {
		return retData;
	}

	public void setRetData(Object retData) {
		this.retData = retData;
	}

	public Result(int retCode, boolean retmsg, Object retData) {
		super();
		this.retCode = retCode;
		this.retmsg = retmsg;
		this.retData = retData;
	}

	@Override
	public String toString() {
		return "Result [retCode=" + retCode + ", retmsg=" + retmsg + ", retData=" + retData + "]";
	}
	
	
}
