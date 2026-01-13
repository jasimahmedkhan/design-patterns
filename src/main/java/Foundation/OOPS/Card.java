package Foundation.OOPS;

import lombok.Getter;
import lombok.Setter;

abstract class Card implements IPaymentMethod{

    @Getter
    @Setter
    protected String cardNo;
    protected String userName;

    public Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }
}



