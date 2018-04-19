package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.parser.ParserDelegator;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel eastPanel;
	private JPanel westPanel;
	private JLabel lblSifra;
	private JTextField textFieldSifra;
	private JLabel lblNewLabel;
	private JTextField textFieldProdajni;
	private JLabel lblNewLabel_1;
	private JTextField textFieldSrednji;
	private JButton btnDodaj;
	private JLabel label;
	private JLabel lblNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldSkraceni;
	private JButton btnOdustani;

	private MenjacnicaGUI gp;

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI gp) {
		setTitle("Dodaj kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		this.gp = gp;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(190, 0));
			eastPanel.setLayout(null);
			eastPanel.add(getLabel());
			eastPanel.add(getLblNaziv());
			eastPanel.add(getLblKupovniKurs());
			eastPanel.add(getLblSkraceniNaziv());
			eastPanel.add(getTextFieldNaziv());
			eastPanel.add(getTextField_1());
			eastPanel.add(getTextField_2());
			eastPanel.add(getBtnOdustani());
		}
		return eastPanel;
	}

	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(190, 0));
			westPanel.setLayout(null);
			westPanel.add(getLblSifra());
			westPanel.add(getTextFieldSifra());
			westPanel.add(getLblNewLabel());
			westPanel.add(getTextFieldProdajni());
			westPanel.add(getLblNewLabel_1());
			westPanel.add(getTextFieldSrednji());
			westPanel.add(getBtnDodaj());
		}
		return westPanel;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("\u0160ifra");
			lblSifra.setBounds(10, 23, 114, 15);
		}
		return lblSifra;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(10, 45, 146, 19);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Prodajni kurs");
			lblNewLabel.setBounds(10, 96, 114, 15);
		}
		return lblNewLabel;
	}

	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(10, 117, 146, 19);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}

	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Srednji kurs");
			lblNewLabel_1.setBounds(10, 159, 188, 15);
		}
		return lblNewLabel_1;
	}

	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();

			textFieldSrednji.setBounds(10, 177, 146, 19);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}

	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					String kurs = "Sifra: " + textFieldSifra.getText() + ", naziv: " + textFieldNaziv.getText()
							+ ", skraceni naziv: " + textFieldSkraceni.getText() + ", prodajni kurs: "
							+ textFieldProdajni.getText() + ", srednji kurs: " + textFieldSrednji.getText()
							+ ", kupovni kurs: " + textFieldKupovni.getText();
					gp.ispisiUStatus(kurs);
					dispose();
				}
			});
			btnDodaj.setBounds(10, 217, 144, 25);
		}
		return btnDodaj;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setBounds(43, 236, 0, 0);
		}
		return label;
	}

	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(12, 25, 70, 15);
		}
		return lblNaziv;
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(12, 95, 178, 15);
		}
		return lblKupovniKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skra\u0107eni naziv");
			lblSkraceniNaziv.setBounds(12, 159, 178, 15);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(10, 47, 146, 19);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}

	private JTextField getTextField_1() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(10, 117, 146, 19);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}

	private JTextField getTextField_2() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setText("");
			textFieldSkraceni.setBounds(12, 177, 146, 19);
			textFieldSkraceni.setColumns(10);
		}
		return textFieldSkraceni;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(12, 217, 146, 25);
		}
		return btnOdustani;
	}
}