package net.alekz.springboot.testapp.repositories;

import net.alekz.springboot.testapp.models.Cuenta;

import java.util.List;

/**
 * @author alekz on 11/12/22
 */
public interface CuentaRepository {
    List<Cuenta> findAll();
    Cuenta findById(Long id);
    void update(Cuenta cuenta);
}
