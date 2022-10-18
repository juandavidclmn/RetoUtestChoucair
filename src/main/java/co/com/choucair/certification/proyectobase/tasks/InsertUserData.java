package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.InformationPage;
import co.com.choucair.certification.proyectobase.userinterface.JoinPage;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertUserData implements Task {

    private String strName, strLastName, strEmail, strPassword, strConfirmPassword;

    public InsertUserData(String strName, String strLastName, String strEmail, String strPassword, String strConfirmPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;

    }

    public static InsertUserData the (String strName, String strLastName, String strEmail, String strPassword, String strConfirmPassword){
        return Tasks.instrumented(InsertUserData.class, strName, strLastName, strEmail, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinPage.JOIN_BUTTON),
                Enter.theValue(strName).into(InformationPage.INPUT_NAME),
                Enter.theValue(strLastName).into(InformationPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(InformationPage.INPUT_EMAIL),
                Click.on(InformationPage.SELECT_MONTH),
                Click.on(InformationPage.SELECT_DAY),
                Click.on(InformationPage.SELECT_YEAR),
                Click.on(InformationPage.NEXT_LOCATION),
                Click.on(InformationPage.NEXT_DEVICES),
                Click.on(InformationPage.SYSTEM_INPUT),
                Click.on(InformationPage.SYSTEM_SELECT),
                Click.on(InformationPage.INPUT_VERSION),
                Click.on(InformationPage.SELECT_VERSION),
                Click.on(InformationPage.INPUT_LANGUAGE),
                Click.on(InformationPage.SELECT_LANGUAGE),
                Click.on(InformationPage.INPUT_MOBILE),
                Click.on(InformationPage.SELECT_MOBILE),
                Click.on(InformationPage.INPUT_MODEL),
                Click.on(InformationPage.SELECT_MODEL),
                Click.on(InformationPage.OPERATIVE_INPUT),
                Click.on(InformationPage.OPERATIVE_SELECT),
                Click.on(InformationPage.NEXT_LAST_STEP),
                Enter.theValue(strPassword).into(InformationPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(InformationPage.CONFIRM_PASSWORD),
                Click.on(InformationPage.TERMS_USE),
                Click.on(InformationPage.PRIVACY_SECURITY),
                Click.on(InformationPage.COMPLETE_SETUP));

    }
}
