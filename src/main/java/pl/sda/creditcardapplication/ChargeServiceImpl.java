package pl.sda.creditcardapplication;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ChargeServiceImpl implements ChargeService  {
    @Override
    public ChargeResult charge(ChargeRequest chargeRequest) {
        ChargeResult chargeResult = new ChargeResult();
        chargeResult.setChargeDateTime(LocalDateTime.now());
        chargeResult.setSuccessful(true);
        chargeResult.setDeclineMessage("");
        return chargeResult;
    }
}
