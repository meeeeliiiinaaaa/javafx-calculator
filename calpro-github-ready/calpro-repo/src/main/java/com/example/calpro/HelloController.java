package com.example.calpro;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.System.exit;


import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane1;
    @FXML
    private Pane mainpane1;
    @FXML
    private Pane mainpane2;
        @FXML
        ImageView closebtn;

        @FXML
        private TextField textField;

        @FXML
        Button History;

        @FXML
        Button btnc;
        @FXML
        private Button scientificbtn;

        @FXML
        private Button standardbtn;
        @FXML
        private AnchorPane scientific_form;
        @FXML
        private AnchorPane standard_form;

        @FXML
        private AnchorPane memory_form;
       @FXML
       private AnchorPane settings_form;
      @FXML
       private Button settingsbtn;
        @FXML
        private Button memorybtn;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn4;

    @FXML
    private Button Btn7;

    @FXML
    private Button Btn2;

    @FXML
    private Button Btn5;

    @FXML
    private Button Btn8;

    @FXML
    private Button Btn0;

    @FXML
    private Button Btn3;

    @FXML
    private Button Btn6;

    @FXML
    private Button Btn9;
    @FXML
    private AnchorPane programmer_form;

    @FXML
    private Button bin1;

    @FXML
    private Button dec1;

    @FXML
    private Button oct1;

    @FXML
    private TextField num1;

    @FXML
    private TextField result2;

    @FXML
    private Button hex1;

    @FXML
    private Button bin2;

    @FXML
    private Button dec2;

    @FXML
    private Button oct2;

    @FXML
    private Button hex2;

    @FXML
    private Button programmerbtn;
    @FXML
    private AnchorPane history_page;

    @FXML
    private Button proEnter;

    @FXML
    private Button proReset;


       int historyCount = 0;

        @FXML
        private Text savedNumbers;

        private String firstNumber = "";

        private String currentNumber = "";

        private String calculationType;
        String history = "";
        String proNum1;
        int proNum1R;
        String proResult;

        public void getFirstNum(){
            proNum1 = num1.getText();
            System.out.println(proNum1);
        }
         public void proClear(){
            proNum1 = "";
            num1.setText("");
            result2.setText("");
             bin1.setStyle("-fx-background-color: #398c5e");
             oct1.setStyle("-fx-background-color: #873a8e");
             hex1.setStyle("-fx-background-color: #9a3641");
             dec1.setStyle(" -fx-background-color: #3a6690");
             bin2.setStyle("-fx-background-color: #398c5e");
             oct2.setStyle("-fx-background-color: #873a8e");
             hex2.setStyle("-fx-background-color: #9a3641");
             dec2.setStyle("-fx-background-color: #3a6690");


         }


        public void getRadixFirstNum(Event event){

            if(event.getSource().equals(bin1)){
                proNum1R = Integer.parseInt(proNum1 , 2);
                bin1.setStyle(" -fx-background-color: #6bdab7");
            }
            else if(event.getSource().equals(oct1)){
                proNum1R = Integer.parseInt(proNum1 , 8);
                oct1.setStyle("-fx-background-color: #bf57c9");
            }
            else if(event.getSource().equals(hex1)){
                proNum1R = Integer.parseInt(proNum1 , 16);
                hex1.setStyle("-fx-background-color: #da4555");
            }
            else if(event.getSource().equals(dec1)){
                proNum1R = Integer.parseInt(proNum1);
                dec1.setStyle(" -fx-background-color: #98bffc");
            }

        }

    public void getRadixSecondNum(Event event){
        if(event.getSource() == bin2){
            proResult = Integer.toBinaryString(proNum1R);
            result2.setText(proResult);
            bin2.setStyle(" -fx-background-color: #6bdab7");

        }
        else if(event.getSource() == oct2){
            proResult = Integer.toOctalString(proNum1R);
            result2.setText(proResult);
            oct2.setStyle("-fx-background-color: #bf57c9");
        }
        else if(event.getSource() == hex2){
            proResult = Integer.toHexString(proNum1R);
            result2.setText(proResult);
            hex2.setStyle("-fx-background-color: #da4555");
        }
        else if(event.getSource() == dec2){
            result2.setText(String.valueOf(proNum1R));
            dec2.setStyle(" -fx-background-color:#98bffc");
        }

    }













        @FXML
        void addAction(ActionEvent event) {
            calculationSetup("+");
        }

        @FXML
        void minusAction(ActionEvent event) {
            calculationSetup("-");
        }

        @FXML
        void divideAction(ActionEvent event) {
            calculationSetup("/");
        }

        @FXML
        void multiplicationAction(ActionEvent event) {
            calculationSetup("*");
        }

        public void calculationSetup(String calculationType) {
            this.calculationType = calculationType;
            firstNumber = currentNumber;
            currentNumber = "";
            savedNumbers.setText(firstNumber + " " + calculationType);
        }

        @FXML
        void calculate(ActionEvent event) {
            int firstNumberInt = Integer.parseInt(firstNumber);
            int secondNumberInt = Integer.parseInt(currentNumber);

            switch (calculationType) {
                case "+" -> {
                    int calculatedNumber = firstNumberInt + secondNumberInt;
                    savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                    history += firstNumber + " + " + currentNumber + " = " + calculatedNumber +"\n";
                    historyCount ++;
                    currentNumber = String.valueOf(calculatedNumber);
                    textField.setText(String.valueOf(calculatedNumber));

                }
                case "-" -> {
                    int calculatedNumber = firstNumberInt - secondNumberInt;
                    savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                    history += firstNumber + " - " + currentNumber + " = " + calculatedNumber +"\n";
                    historyCount ++;
                    currentNumber = String.valueOf(calculatedNumber);
                    textField.setText(String.valueOf(calculatedNumber));
                }
                case "/" -> {
                    double calculatedNumber = firstNumberInt / (double) secondNumberInt;
                    savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                    history += firstNumber + " / " + currentNumber + " = " + calculatedNumber +"\n";
                    historyCount ++;
                    currentNumber = String.valueOf(calculatedNumber);
                    textField.setText(String.valueOf(calculatedNumber));
                }
                case "*" -> {
                    int calculatedNumber = firstNumberInt * secondNumberInt;
                    savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                    history += firstNumber + " * " + currentNumber + " = " + calculatedNumber +"\n";
                    historyCount ++;
                    currentNumber = String.valueOf(calculatedNumber);
                    textField.setText(String.valueOf(calculatedNumber));
                }
            }
        }

        @FXML
        void clearTextField(ActionEvent event) {
            currentNumber = "";
            textField.setText("");
            savedNumbers.setText("");
        }
        @FXML
        void clear(ActionEvent event) {
            btnc.setOnMouseClicked(MouseEvent -> {
                calculationType = "";
                savedNumbers.setText(firstNumber);
                currentNumber = firstNumber;
            });

        }

        @FXML
        void btn0(ActionEvent event) {
            if (!currentNumber.equals("")) {
                addNumber("0");
            }
        }

        @FXML
        void btn1(ActionEvent event) {
            addNumber("1");
        }

        @FXML
        void btn2(ActionEvent event) {
            addNumber("2");
        }

        @FXML
        void btn3(ActionEvent event) {
            addNumber("3");
        }

        @FXML
        void btn4(ActionEvent event) {
            addNumber("4");
        }

        @FXML
        void btn5(ActionEvent event) {
            addNumber("5");
        }

        @FXML
        void btn6(ActionEvent event) {
            addNumber("6");
        }

        @FXML
        void btn7(ActionEvent event) {
            addNumber("7");
        }

        @FXML
        void btn8(ActionEvent event) {
            addNumber("8");
        }

        @FXML
        void btn9(ActionEvent event) {
            addNumber("9");
        }

        public void updateTextField() {
            textField.setText(currentNumber);
        }

        public void addNumber(String number) {
            currentNumber += number;
            updateTextField();
        }


        @FXML
        protected void onClosebtnClick(){
            closebtn.setOnMouseClicked(MouseEvent -> {
                exit(0);
            });
        }

        @FXML
        void showHistory(ActionEvent event) throws IOException {
            System.out.println(history);
            Stage stage = new Stage();
            FXMLLoader fxmlLoader2 = new FXMLLoader();
            Pane root = fxmlLoader2.load(getClass().getResource("history.fxml").openStream());
            String his = history;
            stage.setTitle("history");
            Text hist = new Text(his);
            if(historyCount == 10){
                history = "";
                historyCount = 0;
            }

            hist.setX(140);
            hist.setY(60);
            hist.setFont(Font.font("Arial", FontWeight.BOLD, 16));
            // hist.setFill(Color.YELLOW);
            root.getChildren().add(hist);
            stage.setScene(new Scene(root));
            stage.showAndWait();


        }



        @FXML
        public void switchForm(ActionEvent event) {
            if(event.getSource() == standardbtn){
                standard_form.setVisible(true);
                scientific_form.setVisible(false);
                memory_form.setVisible(false);
                settings_form.setVisible(false);
                programmer_form.setVisible(false);

                standardbtn.setStyle(" -fx-background-color:#24276c; -fx-text-fill: #fff; -fx-border-width: 0; -fx-background-radius: 5");
                scientificbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                memorybtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                settingsbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                programmerbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
            }
           else if(event.getSource() == scientificbtn){
                standard_form.setVisible(false);
                scientific_form.setVisible(true);
                memory_form.setVisible(false);
                settings_form.setVisible(false);
                programmer_form.setVisible(false);

                scientificbtn.setStyle(" -fx-background-color:#24276c; -fx-text-fill: #fff; -fx-border-width: 0; -fx-background-radius: 5");
                standardbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                memorybtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                settingsbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                programmerbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
            }
            else if(event.getSource() == memorybtn){
                standard_form.setVisible(false);
                scientific_form.setVisible(false);
                memory_form.setVisible(true);
                settings_form.setVisible(false);
                programmer_form.setVisible(false);

                memorybtn.setStyle(" -fx-background-color:#24276c; -fx-text-fill: #fff; -fx-border-width: 0; -fx-background-radius: 5");
                standardbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                scientificbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                settingsbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                programmerbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
            }
            else if (event.getSource() == settingsbtn){
                standard_form.setVisible(false);
                scientific_form.setVisible(false);
                memory_form.setVisible(false);
                settings_form.setVisible(true);
                programmer_form.setVisible(false);

                settingsbtn.setStyle(" -fx-background-color:#24276c; -fx-text-fill: #fff; -fx-border-width: 0; -fx-background-radius: 5");
                standardbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                scientificbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                memorybtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                programmerbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");

            }
            else if (event.getSource() == programmerbtn){
                standard_form.setVisible(false);
                scientific_form.setVisible(false);
                memory_form.setVisible(false);
                settings_form.setVisible(false);
                programmer_form.setVisible(true);

                programmerbtn.setStyle(" -fx-background-color:#24276c; -fx-text-fill: #fff; -fx-border-width: 0; -fx-background-radius: 5");
                standardbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                scientificbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                memorybtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");
                settingsbtn.setStyle("  -fx-background-color:transparent; -fx-border-color: #24276c;-fx-border-width: 1.5 ; -fx-text-fill: #24276c");

            }

        }
        String format = "deg";
        String memory = "";
        String temp = "";
        @FXML
        private Label memory_result;

    @FXML
    private RadioButton degbtn;

    @FXML
    private RadioButton radbtn;

        @FXML
        private Label result;
    @FXML
    private Button memory_btn;


        private float number1 = 0;

        private float number2 = 0;

        private String operator = "";

        private boolean start = true;

        private Calculate calculate = new Calculate();

        @FXML
        public void setFormatRad(){
            format = "rad";
            degbtn.setSelected(false);

        }
        @FXML
         public void setFormatDeg(){
            format = "deg";
            radbtn.setSelected(false);
        }

        @FXML
        public void processNumber(ActionEvent event){
            if(start){
                result.setText("");
                start = false;
            }

            String value = ((Button) event.getSource()).getText();
            result.setText(result.getText()+ value);
        }

        @FXML
        public void processBinaryOperator(ActionEvent event) {
            String value = ((Button)event.getSource()).getText();
            if(!value.equals("=")){
                if(!operator.isEmpty())
                    return;

                operator = value;
                if(result.getText().equals("π")){
                    number1 = (float)Math.PI;
                }
                else if(result.getText().equals("e")){
                    number1 = (float)Math.E;
                }
                else {
                    number1 = Float.parseFloat(result.getText());
                }
                result.setText("");
            }
            else{
                if(operator.isEmpty())
                    return;

                if(result.getText().equals("π")){
                    number2 = (float)Math.PI;
                }
                else if(result.getText().equals("e")){
                    number2 = (float)Math.E;
                }
                else {
                    number2 = Float.parseFloat(result.getText());
                }
                float output = calculate.calculateBinaryNumber(number1, number2, operator);
                result.setText(String.valueOf(output));
                temp = memory;
                memory += String.valueOf(output);
                memory += "\n";
                operator = "";
            }
        }
        public void processUnaryOperator(ActionEvent event) {

            String value = ((Button)event.getSource()).getText();
            if(!operator.isEmpty())
                return;


            if(result.getText().equals("π")){
                number1 = (float)Math.PI;
            }
            else if(result.getText().equals("e")){
                number1 = (float)Math.E;
            }
            else {
                number1 = Float.parseFloat(result.getText());
            }

            operator = value;
            result.setText("");

            float output = calculate.calculateUnaryNumber(number1, operator , format);
            result.setText(String.valueOf(output));
            memory += String.valueOf(output);
            memory += "\n";
            operator = "";
        }

        public void ClearFunction(ActionEvent event){
            operator = "";
            memory = temp;
            start = true;
            result.setText("");
        }
        @FXML
        public boolean MemoryAdd(){
            memory_result.setText(memory);
            temp = memory;
            return true;
        }
        @FXML
        public void DeleteMemory(){
            memory = "";
            temp = "";
            memory_result.setText("");
        }
        public void theme1(){
           pane1.setStyle("-fx-background-color: linear-gradient(to bottom right , #38A2D7, #561139)");
           pane2.setStyle("-fx-background-color: linear-gradient(to bottom right , #38A2D7, #561139)");
           memory_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#38A2D7, #561139)");
           settings_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#38A2D7, #561139)");
           programmer_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#38A2D7, #561139)");
           mainpane1.setStyle( "-fx-background-color: #a1cdf8; -fx-background-radius: 15");
           mainpane2.setStyle( "-fx-background-color:  #a1cdf8; -fx-background-radius: 15");
           Btn0.setStyle("-fx-background-color:#b6ade3");
            Btn1.setStyle("-fx-background-color:#b6ade3");
            Btn2.setStyle("-fx-background-color: #b6ade3");
            Btn3.setStyle("-fx-background-color:#b6ade3");
            Btn4.setStyle("-fx-background-color: #b6ade3");
            Btn5.setStyle("-fx-background-color:#b6ade3");
            Btn6.setStyle("-fx-background-color:#b6ade3");
            Btn7.setStyle("-fx-background-color: #b6ade3");
            Btn8.setStyle("-fx-background-color:#b6ade3");
            Btn9.setStyle("-fx-background-color:#b6ade3");

        }
    public void theme2(){
        pane1.setStyle("-fx-background-color: linear-gradient(to bottom right , #014871, #A0EBCF)");
        pane2.setStyle("-fx-background-color: linear-gradient(to bottom right , #014871, #A0EBCF)");
        memory_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#014871, #A0EBCF)");
        settings_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#014871, #A0EBCF)");
        programmer_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#014871, #A0EBCF)");
        mainpane1.setStyle( "-fx-background-color: #014871; -fx-background-radius: 15");
        mainpane2.setStyle( "-fx-background-color:#014871; -fx-background-radius: 15");
        Btn0.setStyle("-fx-background-color:#b2f8dc");
        Btn1.setStyle("-fx-background-color:#b2f8dc");
        Btn2.setStyle("-fx-background-color: #b2f8dc");
        Btn3.setStyle("-fx-background-color:#b2f8dc");
        Btn4.setStyle("-fx-background-color: #b2f8dc");
        Btn5.setStyle("-fx-background-color:#b2f8dc");
        Btn6.setStyle("-fx-background-color:#b2f8dc");
        Btn7.setStyle("-fx-background-color: #b2f8dc");
        Btn8.setStyle("-fx-background-color: #b2f8dc");
        Btn9.setStyle("-fx-background-color:#b2f8dc");

    }
    public void theme3(){
        pane1.setStyle("-fx-background-color: linear-gradient(to bottom right , #9F025E, #F9C929)");
        pane2.setStyle("-fx-background-color: linear-gradient(to bottom right ,  #9F025E, #F9C929)");
        memory_form.setStyle("-fx-background-color: linear-gradient(to bottom right , #9F025E, #F9C929)");
        settings_form.setStyle("-fx-background-color: linear-gradient(to bottom right , #9F025E, #F9C929)");
        programmer_form.setStyle("-fx-background-color: linear-gradient(to bottom right , #9F025E, #F9C929)");
        mainpane1.setStyle( "-fx-background-color:  #9F025E; -fx-background-radius: 15");
        mainpane2.setStyle( "-fx-background-color: #9F025E; -fx-background-radius: 15");
        Btn0.setStyle("-fx-background-color:#f8d58f");
        Btn1.setStyle("-fx-background-color:#f8d58f");
        Btn2.setStyle("-fx-background-color: #f8d58f");
        Btn3.setStyle("-fx-background-color:#f8d58f");
        Btn4.setStyle("-fx-background-color: #f8d58f");
        Btn5.setStyle("-fx-background-color:#f8d58f");
        Btn6.setStyle("-fx-background-color:#f8d58f");
        Btn7.setStyle("-fx-background-color: #f8d58f");
        Btn8.setStyle("-fx-background-color: #f8d58f");
        Btn9.setStyle("-fx-background-color:#f8d58f");

    }
    public void theme4(){
        pane1.setStyle("-fx-background-color: linear-gradient(to bottom right , #f59bb4 , #d4f8e1)");
        pane2.setStyle("-fx-background-color: linear-gradient(to bottom right ,    #f59bb4 , #d4f8e1)");
        memory_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,  #f59bb4 , #d4f8e1)");
        settings_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,  #f59bb4 , #d4f8e1)");
        programmer_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,  #f59bb4 , #d4f8e1)");
        mainpane1.setStyle( "-fx-background-color:  #D7EDE2; -fx-background-radius: 15");
        mainpane2.setStyle( "-fx-background-color: #D7EDE2; -fx-background-radius: 15");
        Btn0.setStyle("-fx-background-color: #f59eb9");
        Btn1.setStyle("-fx-background-color:#f59eb9");
        Btn2.setStyle("-fx-background-color:  #f59eb9");
        Btn3.setStyle("-fx-background-color: #f59eb9");
        Btn4.setStyle("-fx-background-color:#f59eb9");
        Btn5.setStyle("-fx-background-color: #f59eb9");
        Btn6.setStyle("-fx-background-color: #f59eb9");
        Btn7.setStyle("-fx-background-color: #f59eb9");
        Btn8.setStyle("-fx-background-color: #f59eb9");
        Btn9.setStyle("-fx-background-color: #f59eb9");

    }
    @FXML
    public void Default(){
        pane1.setStyle("-fx-background-color: linear-gradient(to bottom right , #24276c, #e5e2e2)");
        pane2.setStyle("-fx-background-color: linear-gradient(to bottom right ,#24276c, #e5e2e2)");
        memory_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#24276c, #e5e2e2)");
        settings_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#24276c, #e5e2e2)");
        programmer_form.setStyle("-fx-background-color: linear-gradient(to bottom right ,#24276c, #e5e2e2)");
        mainpane1.setStyle( "-fx-background-color:  #2f3180; -fx-background-radius: 15");
        mainpane2.setStyle( "-fx-background-color: #2f3180; -fx-background-radius: 15");
        Btn0.setStyle("-fx-background-color: #9e9ee3");
        Btn1.setStyle("-fx-background-color: #9e9ee3");
        Btn2.setStyle("-fx-background-color: #9e9ee3");
        Btn3.setStyle("-fx-background-color: #9e9ee3");
        Btn4.setStyle("-fx-background-color:  #9e9ee3");
        Btn5.setStyle("-fx-background-color: #9e9ee3");
        Btn6.setStyle("-fx-background-color: #9e9ee3");
        Btn7.setStyle("-fx-background-color: #9e9ee3");
        Btn8.setStyle("-fx-background-color:  #9e9ee3");
        Btn9.setStyle("-fx-background-color: #9e9ee3");

    }

}





//
//    @FXML
//    void OnNumberClicked(MouseEvent event) {
//       // int value = Integer.parseInt(((Pane)event.getSource()).getId().replace("btn",""));
//       // result.setText(Double.parseDouble(result.getText()) == 0?String.valueOf((double)value):String.valueOf(Double.parseDouble(result.getText())*10+value));
//
//    }
//    @FXML
//    void OnSymbolClicked(MouseEvent event) {
//
//    }
//
//    @FXML
//     void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//}

