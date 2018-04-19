package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JPanel westPanel;
	private JPanel eastPanel;
	private JLabel lblSifra;
	private JLabel lblProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblNaziv;
	private JLabel lblKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSifra;
	private JTextField textFieldProdajni;
	private JTextField textFieldSrednji;
	private JTextField textFieldNaziv;
	private JTextField textFieldKupovni;
	private JTextField textFieldSkraceni;
	private JButton btnOdustani;
	private JButton btnObrisi;
	private JCheckBox chckbxZaistaObrisiKurs;
	private MenjacnicaGUI gp;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Obrisi kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getWestPanel(), BorderLayout.WEST);
		contentPane.add(getEastPanel(), BorderLayout.EAST);
		this.gp = gp;
	}

	private JPanel getWestPanel() {
		if (westPanel == null) {
			westPanel = new JPanel();
			westPanel.setPreferredSize(new Dimension(190, 0));
			westPanel.setLayout(null);
			westPanel.add(getLblSifra());
			westPanel.add(getLblProdajniKurs());
			westPanel.add(getLblSrednjiKurs());
			westPanel.add(getTextFieldSifra());
			westPanel.add(getTextFieldProdajni());
			westPanel.add(getTextFieldSrednji());
			westPanel.add(getBtnObrisi());
			westPanel.add(getChckbxZaistaObrisiKurs());
		}
		return westPanel;
	}

	private JPanel getEastPanel() {
		if (eastPanel == null) {
			eastPanel = new JPanel();
			eastPanel.setPreferredSize(new Dimension(190, 0));
			eastPanel.setLayout(null);
			eastPanel.add(getLblNaziv());
			eastPanel.add(getLblKupovniKurs());
			eastPanel.add(getLblSkraceniNaziv());
			eastPanel.add(getTextFieldNaziv());
			eastPanel.add(getTextFieldKupovni());
			eastPanel.add(getTextFieldSkraceni());
			eastPanel.add(getBtnOdustani());
		}
		return eastPanel;
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(12, 25, 70, 15);
		}
		return lblSifra;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(12, 79, 166, 15);
		}
		return lblProdajniKurs;
	}

	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(12, 148, 166, 15);
		}
		return lblSrednjiKurs;
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
			lblKupovniKurs.setBounds(12, 79, 166, 15);
		}
		return lblKupovniKurs;
	}

	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(12, 148, 140, 15);
		}
		return lblSkraceniNaziv;
	}

	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(12, 47, 146, 19);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}

	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setBounds(12, 106, 146, 19);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}

	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setBounds(12, 171, 146, 19);
			textFieldSrednji.setColumns(10);
		}
		return textFieldSrednji;
	}

	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(12, 47, 146, 19);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}

	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setBounds(12, 106, 146, 19);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}

	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setBounds(12, 171, 146, 19);
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
			btnOdustani.setBounds(12, 246, 146, 25);
		}
		return btnOdustani;
	}

	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Sifra: " + textFieldSifra.getText() + ", naziv: " + textFieldNaziv.getText()
							+ ", skraceni naziv: " + textFieldSkraceni.getText() + ", prodajni kurs: "
							+ textFieldProdajni.getText() + ", srednji kurs: " + textFieldSrednji.getText()
							+ ", kupovni kurs: " + textFieldKupovni.getText();
					gp.ispisiUStatusu(kurs);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(12, 251, 146, 25);
		}
		return btnObrisi;
	}

	private JCheckBox getChckbxZaistaObrisiKurs() {
		if (chckbxZaistaObrisiKurs == null) {
			chckbxZaistaObrisiKurs = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (chckbxZaistaObrisiKurs.isSelected()) {
						btnObrisi.setEnabled(true);
					} else
						btnObrisi.setEnabled(false);
				}
			});
			chckbxZaistaObrisiKurs.setBounds(12, 209, 166, 23);
		}
		return chckbxZaistaObrisiKurs;
	}
}