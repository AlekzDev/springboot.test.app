package net.alekz.springboot.testapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author alekz on 11/12/22
 */
@NoArgsConstructor
@AllArgsConstructor
public @Data class Banco {
    private Long id;
    private String nombre;
    private int totalTransferencias;
}
