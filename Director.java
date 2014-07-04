import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
//Lachlan Schahinger, 2107393 scha0147
/**
 * A Director for a program to play Brickles.
 *
 * <p>The program uses the {@link BrickWall BrickWall} component and
 * implements the {@link CollisionListener CollisionListener}
 * interface to respond to {@link CollisionEvent CollisionEvents}.</p>
 * 
 * @see BrickWall
 * @see CollisionEvent
 * @see CollisionListener
 **/
public class Director extends JPanel implements CollisionListener {

    private static BrickWall wall;

    /**
     * Constructs a Director to run the program.
     *
     * @param window the main window for the program
     * @param args command line arguments (currently unused)
     */
    public Director(JFrame window, String[] args) {
        window.getContentPane().add(makeGamePanel(), BorderLayout.CENTER);
        window.add(top, BorderLayout.NORTH);
        //bloody menu
//        this.add(fff);
//        JMenu filemenu = new JMenu("Options");
//        fff.add(filemenu);
        
        ballno=JSpinner1();
        top.add(brick);
        brick.setFont(new Font("Serif", Font.PLAIN, 26));
//        window.add(gamepan, BorderLayout.CENTER);
//        gamepan.setBorder(BorderFactory.createTitledBorder("Brickles Game:"));
        controls.setLayout(new BoxLayout(controls,BoxLayout.Y_AXIS));
        window.add(controls, BorderLayout.WEST);
        controls.add(score);
        score.setText("SCORE:  " +Integer.toString(score1));
        controls.add(Noball);
        
        controls.add(number);
        
        
        controls.add(Noball1);
        controls.add(number2);
        controls.add(ballNo);
        ballNo.setText("Balls Left: "+ ballno);
        controls.add(Reset);
        Reset.addActionListener(RESET);
//        controls.add(showhigh);
//        showhigh.addActionListener(highscorz);
        controls.add(Difficulty);
        Difficulty.addActionListener(difficultyz);
        controls.add(help);
        help.addActionListener(halp);
        controls.add(Exit);
        Exit.addActionListener(QUIT);
        
        window.add(bottom, BorderLayout.SOUTH);
        //bottom.add(difficulty);

       
        ok.add(Easy);
        Easy.addActionListener(easy);
        ok.add(Medium);
        Medium.addActionListener(medium);
        ok.add(Hard);
        Hard.addActionListener(hard);
        Easy.setSelected(true);
        one.setSelected(true);
//        bottom.add(Easy);
//        bottom.add(Medium);
//        bottom.add(Hard);
    }
   static JPanel top = new JPanel();
   JFormattedTextField test = new JFormattedTextField();
    static JButton showhigh = new JButton("HIGHSCORES");
    static JButton Difficulty = new JButton("  DIFFICULTY");
    static JLabel brick = new JLabel("BRICKLES");
    static JPanel gamepan = new JPanel();
    static JPanel controls = new JPanel();
    static JButton Reset = new JButton("     RESET      ");
    static JButton Reset2 = new JButton("RESET");
    static JButton Exit = new JButton("       EXIT       ");
    static JPanel bottom = new JPanel();
    static JLabel difficulty = new JLabel("Difficulty:");
    static JRadioButton Easy = new JRadioButton("Easy");
    static JRadioButton Medium = new JRadioButton("Medium");
    static JRadioButton Hard = new JRadioButton("Hard");
    static JLabel score = new JLabel();
    public static int score1 = 0;
    static JDialog Quit = new JDialog();
     static JDialog reset = new JDialog();
     static JDialog gg = new JDialog();
    static JPanel panel = new JPanel();
    static JPanel panel1 = new JPanel();
    static JPanel panel2 = new JPanel();
    static JButton yes = new JButton("YES");
   static JButton no = new JButton("NO!");
   static JLabel or = new JLabel("           OR");
   static JLabel yourscore = new JLabel();
   static JLabel or1 = new JLabel("                 OR");
   static ButtonGroup ok = new ButtonGroup();
   static JLabel ballNo = new JLabel();
   static int ballno;
   static JButton help = new JButton("      HELP       ");
   static JLabel Noball = new JLabel("Select Number of rows:");
   static JLabel Noball1 = new JLabel("Select Number of balls:");
   static SpinnerNumberModel model1 = new SpinnerNumberModel(3, 1, 5, 1);
    static JSpinner number = new JSpinner(model1);
    static SpinnerNumberModel model2 = new SpinnerNumberModel(5, 1, 10, 1);
    static JSpinner number2 = new JSpinner(model2);
        static ActionListener RESET = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
          reset();
         // makeGamePanel();
 
          
      }
    };
    static ActionListener QUIT = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        areyousure();
       
           
      }
    };
    static ActionListener halp = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
      JOptionPane.showMessageDialog (null,"Welcome to Brickles\n"
              + "To Play: Hold mouse button to move, make the ball hit bricks to gan score,\n"
              + "any misses of ball to bat will decrease your ball count, when ball count hits 0 Game Over."
              + "\n Scoring: Red brick = 1 point; Yellow Brick = 2 points; Green Brick = 3 points; Blue Brick = 4 points; Black Brick = 5 points"
              + "\n\n Bug List:\n (No Bugs Detected)\n\nDesign Notes: Resizing on panels other than game panel have been left off to put emphasis on the actual game");
       
           
      }
    };
    static ActionListener QUit = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        System.exit(0);
       
           
      }
    };
    public static void areyousure(){
        Quit=new JDialog( Quit,"Are you sure you want to Quit?");
        panel.setLayout(new BorderLayout());
        Quit.add(panel);
        panel.add(yes, BorderLayout.WEST);
        yes.addActionListener(QUit);
        panel.add(or);
        or.setFont(new Font("Serif", Font.PLAIN, 20));
        no.addActionListener(quIT);
        panel.add(no, BorderLayout.EAST);
        panel.setSize(Quit.getWidth(), Quit.getHeight());
        Quit.setLocationRelativeTo(top);
        Quit.setVisible(true);
        Quit.setSize(300, 100);
    }
    public static void reset(){
        reset=new JDialog( reset,"Are you sure you want to reset the game?");
        panel1.setLayout(new BorderLayout());
        reset.add(panel1);
        panel1.add(yes, BorderLayout.WEST);
        yes.addActionListener(yesreset);
        panel1.add(or1);
        or1.setFont(new Font("Serif", Font.PLAIN, 20));
        
        no.addActionListener(quIT);
        panel1.add(no, BorderLayout.EAST);
        panel1.setSize(reset.getWidth(), reset.getHeight());
        reset.setLocationRelativeTo(top);
        reset.setVisible(true);
        reset.setSize(350, 100);
    }
    static JPanel topgg = new JPanel();
    static JPanel highscores = new JPanel();
    static JLabel h1 = new JLabel("Player 1 : 0");
    static JLabel h2 = new JLabel("Player 2 : 0");
    static JLabel h3 = new JLabel("Player 3 : 0");
    static JLabel h4 = new JLabel("Player 4 : 0");
    static JLabel h5 = new JLabel("Player 5 : 0");
    static JLabel h6 = new JLabel("Player 6 : 0");
    static JLabel lolresize = new JLabel("                          ");
    static TextField urname = new TextField();
    static JLabel add = new JLabel("Add your score to highscores list?");
    static JLabel name = new JLabel("Your Name:");
    //static JMenuBar fff = new JMenuBar();
    
    
    static JButton highscoreqqq = new JButton("EXIT");
    static JButton clearqq = new JButton("Clear");
    static JDialog dif = new JDialog();
    static ActionListener highscoreqq = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        areyousure();
       
           
      }
    };
