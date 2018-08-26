package com.entity;


public class Revert {

	private Integer reId;
	private Integer ruserId;
	private Integer tMid;
	private String rMrevert;
	private String ruser;
	private Integer rmuserId;
	private String rmuser;
	
	public Integer getReId() {
		return reId;
	}
	public void setReId(Integer reId) {
		this.reId = reId;
	}
	public Integer getRuserId() {
		return ruserId;
	}
	public void setRuserId(Integer ruserId) {
		this.ruserId = ruserId;
	}
	public Integer gettMid() {
		return tMid;
	}
	public void settMid(Integer tMid) {
		this.tMid = tMid;
	}
	public String getrMrevert() {
		return rMrevert;
	}
	public void setrMrevert(String rMrevert) {
		this.rMrevert = rMrevert;
	}
	public String getRuser() {
		return ruser;
	}
	public void setRuser(String ruser) {
		this.ruser = ruser;
	}
	public Integer getRmuserId() {
		return rmuserId;
	}
	public void setRmuserId(Integer rmuserId) {
		this.rmuserId = rmuserId;
	}
	public String getRmuser() {
		return rmuser;
	}
	public void setRmuser(String rmuser) {
		this.rmuser = rmuser;
	}
	@Override
	public String toString() {
		return "Revert [reId=" + reId + ", ruserId=" + ruserId + ", tMid="
				+ tMid + ", rMrevert=" + rMrevert + ", ruser=" + ruser
				+ ", rmuserId=" + rmuserId + ", rmuser=" + rmuser + "]";
	}
	
	
	
}
