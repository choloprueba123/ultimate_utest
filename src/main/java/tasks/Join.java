package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UtestJoin;

public class Join implements Task {

    public Join(String strFirstName, String strLastName, String strEmail, String strMounth, String strDay, String strYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMounth = strMounth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    private String strMounth;

    private String strDay;

    private String strYear;
    public static Join onThePage(String strFirstName, String strLastName, String strEmail, String strMounth, String strDay, String strYear) {
        return Tasks.instrumented(Join.class,strFirstName,strLastName,strEmail,strMounth,strDay,strYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestJoin.JOIN_BUTTON),
                Enter.theValue(strFirstName).into(UtestJoin.CAM_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestJoin.CAM_LAST_NAME),
                Enter.theValue(strEmail).into(UtestJoin.CAM_EMAIL),
                SelectFromOptions.byVisibleText(strMounth).from(UtestJoin.MOUNTH_SELECT_BIRTH),
                SelectFromOptions.byVisibleText(strDay).from(UtestJoin.DAY_SELECT_BIRTH),
                SelectFromOptions.byVisibleText(strYear).from(UtestJoin.YEAR_SELECT_BIRTH),
                Click.on(UtestJoin.FIRST_BUTTON)


        );
    }
}


