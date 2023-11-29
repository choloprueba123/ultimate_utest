package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoin extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("the button that shows us the form to create a user").located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target CAM_FIRST_NAME = Target.the("field where we write the first name").located(By.id("firstName"));

    public static final Target CAM_LAST_NAME = Target.the("field where we write the last name").located(By.id("lastName"));


    public static final  Target CAM_EMAIL = Target.the("field where we write the email").located(By.id("email"));


    public static final Target MOUNTH_SELECT_BIRTH = Target.the("field where we select our birthday mounth").located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target DAY_SELECT_BIRTH = Target.the("field where we select our birthday day").located(By.xpath("//*[@id=\"birthDay\"]"));


    public static final Target YEAR_SELECT_BIRTH = Target.the("field where we select our birthday year").located(By.xpath("//*[@id=\"birthYear\"]"));

    public  static final Target FIRST_BUTTON = Target.the("The button is selected to go to the second part").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
