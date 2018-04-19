package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import java.awt.Dimension;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.ComponentOrientation;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private MenjacnicaGUI gp;
	private JPanel contentPane;
	private JLabel lblKupovni;
	private JTextField txtProdajniKurs;
	private JLabel lblProdajni;
	private JComboBox comboBox;
	private JTextField txtKupovniKurs;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField txtIznos;
	private JRadioButton rdBtnKupovina;
	private JRadioButton rdBtnProdaja;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JLabel lblValuta;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gp) {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setPreferredSize(new Dimension(450, 350));
		contentPane.add(getLblKupovni());
		contentPane.add(getTxtProdajniKurs());
		contentPane.add(getLblProdajni());
		contentPane.add(getComboBox());
		contentPane.add(getTxtKupovniKurs());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getTxtIznos());
		contentPane.add(getRdBtnKupovina());
		contentPane.add(getRdBtnProdaja());
		contentPane.add(getSlider_1());
		this.gp = gp;
		ButtonGroup bg = new ButtonGroup();
		bg.add(rdBtnKupovina);
		bg.add(rdBtnProdaja);
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getLabel_1());
	}

	private JLabel getLblKupovni() {
		if (lblKupovni == null) {
			lblKupovni = new JLabel("Kupovni kurs");
			lblKupovni.setBounds(28, 36, 111, 15);
		}
		return lblKupovni;
	}

	private JTextField getTxtProdajniKurs() {
		if (txtProdajniKurs == null) {
			txtProdajniKurs = new JTextField();
			txtProdajniKurs.setEditable(false);
			txtProdajniKurs.setColumns(10);
			txtProdajniKurs.setBounds(291, 61, 144, 19);
		}
		return txtProdajniKurs;
	}

	private JLabel getLblProdajni() {
		if (lblProdajni == null) {
			lblProdajni = new JLabel("Prodajni kurs");
			lblProdajni.setBounds(291, 36, 111, 15);
		}
		return lblProdajni;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] { "EUR", "USD", "CHF" }));
			comboBox.setBounds(196, 58, 65, 24);
		}
		return comboBox;
	}

	private JTextField getTxtKupovniKurs() {
		if (txtKupovniKurs == null) {
			txtKupovniKurs = new JTextField();
			txtKupovniKurs.setEditable(false);
			txtKupovniKurs.setColumns(10);
			txtKupovniKurs.setBounds(25, 61, 144, 19);
		}
		return txtKupovniKurs;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(28, 104, 70, 15);
		}
		return lblIznos;
	}

	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(267, 104, 144, 15);
		}
		return lblVrstaTransakcije;
	}

	private JTextField getTxtIznos() {
		if (txtIznos == null) {
			txtIznos = new JTextField();
			txtIznos.setColumns(10);
			txtIznos.setBounds(28, 146, 141, 19);
		}
		return txtIznos;
	}

	private JRadioButton getRdBtnKupovina() {
		if (rdBtnKupovina == null) {
			rdBtnKupovina = new JRadioButton("Kupovina");
			rdBtnKupovina.setSelected(true);
			rdBtnKupovina.setBounds(286, 130, 149, 23);
		}
		return rdBtnKupovina;
	}

	private JRadioButton getRdBtnProdaja() {
		if (rdBtnProdaja == null) {
			rdBtnProdaja = new JRadioButton("Prodaja");
			rdBtnProdaja.setBounds(286, 158, 149, 23);
		}
		return rdBtnProdaja;
	}

	private JSlider getSlider_1() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					txtIznos.setText(slider.getValue() + "");
				}
			});
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setExtent(10);
			slider.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			slider.setAutoscrolls(true);
			slider.setBounds(28, 203, 388, 56);
		}
		return slider;
	}

	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String t;
					if (rdBtnKupovina.isSelected())
						t = "kupovina";
					else
						t = "prodaja";
					String kurs = "Naziv valute: " + comboBox.getSelectedItem() + ", iznos: " + txtIznos.getText()
							+ ", transakcija: " + t;
					gp.ispisiUStatus(kurs);
					dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(49, 277, 144, 25);
		}
		return btnIzvrsiZamenu;
	}

	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(248, 277, 144, 25);
		}
		return btnOdustani;
	}

	private JLabel getLabel_1() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(196, 36, 70, 15);
		}
		return lblValuta;
	}
}