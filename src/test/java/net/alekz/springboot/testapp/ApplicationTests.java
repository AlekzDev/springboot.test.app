package net.alekz.springboot.testapp;

import net.alekz.springboot.testapp.repositories.BancoRepository;
import net.alekz.springboot.testapp.repositories.CuentaRepository;
import net.alekz.springboot.testapp.services.CuentaService;
import net.alekz.springboot.testapp.services.CuentaServiceImpl;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class ApplicationTests {

	CuentaRepository cuentaRepository;
	BancoRepository bancoRepository;

	CuentaService cuentaService;

	@BeforeEach
	void setUp() {
		cuentaRepository = mock(CuentaRepository.class);
		bancoRepository = mock(BancoRepository.class);
		cuentaService = new CuentaServiceImpl(cuentaRepository,bancoRepository);

		when(cuentaRepository.findById(1L)).thenReturn(Datos.CUENTA_001);
		when(cuentaRepository.findById(2L)).thenReturn(Datos.CUENTA_002);
		when(bancoRepository.findById(1L)).thenReturn(Datos.BANCO_001);
	}

	@Test
	void contextLoads() {
		BigDecimal saldo001 = cuentaService.obtenerSaldo(1L);
		BigDecimal saldo002 = cuentaService.obtenerSaldo(2L);

		assertEquals("1000", saldo001.toPlainString());
		assertEquals("2000", saldo002.toPlainString());

		verify(cuentaRepository, times(2)).findById(anyLong());
	}

	@Test
	void transferirSaldo() {
		cuentaService.transferir(1L, 2L, new BigDecimal("100"), 1L);
		BigDecimal saldoCuentaOrigen = cuentaService.obtenerSaldo(1L);
		BigDecimal saldoCuentaDestino = cuentaService.obtenerSaldo(2L);

		assertEquals("900",saldoCuentaOrigen.toPlainString());
		assertEquals("2100",saldoCuentaDestino.toPlainString());
	}
}
