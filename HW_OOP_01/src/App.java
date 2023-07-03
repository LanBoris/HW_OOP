import java.util.ArrayList;
import java.util.List;

import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import Services.CoinDispencer;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Product> assort = new ArrayList<>();
        Product p1 = new Product(100, 1, "Lays", 101);
        Product p2 = new Product(50, 2,"Coca-Cola",102);
        Product p3 = new Bottle(150, 3, "Mineral Water",103, (float) 1.5);

        // Добавление горячего напитка
        Product p4 = new HotDrink(200, 4, "Cappuccino", 301, 90);
        Product p5 = new HotDrink(160, 5, "Green Tea", 302, 85);
        
        assort.add(p1);
        assort.add(p2);
        assort.add(p3);
        assort.add(p4);
        assort.add(p5);
        
        Holder hold1 = new Holder(4, 4);
        CoinDispencer coinDisp = new CoinDispencer(0);
        Display display = new Display();

        VendingMachine venMachine = new VendingMachine(hold1, coinDisp, assort, display);

        for (Product prod : venMachine.getAssort()) {
            System.out.println(prod);
        }


    }
}
