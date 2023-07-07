import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("prezident",1001);
        iActorBehaviour p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviour tax = new TaxService();
        iActorBehaviour promo1 = new PromoClient("Andrey", "Все по 10", 100001, 100);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promo1);

        magnit.update();
    }
}
