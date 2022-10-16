package pro.tikkwiki.sample.richfaces.bean;

import java.io.Serializable;

public class Sample implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4889179488519295191L;
	private String message;
	private String status;
	
	public Sample() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
