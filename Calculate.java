package sample;



public class Calculate {
    private double defaultPrice;
    private double priceKM;
    private double priceSmoker;
    private double priceChildSeat;
    private double ageFee;
    private double daysRented;
    double exKM;


    /**
     * The prices of the different options get set, also checks if the checkboxes are true/false
     * @param defaultPrice
     * @param priceKM
     * @param priceSmoker
     * @param priceChildSeat
     * @param age
     * @param excpectedKm
     * @param ageFee
     * @param daysRented
     */
    public  Calculate(double defaultPrice, double priceKM, boolean priceSmoker, boolean priceChildSeat, boolean age, double excpectedKm, double ageFee, double daysRented){
        this.exKM = excpectedKm;
        this.priceKM = priceKM * this.exKM;
        this.daysRented = daysRented;
        this.defaultPrice = defaultPrice * this.daysRented;

        if (priceSmoker){
            this.priceSmoker = 25;
        }
        if (priceChildSeat){
        this.priceChildSeat = 5;}

        if (age){
            this.ageFee = ageFee;

        }
    }

    /**
     * Creates the sum of all price options
     * @return the sum as a string
     */
    public String calc(){

        double sum = defaultPrice + priceSmoker + priceKM + priceChildSeat + ageFee;
        return "" + sum + "Euro";
    }
}
