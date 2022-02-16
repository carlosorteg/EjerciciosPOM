package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.agregarPage;

public class agregarStep {

    agregarPage agregandopcPage;

    @Step
    public void abrirUrl()
    {
        agregandopcPage.open();
    }

    public void nuevopc()
    {
        agregandopcPage.Agregarpc();

    }


    public void crearpc(String computador2, String ingreso2, String vencimiento2, String compania2)
    {
        agregandopcPage.Crearpc(computador2, ingreso2, vencimiento2, compania2);

    }

    public void alerta(){
        agregandopcPage.AlertaExitosa();
    }

    public void alertaFallida() {agregandopcPage.AlertasFallidas();}

}
