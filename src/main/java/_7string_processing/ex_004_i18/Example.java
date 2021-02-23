package _7string_processing.ex_004_i18;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Example {

    enum Country{
        US("en"),
        PL("pl");

        String language;

        Country(String language) {
            this.language = language;
        }

        public String getLanguage() {
            return language;
        }
    }

    static public void main(String[] args) throws UnsupportedEncodingException {

        final Country country = Country.PL;

        // The Locale object identifies a particular language and country.
        final Locale currentLocale = new Locale(country.getLanguage(), country.toString());

        // ResourceBundle objects contain locale-specific objects.
        // You use ResourceBundle objects to isolate locale-sensitive data, such as translatable text.
        final ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        System.out.println(messages.getString("firstString"));
        System.out.println(messages.getString("secondString"));
        System.out.println(messages.getString("question"));
    }

}
