package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateUser extends PageObject {
    public static final Target CAM_ZIP_CODE = Target.the("field where we place the region code").located(By.xpath("//*[@id=\"zip\"]"));


    public static final Target BUTTON_DEVICES = Target.the("the button that shows the devices section").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));


    public static final Target SELECT_COMPUTER = Target.the("the field that displays the computer software selection").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target SELECT_COMPUTER_TARGET = Target.the("selection ChromeOS").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[7]/span/div"));


    public static final Target SELECT_VERSION = Target.the("the field that displays the computer software version selection").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_VERSION_TARGET = Target.the("selection ChromeOS 118").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[47]/span/div"));


    public static final Target SELECT_LENGUAGE = Target.the("the field that displays the lenguage").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_LENGUAGE_TARGET = Target.the("Lenguage Spanish").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[40]/span/div"));


    public static final Target SELECT_MOBILE_DEVICES = Target.the("the field to select the mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOBILE_DEVICES_TARGET = Target.the("selection Apple").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span/div"));


    public static final Target SELECT_MOBILE_MODEL = Target.the("the field to select the model mobile device").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOBILE_MODEL_TARGET = Target.the("IPhone 6S Plus").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[37]/span/div"));


    public static final Target SELECT_OP_SYS = Target.the("the field to select the system operative").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OP_SYS_TARGET = Target.the("IOS 12.0.1").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[36]/span/div"));


    public static final Target SECOND_BUTTOM = Target.the("").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));


    public static final Target CAM_PASS_FINAL = Target.the("fill in the last password").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target CAM_PASS_FINAL_REPEAT = Target.the("fill in where place the last password repeat").located(By.xpath("//*[@id=\"confirmPassword\"]"));


    public static final Target CHECK_BOX_FIRST = Target.the("The first checkbox selection").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_BOX_SECOND = Target.the("The second checkbox selection").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_FINAL = Target.the("The last botton to create the user").located(By.xpath("//*[@id=\"laddaBtn\"]/span"));
}
