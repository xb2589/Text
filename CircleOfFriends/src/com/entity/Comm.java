package com.entity;

import java.util.List;

public class Comm<T> {
	
	
	
	private Integer code  = 200; // 处理失败
	private String msg = "处理失败";
	private T extend; // 返回的对象
	
	private List<T> extendList;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getExtend() {
		return extend;
	}
	public void setExtend(T extend) {
		this.extend = extend;
	}
	@Override
	public String toString() {
		return "Comm [code=" + code + ", msg=" + msg + ", extend=" + extend
				+ "]";
	}
	public List<T> getExtendList() {
		return extendList;
	}
	public void setExtendList(List<T> extendList) {
		this.extendList = extendList;
	}
	
	
	
	
	

}
