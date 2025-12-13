/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universityenrollmentsystem;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.*;


public class UniversityTableGUI extends JFrame {
    
    JTable myTable;
    UniversityTableModel tableModel;
    ArrayList<Person> list;
    
    // contructor
    public UniversityTableGUI(ArrayList<Person> list){
        
        //set the title
        this.setTitle("People in University Enrollment System");
        
        // initialise and instantiate the instance variable 
        this.list = list;
        tableModel = new UniversityTableModel(list);
        myTable =  new JTable(tableModel);
        
        // set the size of the frame 
        setBounds(20,20,800,600); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Changed to DISPOSE to avoid closing main console
     
        // sorting
        myTable.setAutoCreateRowSorter(true);
      
        // add the table to the panel
        JScrollPane scrollPane = new JScrollPane(myTable); 
        scrollPane.setPreferredSize(new Dimension(380,280)); 

        // add a button on the bottom
        JButton button = new JButton("Statistics");

        //new button
        JButton button2 = new JButton("Reset Table");

        //adding the action listener
        button2.addActionListener(e ->{
            String message = "the reseted table";
            JOptionPane.showMessageDialog(
                    this,
                    message);
        });
        
        // add the panel to the frame
        add(scrollPane,BorderLayout.CENTER); 
        add(button, BorderLayout.SOUTH);
    }
    
}

