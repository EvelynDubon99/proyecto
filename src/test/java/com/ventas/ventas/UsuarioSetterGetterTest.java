package com.ventas.ventas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UsuarioSetterGetterTest extends VentasApplicationTests {

    public Usuarios user = new Usuarios();

    @Test
    public void testNombreUsuario() {
        user.setContraseña("aaa");
        user.setId_tipo_usuario(1);
        user.setId_usuario(48);
        user.setUsuario("Empleado01");

        assertEquals("aaa", user.getContraseña());
        assertEquals(1, user.getId_tipo_usuario());
        assertEquals(48, user.getId_usuario());
        assertEquals("Empleado01", user.getUsuario());
    }

}
