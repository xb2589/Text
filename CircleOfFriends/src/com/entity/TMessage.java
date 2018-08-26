package com.entity;

import java.util.List;

public class TMessage {

	private Integer tMid ;
	private Integer cFriendsId;
	private Integer userId ;
	private String tMcontent ;
	private String user ;
	
	private List<Revert> reverts; // 回复评论
	
	
	public Integer gettMid() {
		return tMid;
	}
	public void settMid(Integer tMid) {
		this.tMid = tMid;
	}
	public Integer getcFriendsId() {
		return cFriendsId;
	}
	public void setcFriendsId(Integer cFriendsId) {
		this.cFriendsId = cFriendsId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String gettMcontent() {
		return tMcontent;
	}
	public void settMcontent(String tMcontent) {
		this.tMcontent = tMcontent;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public List<Revert> getReverts() {
		return reverts;
	}
	public void setReverts(List<Revert> reverts) {
		this.reverts = reverts;
	}
	
	
}
