import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener; 
import java.awt.event.*;
import javax.swing.*;  
import javax.swing.border.*;  
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;


public class AJPMicroproject extends JFrame   
{  
  
// Initializing the value of  
// currCard to 1 .  
private int currCard = 0;  
private int nextPressedOnce = 0; 
// Declaring of objects  
// of the CardLayout class.  
private CardLayout cObjl;  
  
// constructor of the class  
public AJPMicroproject()  
{  
  
// Method to set the Title of the JFrame  
setTitle("AJP Microproject FeedBack Form");  

// Method to set the visibility of the JFrame  
setSize(1000, 700);  
this.setFont(new Font("Verdana", Font.PLAIN, 18));  
// Creating an Object of the "Jpanel" class  
final JPanel cPanel = new JPanel();  
  
// Initializing of the object "cObjl"  
// of the CardLayout class.  
cObjl = new CardLayout();  
  
// setting the layout  
cPanel.setLayout(cObjl);  


final JPanel jPanel = new JPanel(new BorderLayout());
try{
  BufferedImage myPicture = ImageIO.read(new File("Restropic.jpg"));  
  JLabel picLabel = new JLabel(new ImageIcon(myPicture));
 jPanel.add(picLabel, BorderLayout.NORTH);
}
catch(Exception e){
  System.out.println(e);
}

JLabel _jLabel = new JLabel("!! WELCOME TO RAJE'S HOTEL !!", JLabel.CENTER);
_jLabel.setFont(new Font("Verdana", Font.PLAIN, 20));

jPanel.add(_jLabel, BorderLayout.CENTER);
JLabel jLabel = new JLabel("Your Feedback is always appreciated!",JLabel.CENTER);
jLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
jPanel.setBorder(new EmptyBorder(10,10,70,10));
jPanel.add(jLabel, BorderLayout.SOUTH);



// Initializing the object  
// "jPanel1" of the JPanel class.  
JPanel jPanel1 = new JPanel();  
jPanel1.setLayout(new GridLayout(4,2,10,10));
JPanel choicePanel = new JPanel(); 
// Initializing the object  
// "jPanel2" of the CardLayout class.  
JPanel jPanel2 = new JPanel();  
 jPanel2.setLayout(new GridLayout(8,2,10,10));
// Initializing the object  
// "jPanel3" of the CardLayout class.  

final JPanel jPanel3 = new JPanel(new GridLayout(6,3,10,10));  
// JPanel firstFeedback = new JPanel(); 
// JPanel secondFeedback = new JPanel();
// JPanel thirdFeedback = new JPanel();

// Initializing the object  
// "jPanel4" of the CardLayout class.  
final JPanel jPanel4 = new JPanel(new GridLayout(10,2,10,10));  

JPanel jPanel5 = new JPanel(new BorderLayout());
  
// Initializing the object  
// "jl1" of the JLabel class.  
JLabel jLabel1 = new JLabel("Name:");  
jLabel1.setFont(new Font("Verdana", Font.PLAIN, 18));
final JTextField tf1 = new JTextField("",20);
tf1.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel11 = new JLabel("Email:");
jLabel11.setFont(new Font("Verdana", Font.PLAIN, 18));
final JTextField tf11 = new JTextField("",20);
tf11.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel12 = new JLabel("Mobile Number:");
jLabel12.setFont(new Font("Verdana", Font.PLAIN, 18));
final JTextField tf12 = new JTextField("",11);
tf12.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel13 = new JLabel("How did you get to know about us?:");
jLabel13.setFont(new Font("Verdana", Font.PLAIN, 18));
final Choice choice = new Choice();
choice.add("Friends/Family");
choice.add("Newspaper");
choice.add("Social Media");
choice.add("Hoarding");
choice.setFont(new Font("Verdana", Font.PLAIN, 18));
choicePanel.add(choice);
 
// Initializing the object  
// "jLabel2" of the JLabel class.  
final JLabel jLabel2title = new JLabel("Your Personal Information is as follows: ");
jLabel2title.setFont(new Font("Verdana", Font.PLAIN, 20));
JLabel _jLabel2 = new JLabel("Your name is");
_jLabel2.setFont(new Font("Verdana", Font.PLAIN, 18)); 
final JLabel jLabel2 = new JLabel(""); 
jLabel2.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _jLabel21 = new JLabel("Your email is: ");
_jLabel21.setFont(new Font("Verdana", Font.PLAIN, 18));  
final JLabel jLabel21 = new JLabel("");
jLabel21.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _jLabel22 = new JLabel("Your Mobile Number is: ");
_jLabel22.setFont(new Font("Verdana", Font.PLAIN, 18)); 
final JLabel jLabel22 = new JLabel("");
jLabel22.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _jLabel23 = new JLabel("You got to know us through: ");
_jLabel23.setFont(new Font("Verdana",Font.PLAIN,18));
final JLabel jLabel23 = new JLabel("Friends/Family"); 
jLabel23.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel24 = new JLabel("Click 'NEXT' if your information is correct.");
jLabel24.setFont(new Font("Verdana", Font.PLAIN, 18));
// Initializing the object  
// "jLabel3" of the JLabel class.  
JLabel jLabel3 = new JLabel("Review based on: "); 
jLabel3.setFont(new Font("Verdana", Font.PLAIN, 20));
JLabel jLabel3rating = new JLabel("Rating", JLabel.CENTER);
jLabel3rating.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel3remarks = new JLabel("Remarks");
jLabel3remarks.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _firstFeedback = new JLabel("Taste");
_firstFeedback.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _secondFeedback = new JLabel("Customer Service");
_secondFeedback.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel _thirdFeedback = new JLabel("Ambience");
_thirdFeedback.setFont(new Font("Verdana", Font.PLAIN, 18));

final JLabel jLabel31 = new JLabel("Taste Rating");
jLabel31.setFont(new Font("Verdana", Font.PLAIN, 18));
Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL, 50, 25, 0, 125);  
  s1.setUnitIncrement(25);

