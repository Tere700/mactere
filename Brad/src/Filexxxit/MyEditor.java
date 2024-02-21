package Filexxxit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton open, save, saveas;
	private JTextArea editor;
	private File openFile = null;

	public MyEditor() {
		super("文字編輯器");

		open = new JButton("Open...");
		save = new JButton("Save...");
		saveas = new JButton("Save as...");
		editor = new JTextArea();

		setLayout(new BorderLayout());

		JPanel top = new JPanel(new FlowLayout());
		JScrollPane jsp = new JScrollPane(editor);
		top.add(open);
		top.add(save);
		top.add(saveas);

		add(top, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		processEvent();
	}

	private void processEvent() {
		open.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();

			}
		});
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					saveFile();
					JOptionPane.showMessageDialog(null, "save OK");
				} catch (Exception e1) {
					System.out.println(e1.toString());
				}
				
			}
		});
		saveas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					saveasFile();
					JOptionPane.showMessageDialog(null, "save as OK");
				} catch (Exception e1) {
					System.out.println(e1.toString());
				}
				
			}
		});
	}

	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			openFile = jfc.getSelectedFile();
			try {
				readFile();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		;

	}

	private void readFile() throws Exception {
		FileReader FR = new FileReader(openFile, StandardCharsets.UTF_8);
		long size = openFile.length();
		char[] buf = new char[(int) size];
		FR.read(buf);
		FR.close();
		
		editor.setText(new String(buf));
	}
	
	private void saveFile() throws Exception {
		if(openFile!=null) {
			FileWriter FW = new FileWriter(openFile);
			FW.write(editor.getText());
			FW.flush();
			FW.close();
		}
	}
	
	private void saveasFile() throws Exception {
		JFileChooser jfc = new JFileChooser();
		if(jfc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) {
			File saveasFile = jfc.getSelectedFile();
			FileWriter FW = new FileWriter(saveasFile);
			FW.write(editor.getText());
			FW.flush();
			FW.close();
			openFile = saveasFile;
		}
	}

	public static void main(String[] args) {
		new MyEditor();

	}

}
