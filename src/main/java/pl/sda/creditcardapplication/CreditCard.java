package pl.sda.creditcardapplication;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreditCard {

    private  String number;
    private String owner;
    private String expiryDate;
    private int ccv;

}
