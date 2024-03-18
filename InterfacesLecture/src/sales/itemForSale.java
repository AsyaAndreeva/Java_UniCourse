package sales;

import java.io.Serializable;

public interface itemForSale extends Serializable {

    double productionPrice();
    default double sellingPrice(){
        return 0;
    }
}
