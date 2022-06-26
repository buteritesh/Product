package com.globant.Springboot_SecondProject.customexception;

import java.util.Date;

public class ErrorDetails {
	
	private String errorMsg;
	private String details;
	private Date timeStamp;
	
	public ErrorDetails() {
		
	}

	public ErrorDetails(String errorMsg, String details, Date timeStamp) {
		super();
		this.errorMsg = errorMsg;
		this.details = details;
		this.timeStamp = timeStamp;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorDetails [errorMsg=" + errorMsg + ", details=" + details + ", timeStamp=" + timeStamp + "]";
	}
	


}
