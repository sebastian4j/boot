package com.sebastian.boot.dos;

import org.junit.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;


public class BootDosApplicationTests {
	final Multiplicador multi = Mockito.mock(Multiplicador.class);
	final Multiplicador itlum = new Multiplicador(); 
	@Test
	public void operacion() {
		when(multi.multiplicar(2, 2)).thenReturn(4);
		multi.multiplicar(2, 2);
		verify(multi, times(1)).multiplicar(2, 2);
		assertThat(itlum.multiplicar(2, 2)).isEqualTo(4);
		assertThat(itlum.esOperacion("*")).isEqualTo(true);
		assertThat(itlum.esOperacion("/")).isEqualTo(false);
	}

}
