package net.alekz.springboot.testapp.repositories;

import net.alekz.springboot.testapp.models.Banco;

import java.util.List;

/**
 * @author alekz on 11/12/22
 */
public interface BancoRepository {
    List<Banco> findAll();
    Banco findById(Long id);
    void update(Banco banco);
}
