/**
 * T00705586 Mirko July 2022
 * CheckBoxClass called by Main.
 */

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CheckBoxClass extends GridPane
{
    // declare objects and variables
    private Text costText = new Text("Pizza Cost:");
    private Label result = new Label("10.0");
    private double currentPrice;
    private CheckBox cheeseBox, pepperoniBox, sausageBox, hamBox, pepperBox, onionBox;
    final double TOPPINGCOST = 0.5;
    
    public CheckBoxClass()
    {
        // create check boxes
        cheeseBox = new CheckBox("Cheese");
        cheeseBox.setOnAction(this::processCheckBoxAction);
        pepperoniBox = new CheckBox("Pepperoni");
        pepperoniBox.setOnAction(this::processCheckBoxAction);
        sausageBox = new CheckBox("Sausage");
        sausageBox.setOnAction(this::processCheckBoxAction);
        hamBox = new CheckBox("Ham");
        hamBox.setOnAction(this::processCheckBoxAction);
        pepperBox = new CheckBox("Green Pepper");
        pepperBox.setOnAction(this::processCheckBoxAction);
        onionBox = new CheckBox("Onion");
        onionBox.setOnAction(this::processCheckBoxAction);
       
        // 1st column
        add(cheeseBox, 0, 0);
        add(pepperBox, 0, 1);
        add(onionBox, 0, 2);
        add(costText, 0, 3);
        
        // 2nd column
        add(pepperoniBox, 1, 0);
        add(sausageBox, 1, 1);
        add(hamBox, 1, 2);
        add(result, 1, 3);
        
        // align grid
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
    }
    
    // event handling method
    public void processCheckBoxAction(ActionEvent event)
    {        
        currentPrice = 10;
        
        if(cheeseBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        if(pepperoniBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        if(sausageBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        if(hamBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        if(pepperBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        if(onionBox.isSelected())
        {
            currentPrice += TOPPINGCOST;
        }
        
        result.setText(currentPrice + "");
    }
}
