package com.xiangwei.atcrowdfunding.bean;

public class AJAXResult {

	private boolean success;  //ִ�н��
	private Object data;  //���ص�����

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}