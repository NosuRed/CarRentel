package sample;

public class Controller {
    private FordMustang ford = new FordMustang("Ford Mustang GT",99.00,0.20, 50.0,"Big wheels", "Winterpacket", "Cabrio");
    private ChevroletCamaro chevroletCamaro = new ChevroletCamaro("Chevrolet Camaro", 129.0, 0.35, 75,"Extra Spoiler", "Sound-Packet", "Winterpacket");
    private DodgeViperGT dodgeViperGT = new DodgeViperGT("Dodge Viper GT", 199.0, 0.50,100,"Tuning 1", "Tuning 2", "Tuning 3");
    private HondaCivi get = new HondaCivi("Honda Civic Type R", 75.0, 0.15, 25,"Automatic","Soundpacket", "Winterpaket");



    public FordMustang getFord() {
        return ford;
    }

    public ChevroletCamaro getChevroletCamaro() {
        return chevroletCamaro;
    }

    public DodgeViperGT getDodgeViperGT() {
        return dodgeViperGT;
    }

    public HondaCivi getHondaCivi() {
        return get;
    }


}

