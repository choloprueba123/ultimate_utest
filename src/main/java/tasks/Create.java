package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CreateUser;

public class Create implements Task {

    private String utest;
    private String strZipCode;
    private String strPass;
    private String strPassRepeat;

    public Create(String utest, String strZipCode, String strPass, String strPassRepeat) {
        this.utest = utest;
        this.strZipCode = strZipCode;
        this.strPass = strPass;
        this.strPassRepeat = strPassRepeat;
    }

    public static Create the(String utest, String strZipCode, String strPass, String strPassRepeat) {
        return Tasks.instrumented(Create.class,utest,strZipCode,strPass,strPassRepeat);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strZipCode).into(CreateUser.CAM_ZIP_CODE),
                Click.on(CreateUser.BUTTON_DEVICES),
                Click.on(CreateUser.SELECT_COMPUTER),
                Click.on(CreateUser.SELECT_COMPUTER_TARGET),
                Click.on(CreateUser.SELECT_VERSION),
                Click.on(CreateUser.SELECT_VERSION_TARGET),
                Click.on(CreateUser.SELECT_LENGUAGE),
                Click.on(CreateUser.SELECT_LENGUAGE_TARGET),
                Click.on(CreateUser.SELECT_MOBILE_DEVICES),
                Click.on(CreateUser.SELECT_MOBILE_DEVICES_TARGET),
                Click.on(CreateUser.SELECT_MOBILE_MODEL),
                Click.on(CreateUser.SELECT_MOBILE_MODEL_TARGET),
                Click.on(CreateUser.SELECT_OP_SYS),
                Click.on(CreateUser.SELECT_OP_SYS_TARGET),
                Click.on(CreateUser.SECOND_BUTTOM),
                Enter.theValue(strPass).into(CreateUser.CAM_PASS_FINAL),
                Enter.theValue(strPassRepeat).into(CreateUser.CAM_PASS_FINAL_REPEAT),
                Click.on(CreateUser.CHECK_BOX_FIRST),
                Click.on(CreateUser.CHECK_BOX_SECOND),
                Click.on(CreateUser.BUTTON_FINAL)

        );



    }
}
