import models.Card;
import models.ExpirationDate;
import types.Brand;

public class Main {

    public static void main(String[] args) {
        Card tarjeta1 = new Card(Brand.VISA,4124-9888-7644-0110, "Alberto Direnna", new ExpirationDate(04,2022));
    }
}
