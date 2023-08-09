package net.alekz.springboot.testapp;

import net.alekz.springboot.testapp.models.Banco;
import net.alekz.springboot.testapp.models.Cuenta;

import java.math.BigDecimal;

/**
 * @author alekz on 08/08/23
 */
public class Datos {
    public static final Cuenta CUENTA_001 = new Cuenta(1L,"Andrés",new BigDecimal("1000"));
    public static final Cuenta CUENTA_002 = new Cuenta(2L,"John",new BigDecimal("2000"));

    public static final Banco BANCO_001 = new Banco(1L, "Banco Financiero", 0);
}
