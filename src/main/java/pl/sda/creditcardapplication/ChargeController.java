package pl.sda.creditcardapplication;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargeController {

    private final ChargeService chargeService;

    public ChargeController(ChargeService chargeService){
        this.chargeService = chargeService;
    }

    @PostMapping("/chargeRequest")
    public ChargeResult charge(@RequestBody ChargeRequest chargeRequest){
        return chargeService.charge(chargeRequest);
    }

}
