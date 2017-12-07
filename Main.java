package sample;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Main extends Application {
    private double defaultPrice;
    private double pricePerKm;
    private double smokerPrice;
    private double childSeatPrice;
    private double u25;
    private double excpectedKM;
    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox root = new VBox();
        HBox rentACarBox = new HBox();
        Label rentACarLabel = new Label();

        rentACarLabel.setText("Rent a Car!");

        Pane rentACarBoxSpacer = new Pane();
        Pane rentACarBoxSpacer2 = new Pane();

        HBox.setHgrow(rentACarBoxSpacer, Priority.ALWAYS);
        HBox.setHgrow(rentACarBoxSpacer2, Priority.ALWAYS);


        rentACarBox.getChildren().addAll(rentACarBoxSpacer, rentACarLabel, rentACarBoxSpacer2);
        Controller controller = new Controller();
        HBox carsAndSpFeatures = new HBox();
        ComboBox comboBoxCars = new ComboBox();
        ComboBox spFeatures = new ComboBox();
        spFeatures.setDisable(true);

        ObservableList carList = FXCollections.observableArrayList();
        ObservableList specialFeatureList = FXCollections.observableArrayList();


        carList.add(controller.getFord().getCarName());
        carList.add(controller.getHondaCivi().getCarName());
        carList.add(controller.getChevroletCamaro().getCarName());
        carList.add(controller.getDodgeViperGT().getCarName());

        comboBoxCars.setItems(carList);
        comboBoxCars.prefWidth(250);
        comboBoxCars.setValue("Cars");

        spFeatures.setItems(specialFeatureList);
        spFeatures.setValue("Special Features");
        comboBoxCars.prefWidth(250);





        Pane spacer = new Pane();
        Pane spacer1 = new Pane();
        Pane spacer2 = new Pane();
        HBox.setHgrow(spacer, Priority.ALWAYS);
        HBox.setHgrow(spacer1, Priority.ALWAYS);
        HBox.setHgrow(spacer2, Priority.ALWAYS);


        carsAndSpFeatures.getChildren().add(spacer);
        carsAndSpFeatures.getChildren().add(comboBoxCars);
        carsAndSpFeatures.getChildren().add(spacer1);
        carsAndSpFeatures.getChildren().add(spFeatures);
        carsAndSpFeatures.getChildren().add(spacer2);




        GridPane additionalOptions = new GridPane();
        CheckBox childSeat = new CheckBox("Additional seat for a child ");
        CheckBox ageUnder25 = new CheckBox("You are under the age of 25 ");
        CheckBox smoker = new CheckBox("Please select this option if you smoke!");
        GridPane.setRowIndex(childSeat, 0);
        GridPane.setRowIndex(ageUnder25, 2);
        GridPane.setRowIndex(smoker,  3);

        additionalOptions.getChildren().add(childSeat);
        additionalOptions.getChildren().add(ageUnder25);
        additionalOptions.getChildren().add(smoker);
        ColumnConstraints column1 = new ColumnConstraints(100,100, Double.MAX_VALUE);
        column1.setHgrow(Priority.ALWAYS);
        additionalOptions.getColumnConstraints().add(column1);
        additionalOptions.getColumnConstraints().add(new ColumnConstraints(100));



        HBox daysAndKilometerBox = new HBox();
        TextField rentedDays = new TextField();
        TextField estimatedKilometers = new TextField();
        Label daysToRent = new Label("Days to rent: ");
        Label KilometersEstimated = new Label("Please enter estimated Kilometers: ");
        Pane hSpacer = new Pane();
        Pane hSpacer1 = new Pane();
        Pane hSpacer2 = new Pane();

        HBox.setHgrow(hSpacer, Priority.ALWAYS);
        HBox.setHgrow(hSpacer1, Priority.ALWAYS);
        HBox.setHgrow(hSpacer2, Priority.ALWAYS);

        daysAndKilometerBox.getChildren().addAll(hSpacer,daysToRent ,rentedDays, hSpacer1,KilometersEstimated ,estimatedKilometers, hSpacer2);


        HBox priceBox = new HBox();
        Button calculatePriceBtn = new Button("Calculate");
        calculatePriceBtn.setDisable(true);
        Pane priceBoxSpacer = new Pane();
        Pane priceBoxSpacer2 = new Pane();

        HBox.setHgrow(priceBoxSpacer, Priority.ALWAYS);
        HBox.setHgrow(priceBoxSpacer2, Priority.ALWAYS);

        priceBox.getChildren().add(priceBoxSpacer);
        priceBox.getChildren().add(calculatePriceBtn);
        priceBox.getChildren().add(priceBoxSpacer2);

        HBox labelHbox = new HBox();
        Label showPriceLabel = new Label("Price: ");
        Pane labelSpacer = new Pane();
        Pane labelSpacer1 = new Pane();
        HBox.setHgrow(labelSpacer, Priority.ALWAYS);
        HBox.setHgrow(labelSpacer1, Priority.ALWAYS);

        labelHbox.getChildren().addAll(labelSpacer, showPriceLabel, labelSpacer1);

        Pane spacerUsedAtTheTop = new Pane();
        VBox.setVgrow(spacerUsedAtTheTop, Priority.ALWAYS);

        Pane spacerUsedAfterTheLabelonTop = new Pane();
        VBox.setVgrow(spacerUsedAfterTheLabelonTop, Priority.ALWAYS);

        Pane vSpacer2 = new Pane();
        VBox.setVgrow(vSpacer2, Priority.ALWAYS);

        Pane spaceBetweenDaysAndCalculateBtn = new Pane();
        VBox.setVgrow(spaceBetweenDaysAndCalculateBtn, Priority.ALWAYS);


        Pane spaceBetweenBottomEdgeAndPriceBtn = new Pane();
        VBox.setVgrow(spaceBetweenBottomEdgeAndPriceBtn, Priority.ALWAYS);

        Pane labelBottomSpace = new Pane();
        VBox.setVgrow(labelBottomSpace, Priority.ALWAYS);

        root.getChildren().add(rentACarBox);
        root.getChildren().add(spacerUsedAtTheTop);

        root.getChildren().add(carsAndSpFeatures);
        root.getChildren().add(spacerUsedAfterTheLabelonTop);

        root.getChildren().add(additionalOptions);
        root.getChildren().add(vSpacer2);

        root.getChildren().add(daysAndKilometerBox);
        root.getChildren().add(spaceBetweenDaysAndCalculateBtn);

        root.getChildren().add(priceBox);
        root.getChildren().add(spaceBetweenBottomEdgeAndPriceBtn);

        root.getChildren().add(labelHbox);
        root.getChildren().add(labelBottomSpace);


        primaryStage.setTitle("UT-Cars-Vermietung");
        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.setMinWidth(600);
        primaryStage.setMaxWidth(700);
        primaryStage.setMinHeight(450);
        primaryStage.setMaxHeight(500);

        primaryStage.show();



        comboBoxCars.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                calculatePriceBtn.setDisable(false);
                spFeatures.setDisable(false);
                specialFeatureList.clear();
                spFeatures.setValue("Special Features");
                if (controller.getFord().getCarName().equals(newValue)){
                specialFeatureList.addAll(controller.getFord().getSpecial1(), controller.getFord().getSpecial2(), controller.getFord().getSpecial3());
                defaultPrice = controller.getFord().getDefaultPrice();
                pricePerKm = controller.getFord().getPricePerKm();
                u25 = controller.getFord().getAgeFee();

                }else if (controller.getChevroletCamaro().getCarName().equals(newValue)){
                    specialFeatureList.addAll(controller.getChevroletCamaro().getSpecial1(), controller.getChevroletCamaro().getSpecial2(), controller.getChevroletCamaro().getSpecial3());
                    defaultPrice = controller.getChevroletCamaro().getDefaultPrice();
                    pricePerKm = controller.getChevroletCamaro().getPricePerKm();
                    u25 = controller.getChevroletCamaro().getAgeFee();

                }else if( controller.getDodgeViperGT().getCarName().equals(newValue)){
                    specialFeatureList.addAll(controller.getDodgeViperGT().getSpecial1(), controller.getDodgeViperGT().getSpecial2(), controller.getDodgeViperGT().getSpecial3());
                   defaultPrice = controller.getDodgeViperGT().getDefaultPrice();
                   pricePerKm = controller.getDodgeViperGT().getPricePerKm();
                   u25 = controller.getDodgeViperGT().getAgeFee();

                }else if (controller.getHondaCivi().getCarName().equals(newValue)){
                    specialFeatureList.addAll(controller.getHondaCivi().getSpecial1(), controller.getHondaCivi().getSpecial2(), controller.getHondaCivi().getSpecial3());
                    defaultPrice = controller.getHondaCivi().getDefaultPrice();
                    pricePerKm = controller.getHondaCivi().getPricePerKm();
                    u25 = controller.getHondaCivi().getAgeFee();

                }
            }
            });



        calculatePriceBtn.setOnAction(event -> {
            try {

                int valueKilo = Integer.parseInt(estimatedKilometers.getText());
                int valueRentedDays = Integer.parseInt(rentedDays.getText());

                if (valueKilo >= 0 && valueRentedDays  >= 0 ){
                Calculate calculate = new Calculate(defaultPrice, pricePerKm, smoker.isSelected(), childSeat.isSelected(),
                        ageUnder25.isSelected(),
                        valueKilo, u25, valueRentedDays);
                showPriceLabel.setText(calculate.calc());
                }else{
                    showPriceLabel.setText("Negativ numbers are not valid!");
                }

            }catch (java.lang.NumberFormatException e){
                showPriceLabel.setText("Please enter valid number/s!");
            }
        });

    }


    public static void main(String[] args) {
        launch(args);
    }
}
