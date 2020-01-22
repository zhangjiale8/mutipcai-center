package com.mutipcai.enums.finance;

public enum FlowTypEnum {
	
	BALANCE("01", "好运币"), LUCKY("02", "余额"),CARD("03","卡券");

	private String id;

	private String title;

	private FlowTypEnum(String id, String title) {
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