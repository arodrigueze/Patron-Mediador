package pm;

import javax.swing.JTextArea;

public class AreaTexto extends JTextArea{
	
	Director director;

	public AreaTexto(Director director) {
		super();
		this.director = director;
		// TODO Auto-generated constructor stub
	}	
	
	public void cambiarTexto(String texto){
		this.append(texto);
	}

}
