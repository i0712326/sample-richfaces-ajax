package pro.tikkwiki.sample.richfaces.ajax;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

import pro.tikkwiki.sample.richfaces.bean.Car;

@Named("carBean")
@RequestScoped
public class CarBean {
	
	private List<Car> cars;
	private static final int CLIENT_ROWS_IN_AJAX_MODE = 15;
	private int clientRows;
	private int currentCarIndex;
	private int page = 1;
	    
    public void switchAjaxLoading(ValueChangeEvent event) {
        this.clientRows = (Boolean) event.getNewValue() ? CLIENT_ROWS_IN_AJAX_MODE : 0;
    }
    
	@PostConstruct
	public void init() {
		cars = new ArrayList<Car>();
		
		for(int i=10;i<100;i++) {
			String model = "Model00"+i;
			String brand = "Brand00"+i;
			String maker = "Maker00"+i;
			String vin	 = "XXXX-XXX-XXXX-00"+i;
			String en	 = "XXXX-XXX-XXXX-11"+i;
			cars.add(new Car(model,brand,maker, i*10000,new Date(),vin,en));
		}
	}
	
	public List<Car> getCars(){
		return cars;
	}
	
	public int getCurrentCarIndex() {
        return currentCarIndex;
    }
 
    public void setCurrentCarIndex(int currentCarIndex) {
        this.currentCarIndex = currentCarIndex;
    }
    
    public int getPage() {
        return page;
    }
 
    public void setPage(int page) {
        this.page = page;
    }
 
    public int getClientRows() {
        return clientRows;
    }
 
    public void setClientRows(int clientRows) {
        this.clientRows = clientRows;
    }
}
