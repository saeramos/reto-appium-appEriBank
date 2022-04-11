package com.co.appiumReto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.appiumReto.userinterfaces.HomePage.BTN_MAKE_PAYMENT;

public class HomeBalance implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BTN_MAKE_PAYMENT.resolveFor(actor).isVisible();
    }
    public static HomeBalance isVisible()  {
        return new HomeBalance();
    }
}