  s1.addAdjustmentListener(new AdjustmentListener(){
      public void adjustmentValueChanged(AdjustmentEvent e){
      

        if(e.getValue()==0){
          jLabel31.setText("Worst");
        }
        else if (e.getValue()==25) {
          jLabel31.setText("Poor");
        }
        else if (e.getValue()==50) {
          jLabel31.setText("Fair");
        }
        else if (e.getValue()==75) {
          jLabel31.setText("Good");
        }
        else if (e.getValue()==100) {
          jLabel31.setText("Excellent");
        }
        else{
          jLabel31.setText("Points: "+e.getValue()+"/100");
        }
       
      }
  });

  final JLabel jLabel32 = new JLabel("Customer Service Rating");
  jLabel32.setFont(new Font("Verdana", Font.PLAIN, 18));
  Scrollbar s2=new Scrollbar(Scrollbar.HORIZONTAL, 50, 25, 0, 125);  
  s2.setUnitIncrement(25);

  s2.addAdjustmentListener(new AdjustmentListener(){
      public void adjustmentValueChanged(AdjustmentEvent e){
        
        if(e.getValue()==0){
          jLabel32.setText("Worst");
        }
        else if (e.getValue()==25) {
          jLabel32.setText("Poor");
        }
        else if (e.getValue()==50) {
          jLabel32.setText("Fair");
        }
        else if (e.getValue()==75) {
          jLabel32.setText("Good");
        }
        else if (e.getValue()==100) {
          jLabel32.setText("Excellent");
        }
        else{
          jLabel32.setText("Points: "+e.getValue()+"/100");
        }
      }
  });

  final JLabel jLabel33 = new JLabel("Ambience Rating");
  jLabel33.setFont(new Font("Verdana", Font.PLAIN, 18));
  Scrollbar s3=new Scrollbar(Scrollbar.HORIZONTAL, 50, 25, 0, 125);  
  s3.setUnitIncrement(25);

  s3.addAdjustmentListener(new AdjustmentListener(){
      public void adjustmentValueChanged(AdjustmentEvent e){
        if(e.getValue()==0){
          jLabel33.setText("Worst");
        }
        else if (e.getValue()==25) {
          jLabel33.setText("Poor");
        }
        else if (e.getValue()==50) {
          jLabel33.setText("Fair");
        }
        else if (e.getValue()==75) {
          jLabel33.setText("Good");
        }
        else if (e.getValue()==100) {
          jLabel33.setText("Excellent");
        }
        else{
          jLabel33.setText("Points: "+e.getValue()+"/100");
        }
      }
  });  

