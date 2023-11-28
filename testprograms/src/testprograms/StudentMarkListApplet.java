package testprograms;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings({ "serial", "removal" })
public class StudentMarkListApplet extends Applet implements ActionListener 
{

    TextField regNoField, nameField, m1Field, m2Field, m3Field;
    Button submitButton;
    Label totalLabel, averageLabel, statusLabel;
    MarkList[] students;

    public void init() 
    {
        // Initialize array of MarkList objects
        students = new MarkList[3];

        // Create and add components to the applet
        Label regNoLabel = new Label("Registration Number:");
        Label nameLabel = new Label("Name:");
        Label m1Label = new Label("Marks - Subject 1:");
        Label m2Label = new Label("Marks - Subject 2:");
        Label m3Label = new Label("Marks - Subject 3:");

        regNoField = new TextField(10);
        nameField = new TextField(10);
        m1Field = new TextField(10);
        m2Field = new TextField(10);
        m3Field = new TextField(10);

        totalLabel = new Label("Total:");
        averageLabel = new Label("Average:");
        statusLabel = new Label("Status:");

        submitButton = new Button("Submit");
        submitButton.addActionListener(this);

        add(regNoLabel);
        add(regNoField);
        add(nameLabel);
        add(nameField);
        add(m1Label);
        add(m1Field);
        add(m2Label);
        add(m2Field);
        add(m3Label);
        add(m3Field);
        add(submitButton);
        add(totalLabel);
        add(averageLabel);
        add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Get user input
        int regNo = Integer.parseInt(regNoField.getText());
        String name = nameField.getText();
        int m1 = Integer.parseInt(m1Field.getText());
        int m2 = Integer.parseInt(m2Field.getText());
        int m3 = Integer.parseInt(m3Field.getText());

        // Create a MarkList object and store it in the array
        MarkList student = new MarkList(regNo, name, m1, m2, m3);
        students[0] = student;

        // Display details for the entered student
        student.displayDetails();

        // Display total, average, and status
        totalLabel.setText("Total: " + student.getTotal());
        averageLabel.setText("Average: " + student.getAverage());
        statusLabel.setText("Status: " + student.getStatus());
    }
}
