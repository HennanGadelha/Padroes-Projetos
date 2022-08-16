package com.strategy.strategy.pedido;

import com.strategy.strategy.frete.Frete;

public abstract class Pedido {

    private Float price;
    private Frete tipoFrete;


    public void setTipoFrete(Frete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public abstract Float freteNormal();

    public abstract Float freteExpresso() throws Exception;

    public Float calculaValorFrete(){
        return this.tipoFrete.calcula(this.price);
    }

}
