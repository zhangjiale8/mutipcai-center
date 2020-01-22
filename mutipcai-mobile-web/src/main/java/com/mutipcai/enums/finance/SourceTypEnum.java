package com.mutipcai.enums.finance;

public enum SourceTypEnum {
	
	RECHARGE("01", "充值"), GIVE("02", "赠送");

	private String id;

	private String title;

	private SourceTypEnum(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}