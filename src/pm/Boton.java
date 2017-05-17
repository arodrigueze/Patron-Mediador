package pm;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Boton extends JButton{
	
	private FontDialogDirector director;
	private Boton btn;
	
	public Boton(FontDialogDirector director) {
		super("Lista Items");
		this.director = director;
		this.btn = this;
		this.addMouseListenerBoton();
	}
	
	private void addMouseListenerBoton(){
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				director.widgetChange(btn);
			}
		});
	}
	
	

}
