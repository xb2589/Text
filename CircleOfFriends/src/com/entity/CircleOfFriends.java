package com.entity;

public class CircleOfFriends {

	private Integer cfriendsId;
	private String forward;
	private String content;
	private String circleImgs ;
	private String circleBase64 ;
	private Integer userId ;
	private String user ;
	private String place ;
	public Integer getCfriendsId() {
		return cfriendsId;
	}
	public void setCfriendsId(Integer cfriendsId) {
		this.cfriendsId = cfriendsId;
	}
	public String getForward() {
		return forward;
	}
	public void setForward(String forward) {
		this.forward = forward;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCircleImgs() {
		return circleImgs;
	}
	public void setCircleImgs(String circleImgs) {
		this.circleImgs = circleImgs;
	}
	public String getCircleBase64() {
		return circleBase64;
	}
	public void setCircleBase64(String circleBase64) {
		this.circleBase64 = circleBase64;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "CircleOfFriends [cfriendsId=" + cfriendsId + ", forward=" + forward + ", content=" + content
				+ ", circleImgs=" + circleImgs + ", circleBase64=" + circleBase64 + ", userId=" + userId + ", user="
				+ user + ", place=" + place + "]";
	}
	
	
	
}
