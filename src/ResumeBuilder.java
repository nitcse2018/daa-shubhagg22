package java_assignment;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
public class ResumeBuilder {
	static int countAdd1Clicks;
	static TextField employ;
	static Frame f;
	public static void main(String[] args) {
		countAdd1Clicks = 0;
	 f= new Frame("Resume Builder");
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(750, 750);
		Label l1= new Label("Name: ");
		Label l4= new Label("Address: ");
		Label l2= new Label("Contact No. ");
		Label l3= new Label("Email: ");
		Label l5= new Label ("Professional Summary: ");
		Label l6= new Label("Employment History:");
		TextField f1= new TextField(18);
		TextField f2= new TextField(18);
		TextField f3= new TextField(18);
		TextField f4= new TextField(70);
		TextField f5= new TextField(80);
	
		employ= new TextField(80);
		Label education= new Label("Education:                                                                                                                                                                                 ");
		Label ed= new Label("  Course:                                                                               Institution:                                                                     Year:                                   ");
		Choice c1= new Choice();
		c1.addItem("Select");
		c1.addItem("10th");
		c1.addItem("12th");
	    c1.addItem("Graduation");
	    c1.addItem("Post Graduation");
	    c1.addItem("Phd");
	    TextField ch1= new TextField(40);
	    TextField e1= new TextField(18);
	    Choice c2= new Choice();
	    c2.addItem("Select");
		c2.addItem("10th");
		c2.addItem("12th");
	    c2.addItem("Graduation");
	    c2.addItem("Post Graduation");
	    c2.addItem("Phd");
	    TextField ch2= new TextField(40);
	    TextField e2= new TextField(18);
	    Choice c3= new Choice();
	    c3.addItem("Select");
		c3.addItem("10th");
		c3.addItem("12th");
	    c3.addItem("Graduation");
	    c3.addItem("Post Graduation");
	    c3.addItem("Phd");
	    TextField ch3= new TextField(40);
	    TextField e3= new TextField(18);
	    Choice c4= new Choice();
	    c4.addItem("Select");
		c4.addItem("10th");
		c4.addItem("12th");
	    c4.addItem("Graduation");
	    c4.addItem("Post Graduation");
	    c4.addItem("Phd");
	    TextField ch4= new TextField(40);
	    TextField e4= new TextField(18);

	    Label Skills= new Label("Skills:                                                                                                                                                                                                                    ");
	    TextField s1= new TextField(85);
	    TextField s2= new TextField(85);
	    TextField s3= new TextField(85);
	    TextField s4= new TextField(85);
	   
	    Label skill1= new Label("  1. ");
	    Label skill2= new Label("  2. ");
	    Label skill3= new Label("  3. ");
	    Label skill4= new Label("  4. ");
	    
	    Label Hobbies= new Label("Hobbies:                                                                                                                                   ");
	    TextField h= new TextField(85);
	    Label lang= new Label("Languages :");
	    TextField lang1= new TextField(15);
	    Button b1= new Button("                      CREATE RESUME                     ");
	   
		f.add(l1);
		f.add(f1);
		f.add(l2);
		f.add(f2);
		f.add(l3);
		f.add(f3);
		f.add(l4);
		f.add(f4);
		f.add(l5);
		f.add(f5);
		f.add(l6);
		f.add(employ);
		f.add(education);
		f.add(ed);
		f.add(c1);
		f.add(ch1);
		f.add(e1);
		f.add(c2);
		f.add(ch2);
		f.add(e2);
		f.add(c3);
		f.add(ch3);
		f.add(e3);
		f.add(c4);
		f.add(ch4);
		f.add(e4);
		f.add(Skills);
		f.add(skill1);
		f.add(s1);
		f.add(skill2);
		f.add(s2);
		f.add(skill3);
		f.add(s3);
		f.add(skill4);
		f.add(s4);
		f.add(Hobbies);
		f.add(h);
		f.add(lang);
		f.add(lang1);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					FileWriter myWriter = new FileWriter("Resume.txt");
		            myWriter.write(f1.getText()+ "\n");
		            myWriter.write(f2.getText()+ "\n");
		            myWriter.write(f3.getText()+ "\n");
		            myWriter.write(f4.getText()+ "\n");
		            myWriter.write("\n");
		            myWriter.write("Proffessional Summary : \n");
		            myWriter.write(f5.getText()+"\n");
		            myWriter.write("\n");
		            myWriter.write("Previous Experiences\n");
		            myWriter.write(employ.getText()+"\n");
		            myWriter.write("\n");
		            myWriter.write("EDUCATION: \n");
					if(c1.getItem(c1.getSelectedIndex())!="Select")
					{myWriter.write(c1.getItem(c1.getSelectedIndex())+"      "+ ch1.getText()+ "       "+ e1.getText()+"\n");}
					if(c2.getItem(c2.getSelectedIndex())!="Select")
					{myWriter.write(c2.getItem(c2.getSelectedIndex())+"      "+ ch2.getText()+ "       "+ e2.getText()+"\n");}
					if(c3.getItem(c3.getSelectedIndex())!="Select")
					{myWriter.write(c3.getItem(c3.getSelectedIndex())+"      "+ ch3.getText()+ "       "+ e3.getText()+"\n");}
					if(c4.getItem(c4.getSelectedIndex())!="Select")
					{myWriter.write(c4.getItem(c4.getSelectedIndex())+"      "+ ch4.getText()+ "       "+ e4.getText()+"\n");}
					
					myWriter.write("\n");
					myWriter.write("Skills:   \n");
					if (s1.getText()!= "")
					{myWriter.write("1. "+ s1.getText()+"\n");}
					if (s2.getText()!= "")
					{myWriter.write("2. "+ s2.getText()+"\n");}
					if (s3.getText()!= "")
					{myWriter.write("3. "+ s3.getText()+"\n");}
					if (s4.getText()!= "")
					{myWriter.write("4. "+ s4.getText()+"\n");}
					myWriter.write("\n");
					myWriter.write("Hobbies \n:");
					myWriter.write(h.getText());
					myWriter.write("\n");
					myWriter.write("Languages known: ");
					myWriter.write("\n");
					if (lang1.getText()!= "")
					{myWriter.write("1. "+ lang1.getText()+"\n");}
					
					
					 myWriter.close();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
				
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}