//    static ActionListener highscorz = new ActionListener() {
//      public void actionPerformed(ActionEvent actionEvent) {
//       gg();
//       
//           
//      }
//    };
    static ActionListener difficultyz = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        dfi();
       
           
      }
    };
    static JPanel gt = new JPanel();
    static JPanel whole = new JPanel();
    static JPanel srsly = new JPanel();
    static JPanel diff = new JPanel();
    static JPanel x = new JPanel();
    static JPanel y = new JPanel();
    static JLabel yz = new JLabel("Changing difficulty will require the program to reset");
    static ButtonGroup nok = new ButtonGroup();
    static JRadioButton one = new JRadioButton("Classic (One Bat)");
    static JRadioButton two = new JRadioButton("Two Bats");
    static JRadioButton four = new JRadioButton("All In(Four Bats)");
    static JButton rst = new JButton("RESET");
    
    public static void dfi(){
        dif=new JDialog(dif,"Select Difficulty");
        dif.add(srsly);
        srsly.setBackground(Color.green);
        whole.setBackground(Color.green);
        yz.setBackground(Color.green);
        gt.setBackground(Color.green);
        x.setBackground(Color.green);
        diff.setBackground(Color.green);
        srsly.setLayout(new BoxLayout(srsly,BoxLayout.Y_AXIS));
        srsly.add(whole);
        whole.add(yz);
        srsly.add(gt);
        gt.setBorder(BorderFactory.createTitledBorder("Select Bat Number:"));
        srsly.add(diff);
        diff.setBorder(BorderFactory.createTitledBorder("Select Difficulty"));
        srsly.add(x);
        diff.add(Easy);
        diff.add(Medium);
        diff.add(Hard);
        //rst.setLayout(new BoxLayout(rst,BoxLayout.Y_AXIS));
        srsly.add(rst);
        rst.addActionListener(rztz);
        
        nok.add(one);
        one.addActionListener(onez);
        nok.add(two);
        two.addActionListener(twoz);
        nok.add(four);
        four.addActionListener(fourz);
        
        
        gt.add(one);
        gt.add(two);
        gt.add(four);
        
        
        
        dif.setLocationRelativeTo(top);
        dif.setVisible(true);
        dif.setSize(350, 300);
        
        
    }
     static ActionListener rztz = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
          reset();
           
      }
    };
    static ActionListener onez = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       wall.setWallEast(true);
       wall.setWallWest(true);
       wall.setWallNorth(true);
           
      }
    };
       static ActionListener twoz = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        wall.setWallEast(true);
       wall.setWallWest(true);
         wall.setWallNorth(false);
       
           
      }
    };   static ActionListener fourz = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       wall.setWallNorth(false);
          wall.setWallEast(false);
       wall.setWallWest(false);
       
           
      }
    };
    static ActionListener clear = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        h1.setText("Player 1 : 0");
        h2.setText("Player 2 : 0");
        h3.setText("Player 3 : 0");
        h4.setText("Player 4 : 0");
        h5.setText("Player 5 : 0");
        h6.setText("Player 6 : 0");
        
        
       
           
      }
    };
    static ActionListener adddd = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        System.out.println(":!|siq");
            if(h1.getText()=="Player 1 : 0"){
                h1.setText(urname.getText()+" : "+score1);
                
            }else if(h2.getText()=="Player 2 : 0" && h1.getText()!="Player 1 : 0"){
                h2.setText(urname.getText()+" : "+score1);
                h3.setText("Player 3 : 0");
        h4.setText("Player 4 : 0");
        h5.setText("Player 5 : 0");
        h6.setText("Player 6 : 0");
                
            }else if(h3.getText()=="Player 3 : 0" && h2.getText()!="Player 2 : 0"){
                h3.setText(urname.getText()+" : "+score1);
                
        h4.setText("Player 4 : 0");
        h5.setText("Player 5 : 0");
        h6.setText("Player 6 : 0");
                
            }else if(h4.getText()=="Player 4 : 0" && h3.getText()!="Player 3 : 0"){
                h4.setText(urname.getText()+" : "+score1);
                
        h5.setText("Player 5 : 0");
        
                
            }else if(h5.getText()=="Player 5 : 0" && h4.getText()!="Player 4 : 0"){
                h5.setText(urname.getText()+" : "+score1);
                h6.setText("Player 6 : 0"); 
            }else if(h6.getText()=="Player 6 : 0"&& h5.getText()!="Player 5 : 0"){
                h6.setText(urname.getText()+" : "+score1);
                
            }
           
           
           
           
      }
    };
    static JPanel apanel = new JPanel();
    static JButton addd = new JButton("Add");
    static JPanel lelel = new JPanel();
    static JLabel nice = new JLabel("Thank You for playing Brickles");
    
    public static void gg(){
        System.out.println("gg");
        
        gg=new JDialog( gg,"Game Over");
        panel2.setBackground(Color.red);
        highscores.setBackground(Color.red);
        lelel.setBackground(Color.red);
        topgg.setBackground(Color.red);
        yourscore.setBackground(Color.red);
        apanel.setBackground(Color.red);
        gg.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        gg.add(panel2, BorderLayout.SOUTH);
        gg.add(topgg, BorderLayout.NORTH);
        topgg.add(yourscore);
        yourscore.setText("Your Score: "+score1);
        gg.add(highscores,BorderLayout.EAST);
        highscores.setBorder(BorderFactory.createTitledBorder("High Scores:"));
        highscores.setLayout(new BoxLayout(highscores,BoxLayout.Y_AXIS));
        //highscores.setSize(300,300);
        panel2.add(Reset2, BorderLayout.WEST);
        Reset2.addActionListener(resetz);
        panel2.add(highscoreqqq,BorderLayout.EAST);
        highscoreqqq.addActionListener(highscoreqq);
        highscores.add(h1);
        //h1.setSize(300,200);
        highscores.add(h2);
        highscores.add(h3);
        highscores.add(h4);
        highscores.add(h5);
        highscores.add(h6);
        highscores.add(clearqq);
        clearqq.addActionListener(clear);
        highscores.add(lolresize);
        
        //clearqq.setSize(200,450);
        gg.add(apanel, BorderLayout.CENTER);
        apanel.setLayout(new BorderLayout());
        apanel.add(add,BorderLayout.CENTER);
        apanel.add(nice, BorderLayout.NORTH);
        //apanel.add(urname, BorderLayout.SOUTH);
        lelel.setLayout(new BoxLayout(lelel,BoxLayout.X_AXIS));
        apanel.add(lelel,BorderLayout.SOUTH);
        lelel.add(name);
        lelel.add(urname);
        lelel.add(addd);
        addd.addActionListener(adddd);
        gg.setLocationRelativeTo(top);
        gg.setVisible(true);
        gg.setSize(350, 250);
        //gg.pack();
        
    }
    static ActionListener resetz = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        score1=0;
       ballno=JSpinner1();
       ballNo.setText("Balls Left: "+ ballno);
       wall.setReportMask(CollisionEvent.BRICK | CollisionEvent.MISS | CollisionEvent.BAT);
       
       wall.setBrick(1,12,null);
       wall.setBrick(1,11,null);
       wall.setBrick(1,10,null);
       wall.setBrick(1,9,null);
       wall.setBrick(1,8,null);
       wall.setBrick(1,7,null);
       wall.setBrick(1,6,null);
       wall.setBrick(1,5,null);
       wall.setBrick(1,4,null);
       wall.setBrick(1,3,null);
       wall.setBrick(1,2,null);
       wall.setBrick(1,1,null);
       
       wall.setBrick(2,12,null);
       wall.setBrick(2,11,null);
       wall.setBrick(2,10,null);
       wall.setBrick(2,9,null);
       wall.setBrick(2,8,null);
       wall.setBrick(2,7,null);
       wall.setBrick(2,6,null);
       wall.setBrick(2,5,null);
       wall.setBrick(2,4,null);
       wall.setBrick(2,3,null);
       wall.setBrick(2,2,null);
       wall.setBrick(2,1,null);
       
       wall.setBrick(3,12,null);
       wall.setBrick(3,11,null);
       wall.setBrick(3,10,null);
       wall.setBrick(3,9,null);
       wall.setBrick(3,8,null);
       wall.setBrick(3,7,null);
       wall.setBrick(3,6,null);
       wall.setBrick(3,5,null);
       wall.setBrick(3,4,null);
       wall.setBrick(3,3,null);
       wall.setBrick(3,2,null);
       wall.setBrick(3,1,null);
       
       wall.setBrick(4,12,null);
       wall.setBrick(4,11,null);
       wall.setBrick(4,10,null);
       wall.setBrick(4,9,null);
       wall.setBrick(4,8,null);
       wall.setBrick(4,7,null);
       wall.setBrick(4,6,null);
       wall.setBrick(4,5,null);
       wall.setBrick(4,4,null);
       wall.setBrick(4,3,null);
       wall.setBrick(4,2,null);
       wall.setBrick(4,1,null);
       
       wall.setBrick(5,12,null);
       wall.setBrick(5,11,null);
       wall.setBrick(5,10,null);
       wall.setBrick(5,9,null);
       wall.setBrick(5,8,null);
       wall.setBrick(5,7,null);
       wall.setBrick(5,6,null);
       wall.setBrick(5,5,null);
       wall.setBrick(5,4,null);
       wall.setBrick(5,3,null);
       wall.setBrick(5,2,null);
       wall.setBrick(5,1,null);
       
         wall.setBrick(6,12,null);
       wall.setBrick(6,11,null);
       wall.setBrick(6,10,null);
       wall.setBrick(6,9,null);
       wall.setBrick(6,8,null);
       wall.setBrick(6,7,null);
       wall.setBrick(6,6,null);
       wall.setBrick(6,5,null);
       wall.setBrick(6,4,null);
       wall.setBrick(6,3,null);
       wall.setBrick(6,2,null);
       wall.setBrick(6,1,null);
       
         wall.setBrick(7,12,null);
       wall.setBrick(7,11,null);
       wall.setBrick(7,10,null);
       wall.setBrick(7,9,null);
       wall.setBrick(7,8,null);
       wall.setBrick(7,7,null);
       wall.setBrick(7,6,null);
       wall.setBrick(7,5,null);
       wall.setBrick(7,4,null);
       wall.setBrick(7,3,null);
       wall.setBrick(7,2,null);
       wall.setBrick(7,1,null);
       
       
       
       if(JSpinner()==1){
           ballno=JSpinner1();
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==2){
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==3){
            ballno=JSpinner1();
        
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.RED);   
        }else if(JSpinner()==4){
            ballno=JSpinner1();
            
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.YELLOW);  
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.RED);
        
        }else if(JSpinner()==5){
            ballno=JSpinner1();
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLACK);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.GREEN); 
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(7, 7, 1, wall.getColumns(), Color.RED);
        }
       addd.removeActionListener(adddd);
       gg.dispose();
       rst.removeActionListener(rztz);
       
           
       
           
      }
    };
    static ActionListener quIT = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        Quit.dispose();
        reset.dispose();
       
           
      }
    };
    static ActionListener yesreset = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       score1=0;
       ballno=JSpinner1();
       score.setText("SCORE: 0" );
       ballNo.setText("Balls Left: "+ ballno);
       wall.setReportMask(CollisionEvent.BRICK | CollisionEvent.MISS | CollisionEvent.BAT);
       
       wall.setBrick(1,12,null);
       wall.setBrick(1,11,null);
       wall.setBrick(1,10,null);
       wall.setBrick(1,9,null);
       wall.setBrick(1,8,null);
       wall.setBrick(1,7,null);
       wall.setBrick(1,6,null);
       wall.setBrick(1,5,null);
       wall.setBrick(1,4,null);
       wall.setBrick(1,3,null);
       wall.setBrick(1,2,null);
       wall.setBrick(1,1,null);
       
       wall.setBrick(2,12,null);
       wall.setBrick(2,11,null);
       wall.setBrick(2,10,null);
       wall.setBrick(2,9,null);
       wall.setBrick(2,8,null);
       wall.setBrick(2,7,null);
       wall.setBrick(2,6,null);
       wall.setBrick(2,5,null);
       wall.setBrick(2,4,null);
       wall.setBrick(2,3,null);
       wall.setBrick(2,2,null);
       wall.setBrick(2,1,null);
       
       wall.setBrick(3,12,null);
       wall.setBrick(3,11,null);
       wall.setBrick(3,10,null);
       wall.setBrick(3,9,null);
       wall.setBrick(3,8,null);
       wall.setBrick(3,7,null);
       wall.setBrick(3,6,null);
       wall.setBrick(3,5,null);
       wall.setBrick(3,4,null);
       wall.setBrick(3,3,null);
       wall.setBrick(3,2,null);
       wall.setBrick(3,1,null);
       
       wall.setBrick(4,12,null);
       wall.setBrick(4,11,null);
       wall.setBrick(4,10,null);
       wall.setBrick(4,9,null);
       wall.setBrick(4,8,null);
       wall.setBrick(4,7,null);
       wall.setBrick(4,6,null);
       wall.setBrick(4,5,null);
       wall.setBrick(4,4,null);
       wall.setBrick(4,3,null);
       wall.setBrick(4,2,null);
       wall.setBrick(4,1,null);
       
       wall.setBrick(5,12,null);
       wall.setBrick(5,11,null);
       wall.setBrick(5,10,null);
       wall.setBrick(5,9,null);
       wall.setBrick(5,8,null);
       wall.setBrick(5,7,null);
       wall.setBrick(5,6,null);
       wall.setBrick(5,5,null);
       wall.setBrick(5,4,null);
       wall.setBrick(5,3,null);
       wall.setBrick(5,2,null);
       wall.setBrick(5,1,null);
       
         wall.setBrick(6,12,null);
       wall.setBrick(6,11,null);
       wall.setBrick(6,10,null);
       wall.setBrick(6,9,null);
       wall.setBrick(6,8,null);
       wall.setBrick(6,7,null);
       wall.setBrick(6,6,null);
       wall.setBrick(6,5,null);
       wall.setBrick(6,4,null);
       wall.setBrick(6,3,null);
       wall.setBrick(6,2,null);
       wall.setBrick(6,1,null);
       
         wall.setBrick(7,12,null);
       wall.setBrick(7,11,null);
       wall.setBrick(7,10,null);
       wall.setBrick(7,9,null);
       wall.setBrick(7,8,null);
       wall.setBrick(7,7,null);
       wall.setBrick(7,6,null);
       wall.setBrick(7,5,null);
       wall.setBrick(7,4,null);
       wall.setBrick(7,3,null);
       wall.setBrick(7,2,null);
       wall.setBrick(7,1,null);
       
       
       
       if(JSpinner()==1){
           ballno=JSpinner1();
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==2){
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==3){
            ballno=JSpinner1();
        
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.RED);   
        }else if(JSpinner()==4){
            ballno=JSpinner1();
            
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.YELLOW);  
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.RED);
        
        }else if(JSpinner()==5){
            ballno=JSpinner1();
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLACK);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.GREEN); 
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(7, 7, 1, wall.getColumns(), Color.RED);
        }
       reset.dispose();
       dif.dispose();
       rst.removeActionListener(rztz);
       
           
      }
    };
    static ActionListener easy = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       wall.setBatSize(20);
       wall.setBallSpeed(3);//defualt
       
           
      }
    };
    static ActionListener medium = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       wall.setBatSize(15);
       wall.setBallSpeed(5);
       
           
      }
    };
    static ActionListener hard = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
       wall.setBatSize(10);
       wall.setBallSpeed(8);
       
           
      }
    };
    /**
     * Handler for {@link CollisionEvent CollisionEvents}.
     *
     * @param e the event
     */
    public void collisionDetected(CollisionEvent e) {
        
        
        switch (e.getTarget()) {
            case CollisionEvent.BRICK:
              
                System.out.println("brick:"+score1);
                
               // hit a brick: remove the brick and count the score
                System.out.print(wall.getBrick(e.getRow(), e.getColumn()));
                if((wall.getBrick(e.getRow(),e.getColumn()))==Color.RED){
                    
                     score1++;
                    
                }else if((wall.getBrick(e.getRow(),e.getColumn()))==Color.YELLOW){
                score1=score1+2;
                }else if((wall.getBrick(e.getRow(),e.getColumn()))==Color.GREEN){
                 score1=score1+3;
                }else if((wall.getBrick(e.getRow(),e.getColumn()))==Color.BLUE){
                 score1=score1+4;
                }else if((wall.getBrick(e.getRow(),e.getColumn()))==Color.BLACK){
                    score1=score1+5;
            }
                score.setText("SCORE:  " +Integer.toString(score1));
                wall.setBrick(e.getRow(), e.getColumn(), null);
                break;
                
            case CollisionEvent.MISS:
              ballno--;
                System.out.println("ball:"+ballno);
                ballNo.setText("Balls Left: "+ ballno);
              // miss the ball: decrement the remaining life
                 break;
           case CollisionEvent.BAT:
               System.out.println("hit bat");
             // hit the bat: increment hits and increase difficulty level when passing a threshold
                break;
   }
        if(ballno==0){
            gg();
        }
        
    }
    public static int JSpinner(){//getting jspinner to cooperate
       Object thejspinner = number.getValue();
       Number thenumber = (Number) thejspinner;
       int intofjspinner = thenumber.intValue();
        
       return intofjspinner;
   }
    public static int JSpinner1(){//getting jspinner to cooperate
       Object thejspinner = number2.getValue();
       Number thenumber = (Number) thejspinner;
       int intofjspinner = thenumber.intValue();
        
       return intofjspinner;
   }
    private JComponent makeGamePanel() {
        wall = new BrickWall();
        wall.addCollisionListener(this);
        wall.setReportMask(CollisionEvent.BRICK | CollisionEvent.MISS | CollisionEvent.BAT);

        if(JSpinner()==1){
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==2){
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.RED);
        }else if(JSpinner()==3){
        
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.RED);   
        }else if(JSpinner()==4){
            
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.GREEN);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.YELLOW);  
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.RED);
        
        }else if(JSpinner()==5){
        wall.buildWall(3, 3, 1, wall.getColumns(), Color.BLACK);
        wall.buildWall(4, 4, 1, wall.getColumns(), Color.BLUE);
        wall.buildWall(5, 5, 1, wall.getColumns(), Color.GREEN); 
        wall.buildWall(6, 6, 1, wall.getColumns(), Color.YELLOW);
        wall.buildWall(7, 7, 1, wall.getColumns(), Color.RED);
        }
        return wall;
    }
}
