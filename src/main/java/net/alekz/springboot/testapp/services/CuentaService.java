package net.alekz.springboot.testapp.services;

import net.alekz.springboot.testapp.models.Cuenta;

import java.math.BigDecimal;

/**
 * @author alekz on 11/12/22
 */
public interface CuentaService {
    Cuenta findById(Long id);
    int obtenerTotalTransferencias(Long bancoId);
    BigDecimal obtenerSaldo(Long cuentaId);
    void transferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal monto, Long bancoId);
}
