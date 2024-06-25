package com.warehouse.inventory.warehouse.constants;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ResponseStatus {
	SUCCESS("success"), ERROR("error");

	private String val;

	ResponseStatus(String val) {
		this.val = val;
	}

	@JsonValue
	public String getVal() {
		return val;
	}

	@Override
	public String toString() {
		return val;
	}

}
