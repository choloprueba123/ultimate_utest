package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import model.AcademyChocairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Create;
import tasks.Join;
import tasks.OpenUp;

import java.util.List;


public class ChoucairStepDefinitions {
    @Before
    public void star(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que Brandon intentar hacer una automatizacion$")
    public void queBrandonIntentarHacerUnaAutomatizacion(List<AcademyChocairData> academyChocairData) throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Join.onThePage(academyChocairData.get(0).getStrFirstName(),academyChocairData.get(0).getStrLastName(),academyChocairData.get(0).getStrEmail(),academyChocairData.get(0).getStrMounth(),academyChocairData.get(0).getStrDay(),academyChocairData.get(0).getStrYear()));

    }


    @When("^Brandon logra encontrar la forma de creacion en (.*) de usuarios$")
    public void brandonLograEncontrarLaFormaDeCreacionEnUtestDeUsuarios(String Utest, List<AcademyChocairData> academyChocairData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Create.the(Utest,academyChocairData.get(0).getStrZipCode(),academyChocairData.get(0).getStrPass(),academyChocairData.get(0).getStrPassRepeat()));

     ;

    }

    @Then("^conseguimos automatizar la creacion de usuarios en (.*)$")
    public void conseguimosAutomatizarLaCreacionDeUsuariosEnUtest(String question) {


    }

}
