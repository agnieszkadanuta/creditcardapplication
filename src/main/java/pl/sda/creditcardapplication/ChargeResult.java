package pl.sda.creditcardapplication;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ChargeResult {

    private LocalDateTime chargeDateTime;
    private boolean successful;
    private String declineMessage;
}
