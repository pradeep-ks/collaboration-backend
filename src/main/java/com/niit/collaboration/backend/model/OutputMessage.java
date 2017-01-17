package com.niit.collaboration.backend.model;

import java.util.Date;

public class OutputMessage extends Message {

	private Date time;

	public OutputMessage() {
	}

	public OutputMessage(Message message, Date time) {
		super(message.getId(), message.getMessage(), message.getUsername());
		this.time = time;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

}
