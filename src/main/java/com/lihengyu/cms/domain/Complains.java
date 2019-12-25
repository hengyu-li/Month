package com.lihengyu.cms.domain;

public class Complains {
	
	private Integer id;//字段
	
	private Integer aid;//文章id
	
	private Integer uid;//投诉用户
	
	private String complaintype;//投诉类型
	
	private String urlip;//用户提交证据url
	
	private String title;//理由
	
	private String image;//图片

	private Integer comment;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getComplaintype() {
		return complaintype;
	}

	public void setComplaintype(String complaintype) {
		this.complaintype = complaintype;
	}

	public String getUrlip() {
		return urlip;
	}

	public void setUrlip(String urlip) {
		this.urlip = urlip;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	public Integer getComment() {
		return comment;
	}

	public void setComment(Integer comment) {
		this.comment = comment;
	}
	public Complains(Integer id, Integer aid, Integer uid, String complaintype, String urlip, String title,
			String image, Integer comment) {
		super();
		this.id = id;
		this.aid = aid;
		this.uid = uid;
		this.complaintype = complaintype;
		this.urlip = urlip;
		this.title = title;
		this.image = image;
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Complains [id=" + id + ", aid=" + aid + ", uid=" + uid + ", complaintype=" + complaintype + ", urlip="
				+ urlip + ", title=" + title + ", image=" + image + ", comment=" + comment + "]";
	}

	public Complains() {
		// TODO Auto-generated constructor stub
	}
}
