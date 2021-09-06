package cal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class Cal implements ActionListener {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bdiv,bmul,bsub,bcl,beq,bdot;
	JTextField t1;
	String s;
	String s2;
	double sum=0;
	double sub=0;
	double div=0;
	double mul=1;
	double ans=0;
	char operation;
	double a;
	public  Cal()
	{
		JFrame f = new JFrame("Calculator");
		t1 = new JTextField();
		t1.setBounds(20, 10, 340, 70);
		t1.setEditable(false);
		b1 = new JButton("1");
		b1.setBounds(20, 100, 70, 70);
		b1.addActionListener(this);
		b2 = new JButton("2");
		b2.setBounds(110, 100, 70, 70);
		b2.addActionListener(this);
		b3 = new JButton("3");
		b3.setBounds(200, 100, 70, 70);
		b3.addActionListener(this);
		b4 = new JButton("4");
		b4.setBounds(20, 190, 70, 70);
		b4.addActionListener(this);
		b5 = new JButton("5");
		b5.setBounds(110, 190, 70, 70);
		b5.addActionListener(this);
		b6 = new JButton("6");
		b6.setBounds(200, 190, 70, 70);
		b6.addActionListener(this);
		b7 = new JButton("7");
		b7.setBounds(20, 280, 70, 70);
		b7.addActionListener(this);
		b8 = new JButton("8");
		b8.setBounds(110, 280, 70, 70);
		b8.addActionListener(this);
		b9 = new JButton("9");
		b9.setBounds(200, 280, 70, 70);
		b9.addActionListener(this);
		b0 = new JButton("0");
		b0.setBounds(110, 370, 70, 70);
		b0.addActionListener(this);
		badd = new JButton("+");
		badd.setBounds(290, 100, 70, 70);
		badd.addActionListener(this);
		bdiv = new JButton("/");
		bdiv.setBounds(290, 280, 70, 70);
		bdiv.addActionListener(this);
		bmul = new JButton("X");
		bmul.setBounds(290, 370, 70, 70);
		bmul.addActionListener(this);
		bsub = new JButton("-");
		bsub.setBounds(290, 190, 70, 70);
		bsub.addActionListener(this);
		bcl = new JButton("Clear");
		bcl.setBounds(135, 460, 100, 50);
		bcl.addActionListener(this);
		bdot = new JButton(".");
		bdot.setBounds(20, 370, 70, 70);
		bdot.addActionListener(this);
		beq = new JButton("=");
		beq.setBounds(200, 370, 70, 70);
		beq.addActionListener(this);
		f.add(t1);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(badd);
		f.add(b4);
		f.add(b7);
		f.add(bcl);
		f.add(b5);
		f.add(b6);
		f.add(bsub);
		f.add(b8);
		f.add(b9);
		f.add(bdiv);
		f.add(b0);
		f.add(beq);
		f.add(bmul);
		f.add(bdot);
		f.setSize(400,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setResizable(false);
	}
	public static void main(String[] args) {
		new Cal();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b1)
		{
			s=t1.getText();
			t1.setText(s+"1");
			
		}
		else if(e.getSource()==b2)
		{
			s=t1.getText();
			t1.setText(s+"2");
		}
		else if(e.getSource()==b3)
		{
			s=t1.getText();
			t1.setText(s+"3");
		}
		else if(e.getSource()==b4)
		{
			s=t1.getText();
			t1.setText(s+"4");
		}
		else if(e.getSource()==b5)
		{
			s=t1.getText();
			t1.setText(s+"5");
		}
		else if(e.getSource()==b6)
		{
			s=t1.getText();
			t1.setText(s+"6");
		}
		else if(e.getSource()==b7)
		{
			s=t1.getText();
			t1.setText(s+"7");
		}
		else if(e.getSource()==b8)
		{
			s=t1.getText();
			t1.setText(s+"8");
		}
		else if(e.getSource()==b9)
		{
			s=t1.getText();
			t1.setText(s+"9");
		}
		else if(e.getSource()==b0)
		{
			s=t1.getText();
			t1.setText(s+"0");
		}
		else if(e.getSource()==bdot)
		{
			s=t1.getText();
			t1.setText(s+".");
		}
		else if(e.getSource()==bcl)
		{
			t1.setText("");
		}
		else if(e.getSource()==badd)
		{
			
			s=t1.getText();
			a = Double.valueOf(s);
			sum = sum+a;
			t1.setText("");
			operation='a'; 
		}
		else if(e.getSource()==bsub)
		{
			s=t1.getText();
			a = Double.valueOf(s);
			if(sub>0)
			{
				sub=sub-a;
			}
			else if(sum>0)
			{
				sub=sum+a;
			}
			else sub=a;
			
			t1.setText("");
			operation='s';	 
		}
		else if(e.getSource()==bmul)
		{
			s=t1.getText();
			a = Double.valueOf(s);
			mul=mul*a;
			t1.setText("");
			operation='m';
		}
		else if(e.getSource()==bdiv)
		{
			s=t1.getText();
			a = Double.valueOf(s);
			if(div>0)
			{
				div=div/a;
			}
			else div=a;
			t1.setText("");
			operation='d'; 
		}
		else if(e.getSource()==beq)
		{
			s2=t1.getText();
			double b = Double.valueOf(s2);
			switch(operation)
			{
			case 'a':
				ans=sum+b;
				t1.setText("= "+Double.toString(ans));
				sum=0;
				sub=0;
				break;
			case 's':
				ans=sub-b;
				t1.setText("= "+Double.toString(ans));
				sub=0;
				sum=0;
				break;
			case 'm':
				ans=mul*b;
				t1.setText("= "+Double.toString(ans));
				mul=1;
				break;
			case 'd':
				ans=div/b;
				t1.setText("= "+Double.toString(ans));
				div=0;
				break;
			}
		}
	}
}
