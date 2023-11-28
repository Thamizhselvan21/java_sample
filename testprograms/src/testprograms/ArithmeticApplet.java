package testprograms;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "serial", "removal" })
public class ArithmeticApplet extends Applet implements ActionListener {

    TextField num1Field, num2Field;
    Button addButton, subButton, mulButton, divButton;
    Label resultLabel;

    public void init() {
        // Create and add components to the applet
        num1Field = new TextField(10);
        num2Field = new TextField(10);

        addButton = new Button("Add");
        subButton = new Button("Subtract");
        mulButton = new Button("Multiply");
        divButton = new Button("Divide");

        resultLabel = new Label("Result:");

        // Add action listeners to buttons
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        add(num1Field);
        add(num2Field);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get user input
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());

        // Perform the selected arithmetic operation
        if (e.getSource() == addButton) {
            resultLabel.setText("Result: " + (num1 + num2));
        } else if (e.getSource() == subButton) {
            resultLabel.setText("Result: " + (num1 - num2));
        } else if (e.getSource() == mulButton) {
            resultLabel.setText("Result: " + (num1 * num2));
        } else if (e.getSource() == divButton) {
            // Check for division by zero
            if (num2 != 0) {
                resultLabel.setText("Result: " + (num1 / num2));
            } else {
                resultLabel.setText("Cannot divide by zero");
            }
        }
    }
}
