package view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DirectorView extends JFrame{

	private JTextField incasariTextField;
	private JTextField nr_angajatiTextField;
	private JTextField nr_masiniTextField;
	private JButton okButton;
	
	public void DirectorView()
	{
		this.setBounds(100,100,515,500);
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  getContentPane().setLayout(null);
		  
		  JLabel incasariLabel = new JLabel("Incasari firma");
		  incasariLabel.setBounds(114, 32, 100, 14);
		  getContentPane().add(incasariLabel);
		  
		  JLabel nr_angajatiLabel = new JLabel("Nr. angajati");
		  nr_angajatiLabel.setBounds(114, 53, 162, 14);
		  getContentPane().add(nr_angajatiLabel);
		  
		  JLabel nr_masiniLabel = new JLabel("Nr. masini");
		  nr_masiniLabel.setBounds(114, 84, 162, 14);
		  getContentPane().add(nr_masiniLabel);
		  
		  incasariTextField = new JTextField();
		  incasariTextField.setBounds(230, 32, 162, 20);
		  getContentPane().add(incasariTextField);
		  
		  nr_angajatiTextField = new JTextField();
		  nr_angajatiTextField.setBounds(230, 53, 162, 20);
		  getContentPane().add(nr_angajatiTextField);
		  
		  nr_masiniTextField = new JTextField();
		  nr_masiniTextField.setBounds(230, 84, 162, 20);
		  getContentPane().add(nr_masiniTextField);
		  
		  okButton = new JButton("Ok");
		  okButton.setBounds(114, 191, 50, 20);
		  getContentPane().add( okButton);
		  
	}
	//GENEREAZA NULL POINTER EXEPTION
	public void addOkActionListener(final ActionListener actionListener)
	  {
		  okButton.addActionListener(actionListener);
	  }
}
