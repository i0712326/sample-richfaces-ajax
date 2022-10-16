package pro.tikkwiki.sample.richfaces.bean;

import java.util.Date;

public class Car {
	
	private String model;
	private String brand;
	private String maker;
	private float price;
	private Date producedOn;
	private String vin;
	private String en;
	
	
	public Car(String model, String brand, String maker, float price, Date producedOn, String vin, String en) {
		super();
		this.model = model;
		this.brand = brand;
		this.maker = maker;
		this.price = price;
		this.producedOn = producedOn;
		this.vin = vin;
		this.en = en;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getProducedOn() {
		return producedOn;
	}
	public void setProducedOn(Date producedOn) {
		this.producedOn = producedOn;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getEn() {
		return en;
	}
	public void setEn(String en) {
		this.en = en;
	}
	
	
}
