package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI {

	private JFrame frmMenjacnica;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTable table;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvriZamenu;
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvriIzmenu;
	private JPanel panel_1;
	private JScrollPane scrollPane_1;
	private JTextArea textArea;
	private MenjacnicaGUI gp = this;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI window = new MenjacnicaGUI();
					window.frmMenjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenjacnicaGUI() {

		frmMenjacnica = new JFrame();
		frmMenjacnica.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		frmMenjacnica.setIconImage(
				Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/ajsasdovo.png")));
		frmMenjacnica.setTitle("Menjacnica");
		frmMenjacnica.setBounds(100, 100, 685, 489);
		frmMenjacnica.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmMenjacnica.setJMenuBar(getMenuBar());
		frmMenjacnica.getContentPane().setLayout(new BorderLayout(0, 0));
		frmMenjacnica.getContentPane().add(getScrollPane(), BorderLayout.CENTER);
		frmMenjacnica.getContentPane().add(getPanel(), BorderLayout.EAST);
		frmMenjacnica.getContentPane().add(getPanel_1_1(), BorderLayout.SOUTH);
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}

	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}

	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}

	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					otvoriFajl();
				}
			});
			mntmOpen.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}

	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					sacuvajFajl();
				}
			});
			mntmSave.setIcon(new ImageIcon(
					MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}

	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izlaz();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}

	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					prikaziAboutProzor();
				}
			});
		}
		return mntmAbout;
	}

	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}

	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
					new Object[][] { { null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null },
							{ null, null, null, null, null, null }, { null, null, null, null, null, null }, },
					new String[] { "Sifra", "Skraceni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv" }));
			addPopup(table, getPopupMenu());
			table.getColumnModel().getColumn(1).setPreferredWidth(97);
		}
		return table;
	}

	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvriZamenu());
		}
		return popupMenu;
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dk = new DodajKursGUI(gp);
					dk.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}

	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obri\u0161i kurs");
			mntmObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI ok = new ObrisiKursGUI(gp);
					ok.setVisible(true);
				}
			});
			mntmObrisiKurs.setActionCommand("Obri\u0161i kurs");
		}
		return mntmObrisiKurs;
	}

	private JMenuItem getMntmIzvriZamenu() {
		if (mntmIzvriZamenu == null) {
			mntmIzvriZamenu = new JMenuItem("Izvr\u0161i zamenu");
		}
		return mntmIzvriZamenu;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(120, 10));
			panel.add(getBtnDodajKurs());
			panel.add(getBtnObrisiKurs());
			panel.add(getBtnIzvriIzmenu());
		}
		return panel;
	}

	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodajKurs = new DodajKursGUI(gp);
					dodajKurs.setVisible(true);
				}
			});
			btnDodajKurs.setPreferredSize(new Dimension(107, 25));
		}
		return btnDodajKurs;
	}

	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obri\u0161i kurs");
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI ok = new ObrisiKursGUI(gp);
					ok.setVisible(true);
				}
			});
			btnObrisiKurs.setPreferredSize(new Dimension(107, 25));
		}
		return btnObrisiKurs;
	}

	private JButton getBtnIzvriIzmenu() {
		if (btnIzvriIzmenu == null) {
			btnIzvriIzmenu = new JButton("Izvr\u0161i izmenu");
		}
		return btnIzvriIzmenu;
	}

	private JPanel getPanel_1_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setPreferredSize(new Dimension(10, 70));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getScrollPane_1(), BorderLayout.CENTER);
		}
		return panel_1;
	}

	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setPreferredSize(new Dimension(2, 50));
			scrollPane_1
					.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane_1.setViewportView(getTextArea());
		}
		return scrollPane_1;
	}

	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBorder(null);
		}
		return textArea;
	}

	private void izlaz() {
		int opcija = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite da izadjete?", "Izlaz",
				JOptionPane.YES_NO_CANCEL_OPTION);
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);

	}

	private void sacuvajFajl() {
		JFileChooser jc = new JFileChooser();
		int retVal = jc.showSaveDialog(frmMenjacnica.getContentPane());
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			textArea.append("\nSacuvan fajl: " + f);
		}
	}

	private void otvoriFajl() {
		JFileChooser jc = new JFileChooser();
		int retVal = jc.showOpenDialog(frmMenjacnica.getContentPane());
		if (retVal == JFileChooser.APPROVE_OPTION) {
			File f = jc.getSelectedFile();
			textArea.append("\nOtvoren je fajl: " + f);
		}
	}

	private void prikaziAboutProzor() {
		JOptionPane.showMessageDialog(frmMenjacnica.getContentPane(), "Autor: Milena Petrovic",
				"O programu Menjacnica 2018", JOptionPane.INFORMATION_MESSAGE);
	}

	void ispisiUStatusu(String s) {
		textArea.append("\n" + s);
	}
}