  final JLabel jLabel34 = new JLabel("", JLabel.CENTER);
  jLabel34.setFont(new Font("Verdana", Font.PLAIN, 18));

// Initializing the object  
// "jLabel4" of the JLabel class.  
JLabel jLabel4 = new JLabel("Summary"); 
jLabel4.setFont(new Font("Verdana", Font.PLAIN, 20)); 
JLabel jLabel41 = new JLabel("Your name is: ");
jLabel41.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel411 = new JLabel("");
jLabel411.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel42 = new JLabel("Your email is: ");
jLabel42.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel421 = new JLabel("");
jLabel421.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel43 = new JLabel("Your mobile number is: ");
jLabel43.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel431 = new JLabel("");
jLabel431.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel44 = new JLabel("You got to know us through: ");
jLabel44.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel441 = new JLabel("");
jLabel441.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel45 = new JLabel("You rated our taste as: ");
jLabel45.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel451 = new JLabel("");
jLabel451.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel46 = new JLabel("You rated our Customer Service as: ");
jLabel46.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel461 = new JLabel("");
jLabel461.setFont(new Font("Verdana", Font.PLAIN, 18));
JLabel jLabel47 = new JLabel("You rated our Ambience as: ");
jLabel47.setFont(new Font("Verdana", Font.PLAIN, 18));
final JLabel jLabel471 = new JLabel("");
jLabel471.setFont(new Font("Verdana", Font.PLAIN, 18));


JLabel jLabelfinal = new JLabel("Thanks for giving us feedback!",JLabel.CENTER);
jLabelfinal.setFont(new Font("Verdana", Font.PLAIN, 20));


// Adding JLabel "jLabel1" to the JPanel "jPanel1".  
jPanel1.setBorder(new EmptyBorder(10, 10, 70, 10));
jPanel1.add(jLabel1);  
jPanel1.add(tf1);
jPanel1.add(jLabel11);
jPanel1.add(tf11);
jPanel1.add(jLabel12);
jPanel1.add(tf12);
jPanel1.add(jLabel13);
jPanel1.add(choicePanel);
  
// Adding JLabel "jLabel2" to the JPanel "jPanel2".  
jPanel2.setBorder(new EmptyBorder(10,10,70,10));
jPanel2.add(jLabel2title);
jPanel2.add(new JLabel(""));

jPanel2.add(_jLabel2);
jPanel2.add(jLabel2);  
jPanel2.add(_jLabel21);
jPanel2.add(jLabel21);
jPanel2.add(_jLabel22);
jPanel2.add(jLabel22);
jPanel2.add(_jLabel23);
jPanel2.add(jLabel23);
jPanel2.add(new JLabel(""));
jPanel2.add(new JLabel(""));
jPanel2.add(new JLabel(""));
jPanel2.add(new JLabel(""));
jPanel2.add(new JLabel(""));
jPanel2.add(jLabel24);

  
// Adding JLabel "jLabel3" to the JPanel "jPanel3".  
jPanel3.setBorder(new EmptyBorder(10,10,70,10));
jPanel3.add(jLabel3);  
jPanel3.add(jLabel3rating);
jPanel3.add(jLabel3remarks);
jPanel3.add(_firstFeedback);
jPanel3.add(s1);
jPanel3.add(jLabel31);
jPanel3.add(_secondFeedback);
jPanel3.add(s2);
jPanel3.add(jLabel32);
jPanel3.add(_thirdFeedback);
jPanel3.add(s3);
jPanel3.add(jLabel33);
jPanel3.add(new JLabel(""));
jPanel3.add(jLabel34);
jPanel3.add(new JLabel(""));
  
// Adding JLabel "jLabel4" to the JPanel "jPanel4".  
jPanel4.setBorder(new EmptyBorder(10,10,70,10));
jPanel4.add(jLabel4);  
jPanel4.add(new JLabel(""));
jPanel4.add(jLabel41);
jPanel4.add(jLabel411);
jPanel4.add(jLabel42);
jPanel4.add(jLabel421);
jPanel4.add(jLabel43);
jPanel4.add(jLabel431);
jPanel4.add(jLabel44);
jPanel4.add(jLabel441);
jPanel4.add(jLabel45);
jPanel4.add(jLabel451);
jPanel4.add(jLabel46);
jPanel4.add(jLabel461);
jPanel4.add(jLabel47);
jPanel4.add(jLabel471);
jPanel4.add(new JLabel(""));
jPanel4.add(new JLabel(""));
jPanel4.add(new JLabel(""));



jPanel5.add(jLabelfinal, BorderLayout.CENTER);

//Add the "jPanel" on CPanel
cPanel.add(jPanel,"0");
  
// Add the "jPanel1" on cPanel  
cPanel.add(jPanel1, "1");  
  
// Add the "jPanel2" on cPanel  
cPanel.add(jPanel2, "2");  
  
// Add the "jPanel3" on cPanel  
cPanel.add(jPanel3, "3");  
  
// Add the "jPanel4" on cPanel  
cPanel.add(jPanel4, "4");  

//Add the "jPanel5" on cPanel
cPanel.add(jPanel5,"5");
  
// Creating an Object of the "JPanel" class  
JPanel btnPanel = new JPanel();  
  
// Initializing the object  
// "firstButton" of the JButton class.  
JButton firstButton = new JButton("HOME");  
  
// Initializing the object  
// "nextButton" of the JButton class.  
JButton nextButton = new JButton("NEXT");  
  
// Initializing the object  
// "previousbtn" of JButton class.  
JButton previousButton = new JButton("BACK");  
  
// Initializing the object  
// "lastButton" of the JButton class.  
final JButton lastButton = new JButton("SUMMARY"); 
lastButton.setVisible(false); 
  
final JButton exitButton = new JButton("FINISH");
exitButton.setVisible(false);

// Adding the JButton "firstbutton" on the JPanel.  
btnPanel.add(firstButton);  
  
// Adding the JButton "previousButton" on the JPanel.
btnPanel.add(previousButton);  
  
 
// Adding the JButton "nextButton" on the JPanel.    
btnPanel.add(nextButton);
  
// Adding the JButton "lastButton" on the JPanel.  
btnPanel.add(lastButton);  

btnPanel.add(exitButton);

//adding ItemListener to choice
choice.addItemListener(new ItemListener(){
	 public void itemStateChanged(ItemEvent ie)
        {
          jLabel23.setText(choice.getSelectedItem());
        }
		});
  
// adding firstButton in the ActionListener  
firstButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
// using the first cObjl CardLayout  
cObjl.first(cPanel);  
  
// value of currCard is 0  
currCard = 0;  
}  
});  
  
