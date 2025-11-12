package com.pluralsight.OrderandReceipt;

import com.pluralsight.Product;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private List<Product> items = new ArrayList<>();


    public void addItem(Product p) {
        items.add(p);
    }

    public List<Product> getItems() {
        return items;
    }
    public double getTotal(){
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void clear(){
        items.clear();
    }

    public void saveReceipt(){
        try{
            File folder = new File("receipts");
            if(!folder.exists()) folder.mkdir();

            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File file = new File(folder,timeStamp + ".txt");

            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(String.format("===Your Receipt===\n"));
            bw.write(String.format("\nDate" + new Date()));
            for(Product p : items){
                bw.write(p.toString());
            }
            bw.write(String.format("=============================="));
            bw.write(String.format("Total: $" + String.format("%.2f",getTotal())));
            bw.close();

            System.out.println("Receipt has been saved!" + file.getAbsolutePath());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
