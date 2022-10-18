package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class InformationPage extends PageObject {
    public static final Target INPUT_NAME = Target.the("write the name").
            located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("write the lastname").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("write the email").
            located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("write the month")
            .located(By.xpath("//div[@class='col-xs-5 col-md-5 col-lg-5 months']//*[contains(text(),'December')]"));
    public static final Target SELECT_DAY = Target.the("write the day")
            .located(By.xpath("//div[@class='col-xs-3 col-md-3 col-lg-3 days']//*[contains(text(),'12')]"));
    public static final Target SELECT_YEAR = Target.the("write the year")
            .located(By.xpath("//div[@class='col-xs-4 col-md-4 col-lg-4 years']//*[contains(text(),'1996')]"));
    public static final Target NEXT_LOCATION = Target.the("next location of register")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));
    public static final Target NEXT_DEVICES = Target.the("next location of register")
            .located(By.xpath("//a[contains(@class,'btn btn-blue pull-right')]"));
    public static final Target SYSTEM_INPUT = Target.the("next location of register")
            .located(By.xpath("//div[@class='ui-select-match']/span[1]"));
    public static final Target SYSTEM_SELECT = Target.the("next location of register")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Windows')]"));
    public static final Target INPUT_VERSION = Target.the("next location of register")
            .located(By.xpath("//div[@class='ui-select-match']//span[contains(text(), 'Select a Version')]"));
    public static final Target SELECT_VERSION = Target.the("next location of register")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Windows 11')]"));

    public static final Target INPUT_LANGUAGE = Target.the("next location of register")
            .located(By.xpath("//div[@class='ui-select-match']//span[contains(text(), 'Select OS language')]"));
    public static final Target SELECT_LANGUAGE = Target.the("next location of register")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Spanish')]"));

    public static final Target INPUT_MOBILE = Target.the("next location of register")
            .located(By.xpath("//div[@class='ui-select-match']//span[contains(text(), 'Select Brand' )]"));

    public static final Target SELECT_MOBILE = Target.the("next location of register")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Xiaomi')]"));

    public static final Target INPUT_MODEL = Target.the("next location of register")
            .located(By.xpath("//div[@class='ui-select-match']//span[contains(text(), 'Select a Model')]"));

    public static final Target SELECT_MODEL = Target.the("next location of register")
            .located(By.xpath("//span[@class='ui-select-choices-row-inner']//div[contains(text(), 'Redmi Note 10 Pro' )]"));

    public static final Target OPERATIVE_INPUT = Target.the("next location of register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span/span[1]"));

    public static final Target OPERATIVE_SELECT = Target.the("next location of register")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));

    public static final Target NEXT_LAST_STEP = Target.the("next location of register")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("next location of register")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("next location of register")
            .located(By.id("confirmPassword"));

    public static final Target TERMS_USE = Target.the("next location of register")
            .located(By.xpath("//label[@class='input-check-box signup-consent']//span[1]"));

    public static final Target PRIVACY_SECURITY = Target.the("next location of register")
            .located(By.xpath("//label[@class='input-check-box signup-consent']//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));

    public static final Target COMPLETE_SETUP = Target.the("next location of register")
            .located(By.xpath("//div[@class='pull-right next-step']//span[contains(text(), 'Complete Setup')]"));

    public static final Target END_REGISTER = Target.the("next location of register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/div/ui-view/div/div/div/div[1]/div/h1"));


}
