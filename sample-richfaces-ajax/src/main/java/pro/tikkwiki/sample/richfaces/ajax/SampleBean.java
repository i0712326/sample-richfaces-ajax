package pro.tikkwiki.sample.richfaces.ajax;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.jboss.logging.Logger;

import pro.tikkwiki.sample.richfaces.bean.Sample;

@Named("sampleBean")
@RequestScoped
public class SampleBean implements Serializable {
	private static Logger logger = Logger.getLogger(SampleBean.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 8536171518973122806L;
	private Sample sample;
	private String message;
	private String output;
	
	public SampleBean() {
		setSample(new Sample());
	}
	public Sample getSample() {
		return sample;
	}
	public void setSample(Sample sample) {
		this.sample = sample;
	}
	
	public void submit() {
		logger.info("submit action 01 was called .....");
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void action() {
		logger.info("submit action 02 was called .....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			logger.error("Error occured for Thread", e);
		}
		output = message+" !!!!!!!!!!! ";
	}
	
	public void reset() {
		message = "";
		output = "";
	}
	
	public void doIt() {
		logger.info("Called do it");
		String msg = sample.getMessage();
		String status = sample.getStatus();
		
		sample.setMessage(msg.toUpperCase());
		sample.setStatus(status.toUpperCase());
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
}
