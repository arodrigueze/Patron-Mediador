package pm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Lista extends JComboBox{
	
	Director director;
	private Lista lista;

	public Lista(Director director) {
		super();
		this.director = director;
		this.setModel(new DefaultComboBoxModel(new String[] {"Times New Roman", "Arial", "Roboto", "Open Sans", "Lato", "Roboto Condensed"}));
		this.lista = this;
		this.addActionListenerLista();
		// TODO Auto-generated constructor stub
	}
	
	private void addActionListenerLista(){
		this.addActionListener (new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				director.widgetChange(lista);
			}
		});
	}



	
}
