package com.strategy.strategy.frete;

import com.strategy.strategy.frete.Frete;

public class FreteComum implements Frete {
    @Override
    public Float calcula(Float price) {
        return price * 0.05F;
    }
}
