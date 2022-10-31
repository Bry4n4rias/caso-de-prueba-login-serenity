package starter.register;

import com.sun.org.apache.regexp.internal.RE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static net.serenitybdd.screenplay.Tasks.instrumented;



public class DoRegister implements Task {

    private final String  email, firstName, lastName,  password, dayBirth, monthBirth, yearBirth, address, city, state, postalCode, country, mobilePhone;


    public DoRegister(String email, String firstName, String lastName,  String password, String dayBirth, String monthBirth, String yearBirth,String address, String city, String state, String postalCode, String country, String mobilePhone) {

        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.mobilePhone = mobilePhone;
    }


    public static Performable withDataOfRegister(String email, String firstName, String lastName,  String password, String dayBirth, String monthBirth, String yearBirth,String address, String city, String state, String postalCode, String country, String mobilePhone){
        return instrumented(DoRegister.class, email, firstName, lastName,  password, dayBirth, monthBirth, yearBirth,address, city, state, postalCode, country, mobilePhone);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(email).into(RegisterForm.EMAIL_FIELD),
                Click.on(RegisterForm.PREVIUS_CREATE_ACCOUNT_BUTTON),
                Click.on(RegisterForm.GENDER_FIELD),
                Enter.theValue(firstName).into(RegisterForm.FIRS_NAME_FIELD),
                Enter.theValue(lastName).into(RegisterForm.LAST_NAME_FIELD),
                Enter.theValue(password).into(RegisterForm.PASSWORD_FIELD),
                SelectFromOptions.byIndex(Integer.valueOf(dayBirth)).from(RegisterForm.DAY_BIRTH_FIELD),
                SelectFromOptions.byIndex(Integer.valueOf(monthBirth)).from(RegisterForm.MONTH_BIRTH_FIELD),
                SelectFromOptions.byIndex(Integer.valueOf(yearBirth)).from(RegisterForm.YEAR_BIRTH_FIELD),
                Enter.theValue(address).into(RegisterForm.ADDRESS_FIELD),
                Enter.theValue(city).into(RegisterForm.CITY_FIELD),
                SelectFromOptions.byIndex(Integer.valueOf(state)).from(RegisterForm.STATE_FIELD),
                Enter.theValue(postalCode).into(RegisterForm.POSTAL_CODE_FIELD),
                SelectFromOptions.byIndex(Integer.valueOf(country)).from(RegisterForm.COUNTRY_FIELD),
                Enter.theValue(mobilePhone).into(RegisterForm.MOBILE_PHONE_FIELD),
                Click.on(RegisterForm.REGISTER_BUTTON)
        );

    }
}
