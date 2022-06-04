package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Europe implements SandStorage {

    @Override
    public BigDecimal getSandBeamsQuantity() {
        BigDecimal sandQuantity = new BigDecimal("12345678901234567890L;");
        return sandQuantity;
    }
}
