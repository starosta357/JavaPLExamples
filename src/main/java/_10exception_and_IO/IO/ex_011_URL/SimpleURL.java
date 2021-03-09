package _10exception_and_IO.IO.ex_011_URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class SimpleURL {
    public static void main(String[] args) throws MalformedURLException {
        URL nbuApi = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(nbuApi.openStream(), StandardCharsets.UTF_8));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
