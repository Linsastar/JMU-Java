import javax.swing.*;
import java.awt.*;

public class AboutFrame extends JFrame {
    public AboutFrame() {
        setTitle("关于");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(260, 150);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon("src/resources/img.png").getImage());
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImg = toolkit.getImage("src/resources/cursor.png");
        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        setCursor(customCursor);
        JLabel label = new JLabel("<html><body><p><b>巩晨阳画图</b></p><p>版本号：1.0</p>"
                + "<p>开发者：巩晨阳</p><p>联系方式：QQ：675629384</p></body></html>");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        add(label, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {//方便调试
        new AboutFrame();
    }
}
