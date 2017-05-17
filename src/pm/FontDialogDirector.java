package pm;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComponent;
import javax.swing.BoxLayout;


@SuppressWarnings("serial")
public class FontDialogDirector extends JFrame {

	private JPanel contentPane;
	Boton boton;
	AreaTexto areaTexto;
	Lista lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FontDialogDirector frame = new FontDialogDirector();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FontDialogDirector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		boton = new Boton(this);
		contentPane.add(boton);
		
		areaTexto = new AreaTexto(this);
		contentPane.add(areaTexto);
		
		lista = new Lista(this);
		contentPane.add(lista);
	}
	
	public void widgetChange(JComponent c){
		if(c instanceof Boton){
			areaTexto.cambiarTexto("\nTotal componentes en la lista = "+lista.getItemCount());
		}
		if(c instanceof Lista){
			areaTexto.cambiarTexto("\nSelección = "+((Lista) c).getSelectedItem());
		}		
	}

}
