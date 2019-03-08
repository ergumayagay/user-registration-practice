package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ObjectReturnResponse  <T> extends Response {

	@JsonProperty("Object")
	T object;
	
	public ObjectReturnResponse(String responseCode, String message, T object) {
		super(responseCode, message);
		this.object = object;
		
	}
	
	public T getObject() {
		return object;
	}
	
	public void setObject(T object) {
		this.object = object;
	};
}
