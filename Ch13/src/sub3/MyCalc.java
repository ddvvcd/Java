package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCalc {
	
	private int num1 = 0;
	private int num2 = 0;
	private int operator = 0; // 1: plus, 2: minus, 3:multi, 4:div

	private JFrame frmMyclcV;
	private JTextField txtDisp;
	private JButton btn8;
	private JButton btn9;
	private JButton btnDiv;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMulti;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMinus;
	private JButton btn0;
	private JButton btnCancel;
	private JButton btnEqual;
	private JButton btnPlus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc window = new MyCalc();
					window.frmMyclcV.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyclcV = new JFrame();
		frmMyclcV.setTitle("MyClc v1.0");
		frmMyclcV.setBounds(100, 100, 316, 390);
		frmMyclcV.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyclcV.getContentPane().setLayout(null);
		
		txtDisp = new JTextField();
		txtDisp.setBackground(new Color(255, 255, 255));
		txtDisp.setEditable(false);
		txtDisp.setFont(new Font("굴림", Font.PLAIN, 24));
		txtDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisp.setText("0");
		txtDisp.setBounds(22, 24, 259, 34);
		frmMyclcV.getContentPane().add(txtDisp);
		txtDisp.setColumns(10);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn7.setBounds(22, 78, 47, 47);
		frmMyclcV.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setBounds(97, 78, 47, 47);
		frmMyclcV.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn9.setBounds(168, 78, 47, 47);
		frmMyclcV.getContentPane().add(btn9);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDiv.setBounds(234, 78, 47, 47);
		frmMyclcV.getContentPane().add(btnDiv);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn4.setBounds(22, 143, 47, 47);
		frmMyclcV.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn5.setBounds(97, 143, 47, 47);
		frmMyclcV.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBounds(168, 143, 47, 47);
		frmMyclcV.getContentPane().add(btn6);
		
		btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMulti.setBounds(234, 143, 47, 47);
		frmMyclcV.getContentPane().add(btnMulti);
		
		

		
		
		
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisp.setText("1");
				num1 = 1;
				
			}
		});
		btn1.setBounds(22, 212, 47, 47);
		frmMyclcV.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = 2;
			}
		});
		btn2.setBounds(97, 212, 47, 47);
		frmMyclcV.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setBounds(168, 212, 47, 47);
		frmMyclcV.getContentPane().add(btn3);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinus.setBounds(234, 212, 47, 47);
		frmMyclcV.getContentPane().add(btnMinus);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn0.setBounds(22, 287, 47, 47);
		frmMyclcV.getContentPane().add(btn0);
		
		btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(97, 287, 47, 47);
		frmMyclcV.getContentPane().add(btnCancel);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int result = 0;
						
				if(operator == 1) {
					result = num1 + num2;
				} else if(operator == 2) {
					result = num1 -num2;
				} else if(operator == 3) {
					result = num1 * num2;
				} else if(operator == 4) {
					result = num1 / num2;
				}
				
				txtDisp.setText(""+result);
						
				
				
			}
		});
		btnEqual.setBounds(168, 287, 47, 47);
		frmMyclcV.getContentPane().add(btnEqual);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				operator = 1;
				
				
			}
		});
		btnPlus.setBounds(234, 287, 47, 47);
		frmMyclcV.getContentPane().add(btnPlus);
	}

}
