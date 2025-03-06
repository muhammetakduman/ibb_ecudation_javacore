package org.example.tutorials._5_week;

import java.util.Locale;

public class Week_5_03_Innerclass {
    //veriable
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName.toLowerCase(Locale.ROOT);
    }


    //Inner class
    public static class city{
        //veriable

        private String  cityName;

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }
//getter-setter

    }//end inner class
}//end country

class MainInnerClass{
    public static void main(String[] args) {
        //country
        Week_5_03_Innerclass country = new Week_5_03_Innerclass();
        country.setCountryName("TURKIYE");
        //city
        Week_5_03_Innerclass.city city = new Week_5_03_Innerclass.city();
        city.setCityName("ISTANBUL");
        System.out.println("Ulke :" + country.getCountryName()+" "+  "Sehir:"+city.getCityName());

    }
}
