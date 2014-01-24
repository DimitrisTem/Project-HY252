package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Open extends JPanel implements ActionListener{
	
	static private final String newline = "\n";
	JButton openButton;
	JFileChooser fc;
	
	public Open(){
		super(new BorderLayout());
		fc = new JFileChooser();
		openButton = new JButton("Open a File...");
		JPanel buttonPanel = new JPanel(); 
	    buttonPanel.add(openButton);
	    add(buttonPanel, BorderLayout.PAGE_START);
	    openButton.addActionListener(this);
	    createAndShowGUI();
	}
	
	private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Open");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        frame.add(new Open());

        
        frame.setBounds(100, 50,200, 100);
        frame.setVisible(true);
        frame.setResizable(false);
    }
	
	 public void actionPerformed(ActionEvent e) {

	        //Handle open button action.
	        if (e.getSource() == openButton) {
	            int returnVal = fc.showOpenDialog(Open.this);

	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = fc.getSelectedFile();
	                System.out.println(file.getPath());
	            }     
	          }
	        }
	    
	public static void main(String[] args) {
       
    }
	
}
