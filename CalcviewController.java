package Calc;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcviewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField display;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button four;

    @FXML
    private Button plus;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button minus;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button mul;

    @FXML
    private Button pn;

    @FXML
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button divide;

    @FXML
    private Button clear;

    @FXML
    private Button equal;

    double rs=0;
    double n1;
    double n2;
    char op;
    int point;
    @FXML
    private void calculation(ActionEvent event)
    {
       if(event.getSource()==one)
       {
    	   display.appendText("1");
       }
       else if(event.getSource()==two)
       {
    	   display.appendText("2");
       }
       else if(event.getSource()==three)
       {
    	   display.appendText("3");
       }
       else if(event.getSource()==four)
       {
    	   display.appendText("4");
       }
       else if(event.getSource()==five)
       {
    	   display.appendText("5");
       }
       else if(event.getSource()==six)
       {
    	   display.appendText("6");
       }
       else if(event.getSource()==seven)
       {
    	   display.appendText("7");
       }
       else if(event.getSource()==eight)
       {
    	   display.appendText("8");
       }
       else if(event.getSource()==nine)
       {
    	   display.appendText("9");
       }
       else if(event.getSource()==zero)
       {
    	   display.appendText("0");
       }
       else if(event.getSource()==dot && point==0)
       {
    	   display.appendText(".");
    	   point=1;
       }
       else if(event.getSource()==plus)
       {
    	   n1= Double.parseDouble(display.getText());
    	   display.setText("");
    	   op='+';
    	   point=0;   
       }
       else if(event.getSource()==minus)
       {
    	   n1= Double.parseDouble(display.getText());
    	   display.setText("");
    	   op='-';
    	   point=0;   
       }
       else if(event.getSource()==mul)
       {
    	   n1= Double.parseDouble(display.getText());
    	   display.setText("");
    	   op='*';
    	   point=0;   
       }
       else if(event.getSource()==divide)
       {
    	   n1= Double.parseDouble(display.getText());
    	   display.setText("");
    	   op='/';
    	   point=0;   
       }
       else if(event.getSource()==pn)
       {
    	   n1= Double.parseDouble(display.getText());
    	   n1= n1* (-1);
    	   display.setText(String.valueOf(n1));
    	   point=0;
       }
       else if(event.getSource()==equal)
       {
    	   n2= Double.parseDouble(display.getText());
    	   switch(op)
    	   {
    	   case '+' :
    		   rs= n1+n2;
    		   break;
    	   case '-' :
    		   rs = n1-n2;
    		   break;
    	   case '*' :
    		   rs = n1*n2;
    		   break;
    	   case '/' :
    		   rs = n1/n2;
    		   break;
    		   default : display.setText("error");
    	   }
    	   display.setText(String.valueOf(rs));
       }
       else if(event.getSource()==clear)
       {
    	   n1=0;
    	   n2=0;
    	   display.setText("");
    	   op=0;
    	   point=0;
       }
    }
    
    
    @FXML
    void initialize() {
        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert mul != null : "fx:id=\"mul\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert pn != null : "fx:id=\"pn\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert dot != null : "fx:id=\"dot\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'Calcview.fxml'.";
        assert equal != null : "fx:id=\"equal\" was not injected: check your FXML file 'Calcview.fxml'.";

    }
}
