package com.xiangwei.atcrowdfunding.bean;

public class AJAXResult {

	private boolean success;  //执行结果
	private Object data;  //返回的数据

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
