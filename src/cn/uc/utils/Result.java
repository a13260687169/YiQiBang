package cn.uc.utils;

public class Result {

	
	//�ö����������ͳһ��Ӧ���󣬻Ὣ��ת��ΪJSON��ʽ���ַ������ͻ���
	
	private int retCode;
	
	//��Ӧ���
	private boolean retmsg;
	
	//��Ӧ����
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
