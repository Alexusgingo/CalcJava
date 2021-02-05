package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.*;

public class Controller {

        @FXML
        private  TextField A,B,X,Resh;
        @FXML
        private Label Alerty;
        private Model model=new Model();

    Thread t;
    public void run() {
        for (int i = 10; i < 13; i++) {

            try {
                // в течение 1000 миллисекунд
                Thread.sleep(10000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


        @FXML
        private void num(ActionEvent event){
            Thread t = new Thread();
            // this will call run() function
            t.start();

            float Xn=0,An=0,Bn=0;
            if(X.getText()!="") Xn=Float.parseFloat(X.getText());else {System.exit(0);}
            if(A.getText()!="") An=Float.parseFloat(A.getText());else {System.exit(0);}
            if(B.getText()!="") Bn=Float.parseFloat(B.getText());else {System.exit(0);}
            Alerty.setText("");
             double calc=0;

            if(Xn<=7){
                if(An!=0 && Bn!=0 ) {
                calc=(Xn+4)/(Math.pow(An,2)+Math.pow(Bn,2));
                Resh.setText(Double.toString(calc));}
                else Alerty.setText("При x&lt;=7,A и B не могут одновременно равняться нулю!");
            }
            else{
                calc=Xn*(Math.pow((An+Bn),2));
                Resh.setText(Double.toString(calc));
            }
        }

        @FXML
        private void exit(ActionEvent event){
            System.exit(0);

        }

        @FXML
        private void clear(ActionEvent event){
            A.clear();
            B.clear();
            X.clear();
            Resh.clear();
        }




}
