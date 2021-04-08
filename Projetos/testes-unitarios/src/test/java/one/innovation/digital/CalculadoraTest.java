package one.innovation.digital;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma);
    }

//    @Test
//    public void testSomarMock(){
//        Calculadora calculadora = mock(Calculadora.class);
//
//        when(calculadora.somar("1+2")).thenReturn(10);
//        int resultado = calculadora.somar("1+2");
//
//        assertEquals(10, resultado);
//    }

}
