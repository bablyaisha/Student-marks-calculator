import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JButton calculateButton;
    private JTextField txtStName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtMarks4;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtPer;
    private JTextField txtGrade;
    private JPanel Marks;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Marks);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,m4,total;
                double avg,per;
                //getting the marks as input using get.


                m1=Integer.parseInt(txtMarks1.getText()) ;
                m2=Integer.parseInt(txtMarks2.getText()) ;
                m3=Integer.parseInt(txtMarks3.getText()) ;
                m4=Integer.parseInt(txtMarks4.getText()) ;
                

                //setting the outputs using set.

                total=m1+m2+m3+m4;
                txtTotal.setText(String.valueOf(total));

                avg= total/4;
                txtAvg.setText(String.valueOf(avg));

                 per=(total*100)/400;
                 txtPer.setText(String.valueOf(per));

                 if(avg>=45){
                     txtGrade.setText("PASS");
                 }else  {
                     txtGrade.setText("FAIL");
                 }
            }
        });
    }
}
