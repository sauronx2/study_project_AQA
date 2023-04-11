package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;

public class Utils {
    private final static Random random = new SecureRandom();

    public static int randomNum(int size) {
        return random.nextInt(size);
    }

    public static int randomNum() {
        return random.nextInt();
    }

    private static final Faker faker_ua = new Faker(new Locale("uk"));
    private static final Faker faker_en = new Faker(new Locale("en-US"));

    //String name = faker_ua.name().fullName(); // Miss Samanta Schmidt
    public static String getRandomFirstName() {
        return faker_ua.name().firstName();
    }

    public static String getRandomLastName() {
        return faker_ua.name().lastName();
    }

    public static String getRandomEmail() {
        return faker_en.internet().emailAddress();
    }

    public static String getRandomPassword() {
        return faker_ua.internet().password();
    }

    public static String getRandomCompany() {
        return String.valueOf(faker_ua.company());
    }

    public static String getRandomCountry() {
        return faker_en.country().name();
    }

    public static String getRandomCity() {
        return faker_ua.address().cityName();
    }

    public static String getRandomAddress1() {
        return faker_ua.address().streetAddress();
    }

    public static String getRandomZipPostalCod() {
        return faker_ua.address().zipCode();
    }

    public static String getRandomPhoneNumber() {
        return faker_ua.phoneNumber().cellPhone();
    }
    public static String getRandomFax(){
        return String.valueOf(faker_ua.address().hashCode());
    }

}

