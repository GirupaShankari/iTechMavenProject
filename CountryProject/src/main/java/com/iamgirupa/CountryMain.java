package com.iamgirupa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountryMain {

    public static void main(String arg[])throws IOException
    {
        CountryFinder cf=new CountryFinder();

        System.out.println("Enter country code ");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine();
        String result = cf.findCountryCodeDetails(code);
        System.out.println(result);



    }
}
