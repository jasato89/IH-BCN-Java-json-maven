import classes.*;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        /*

        House house = new House(12, "C/Almogavers 23", "Jaume Sánchez", new BigDecimal("10000000"));
        Apartment apartment = new Apartment(13, "C/Murillo 1234", "Claudia", new BigDecimal("243000"), 3, true);


        System.out.println(house);

        Gson gson = new Gson();

        String json = gson.toJson(house);

        System.out.println(json);

        InvoiceItem item1 = new InvoiceItem("Cerveza", 3.0);
        InvoiceItem item2 = new InvoiceItem("Pizza", 3.5);
        InvoiceItem item3 = new InvoiceItem("Pizza", 3.5);
        ArrayList<InvoiceItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Invoice invoice = new Invoice("IN-0001", 0.0, false, items);


        String invoiceJson = gson.toJson(invoice);

        System.out.println(invoiceJson);

        FileWriter fileWriter = new FileWriter("invoices.json", true);
        fileWriter.write(invoiceJson);
        fileWriter.close();

        Invoice invoice1 = gson.fromJson(invoiceJson, Invoice.class);
         */

        Person jaume = new Person("Jaume", "Sánchez", 450);

        System.out.println(jaume.showInfo());



        System.out.println(MathLibrary.add(5, 7));








    }
}
