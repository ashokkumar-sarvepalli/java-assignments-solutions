package assignment.thread.problem1;



import java.util.List;

public class ShippingCostThread extends Thread{

    private List<Cargo> cargoList;
	private List<Double> priceList;
    
    public void run() {
       
    	for(Cargo cargo : cargoList) {
    		
    		if(cargo.getStorageType().equalsIgnoreCase("DRY")) {
    			priceList.add(cargo.getWeight() * 0.90);
    		}
    		else if(cargo.getStorageType().equalsIgnoreCase("Cold")) {
    			priceList.add(cargo.getWeight() * 1.85);
    		}
    	}
        
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void setCargoList(List<Cargo> cargoList) {
        this.cargoList = cargoList;
    }


    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
    
}
