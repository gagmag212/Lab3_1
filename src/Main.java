import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว","0");
        JOptionPane.showMessageDialog(null,"message","title",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showConfirmDialog(null,"LOVE");*/
        int ans = JOptionPane.showConfirmDialog(null,"LOVE YES OR NO","ASK",JOptionPane.YES_NO_OPTION);
        if(ans == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"LOVE YOU");
        }else{
            JOptionPane.showMessageDialog(null,"NOT LOVE");
        }

    }

}
