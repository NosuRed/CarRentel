package sample;

import java.util.ArrayList;

public class Cars {

    private String CarName;
    private double defaultPrice;
    private double pricePerKm;
    private double ageFee;


    private String special1;
    private String special2;
    private String special3;




    public Cars(String carName, double defaultPrice, double pricePerKm, double ageFee , String special1, String special2, String special3){
        this.CarName = carName;
        this.defaultPrice = defaultPrice;
        this.pricePerKm = pricePerKm;
        this.special1 = special1;
        this.special2 = special2;
        this.special3 = special3;
        this.ageFee = ageFee;

    }


    public String getCarName() {
        return CarName;
    }

    public String getSpecial1() {
        return special1;
    }

    public String getSpecial2() {
        return special2;
    }

    public String getSpecial3() {
        return special3;
    }



    public double getDefaultPrice() {
        return defaultPrice;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double getAgeFee() {
        return ageFee;
    }
}

