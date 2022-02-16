package pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Before;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;

@DefaultUrl("http://computer-database.gatling.io/computers")

public class agregarPage extends PageObject {

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    //Boton agregar
    @FindBy (id="add")
    public WebElementFacade btnagregar;

    //Campo nombre
    @FindBy (id="name")
    public WebElementFacade inputnombre;

    @FindBy (id="introduced")
    public WebElementFacade inputintroducir;

    @FindBy (id="discontinued")
    public WebElementFacade inputvencimiento;

    @FindBy (id="company")
    public WebElementFacade selectcompania;

    @FindBy (xpath="//*[@id=\"main\"]/form/div/input")
    public WebElementFacade btncrear;

    @FindBy (xpath = "//*[@id=\"main\"]/div[1]")
    public WebElementFacade msncreado;

    @FindBy (xpath = "//*[@id=\"main\"]/form/fieldset/div[1]/div/span")
    public WebElementFacade msnFallidoCampoNombre;

    @FindBy (xpath = "//*[@id=\"main\"]/form/fieldset/div[2]/div/span")
    public WebElementFacade msnFallidoCampoIngreso;

    @FindBy (xpath = "//*[@id=\"main\"]/form/fieldset/div[3]/div/span")
    public WebElementFacade msnFallidoCampoVencimiento;


    public void Agregarpc()
    {
        btnagregar.click();
    }

    public void Crearpc(String computador2, String ingreso2, String vencimiento2, String compania2)
    {
        inputnombre.sendKeys(computador2);
        inputintroducir.sendKeys(ingreso2);
        inputvencimiento.sendKeys(vencimiento2);
        selectcompania.selectByValue(compania2);
        btncrear.click();
    }

    //Metodo para los acetr y comparacion del texto del mensaje exitoso
    public void AlertaExitosa (){
        String varMensaje = msncreado.getText(); //Se trae la variable del xpath y se convierte a string
        assertThat(varMensaje,containsText("Done"));
    }

    public void AlertasFallidas (){
        String varMensajeF1 = msnFallidoCampoNombre.getText();
        assertThat(varMensajeF1,containsText("Failed"));
        String varMensajeF2 = msnFallidoCampoIngreso.getText();
        assertThat(varMensajeF2,containsText("Failed"));
        String varMensajeF3 = msnFallidoCampoVencimiento.getText();
        assertThat(varMensajeF3,containsText("Failed"));
    }

}
