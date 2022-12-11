package net.alekz.springboot.testapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.alekz.springboot.testapp.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;

/**
 * @author alekz on 11/12/22
 */
@NoArgsConstructor
@AllArgsConstructor
public @Data class Cuenta {
    private Long id;
    private String nombre;
    private BigDecimal saldo;

    public void credito(BigDecimal credito){
        this.saldo = this.saldo.add(credito);
    }

    public void debito(BigDecimal debito){
        BigDecimal nuevoSaldo = this.saldo.subtract(debito);
        if(nuevoSaldo.compareTo(BigDecimal.ZERO) < 0)
            throw new DineroInsuficienteException("Saldo insuficiente");

        this.saldo = nuevoSaldo;
    }

}
