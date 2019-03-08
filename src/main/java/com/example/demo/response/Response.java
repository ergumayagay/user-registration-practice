package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("ResponseCode")
	public String responseCode;
	
	@JsonProperty("Message")
	public String message;
	
	public Response(String responseCode, String message) {
		this.responseCode = responseCode;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getResponseCode() {
		return responseCode;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
}
