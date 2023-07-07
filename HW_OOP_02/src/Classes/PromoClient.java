package Classes;

public class PromoClient extends Actor {

    public String namePromo;
    private long idPromo;
    public static int amountPromo;

    public PromoClient(String name, String namePromo, long id, int amountPromo) {
        super(name + " - Акционный [" + namePromo + "]");
        this.namePromo = namePromo;
        idPromo = id;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    public Actor getActor() {
      return this;
    }

    @Override
    public String getName() {
        return super.name;
    }
    
}
