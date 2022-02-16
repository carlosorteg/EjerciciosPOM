package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import steps.agregarStep;

public class agregarDefinitions {

    @Steps
    agregarStep ingresapcnuevo;

    @Dado("que el usuario ingresa a la pagina para agregar un pc")
    public void que_el_usuario_ingresa_a_la_pagina_para_agregar_un_pc() {
    ingresapcnuevo.abrirUrl();
    ingresapcnuevo.nuevopc();
    }

    @Cuando("diligencia el formulario registrando el nombre {string}, {string}, {string}, {string}\"")
    public void diligencia_el_formulario_registrando_el_nombre(String computador1, String ingreso, String vencimiento, String compania) {
    ingresapcnuevo.crearpc(computador1, ingreso, vencimiento, compania);
    }

    @Entonces("se crea un nuevo pc")
    public void se_crea_un_nuevo_pc() {
        ingresapcnuevo.alerta();
    }

    @Cuando("diligenciar el formulario con valores errados {string}, {string}, {string}, {string}\"")
    public void diligenciar_el_formulario_con_valores_errados(String computador1, String ingreso, String vencimiento, String compania) {
        ingresapcnuevo.crearpc(computador1, ingreso, vencimiento, compania);
    }

    @Entonces("no permite crear un computador por valores errados")
    public void no_permite_crear_un_computador_por_valores_errados() {
    ingresapcnuevo.alertaFallida();
    }


}
