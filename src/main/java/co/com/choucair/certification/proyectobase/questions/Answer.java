package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.InformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;
public class Answer implements Question <Boolean> {
    private String strConfirmation;

    public Answer(String strConfirmation) {
        this.strConfirmation = strConfirmation;
    }

    public static Answer toThe(String strConfirmation){
        return new Answer(strConfirmation);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String endAnswer = Text.of(InformationPage.END_REGISTER).viewedBy(actor).asString();
        return strConfirmation.equals(endAnswer);
    }
}
