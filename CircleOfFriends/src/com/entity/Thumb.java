package com.entity;

public class Thumb {

	private Integer thumbId;
	private Integer cFriendsId;
	private Integer userId;
	private String user;
	private Integer count;

	public Integer getThumbId() {
		return thumbId;
	}

	public void setThumbId(Integer thumbId) {
		this.thumbId = thumbId;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Thumb [thumbId=" + thumbId + ", cFriendsId=" + cFriendsId
				+ ", userId=" + userId + ", user=" + user + "]";
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
