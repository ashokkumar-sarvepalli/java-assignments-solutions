package assignment.thread.problem1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String args[]) throws IOException, InterruptedException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Cargo:");
        int numberOfCargo = Integer.parseInt(reader.readLine());
        
        System.out.println("Enter cargo details (id,length,width,weight,cargo type,storage type):");
        List<Cargo> cargoList = new ArrayList<Cargo>();
        for(int i=0;i<numberOfCargo;i++) {
            cargoList.add(new Cargo(reader.readLine()));
        }
        
        ShippingCostThread s1 = new ShippingCostThread();
        s1.setCargoList(cargoList.subList(0, cargoList.size()/2));
        s1.setPriceList(new ArrayList<Double>());
        
        
        ShippingCostThread s2 = new ShippingCostThread();
        s2.setCargoList(cargoList.subList(cargoList.size()/2, cargoList.size()));
        s2.setPriceList(new ArrayList<Double>());
        
        s1.start();
        s2.start();
        
        s1.join();
        s2.join();
        
        System.out.println("Price List:");
        displayPrice(s1.getPriceList());
        displayPrice(s2.getPriceList());
       
        
    }
    
    public static void displayPrice(List<Double> list) {
        for(Double value : list) {
        	System.out.println(value);
        }
    }
}