// add lastButton in ActionListener  
lastButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  

if (exitButton.isVisible()){
  exitButton.setVisible(false);
}
else{
  exitButton.setVisible(true);  
}

jLabel411.setText(jLabel2.getText());
jLabel421.setText(jLabel21.getText());
jLabel431.setText(jLabel22.getText());
jLabel441.setText(jLabel23.getText());
jLabel451.setText(jLabel31.getText());
jLabel461.setText(jLabel32.getText());
jLabel471.setText(jLabel33.getText());

cObjl.show(cPanel,"4");  
  
// value of currCard is 4  
currCard = 4;  
jLabel34.setText("");
}  
});  

//add exitButton in ActionListener
exitButton.addActionListener(new ActionListener()
  {
    public void actionPerformed(ActionEvent ae){
      cObjl.last(cPanel);
    }
  });
  
// add nextButton in ActionListener  
nextButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard < 3)  
{  
  
// increase the value of currCard by 1  
currCard = currCard + 1;  

if(currCard == 2){
    
jLabel2.setText(tf1.getText());  
jLabel21.setText(tf11.getText());
jLabel22.setText(tf12.getText());
 
}
  



  
// show the value of currCard  
cObjl.show(cPanel, "" + (currCard));  
}

if(currCard == 3){
	lastButton.setVisible(true);
  if(nextPressedOnce == 1){
  jLabel34.setText("Please Press 'Summary'");
  nextPressedOnce = 0;
  }
  nextPressedOnce = 1;
}  



}  
});  
  
// add previousButton in ActionListener  
previousButton.addActionListener(new ActionListener()  
{  
public void actionPerformed(ActionEvent ae)  
{  
  
if (currCard > 1)   
{  
  
// decrease the value  
// of currCard by 1  
currCard = currCard - 1;  
  
// show the value of currCard  
cObjl.show(cPanel, "" + (currCard));  
}
if (!(jPanel4.isVisible())){
  lastButton.setVisible(false);
}

exitButton.setVisible(false);

if(currCard == 2){
  lastButton.setVisible(false);
  jLabel34.setText("");
}   
}  
});  
  
// using to get the content pane  
add(cPanel, BorderLayout.NORTH);  
  
// using to get the content pane  
add(btnPanel, BorderLayout.CENTER);  



}  


// main method  
public static void main(String argvs[])  
{  
  
// Creating an object of the AJPMicroproject class.  
AJPMicroproject cll = new AJPMicroproject();  
  
// method to set the default operation of the JFrame.  
cll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
  
// aethod to set the visibility of the JFrame.  
cll.setVisible(true);  
}  
}  