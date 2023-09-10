import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LoginFrame extends JFrame {
    private JPanel panel;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JLabel codeLabel;
    private JTextField codeText;
    private JLabel codeImg;
    private JButton loginButton;
    private Map<String, String> userMap;

    public LoginFrame() {
        setTitle("Gong Chenyang Painting Login");
        setIconImage(new ImageIcon("src/img/img.png").getImage());
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        panel = new JPanel();
        userLabel = new JLabel("用户名：");
        userText = new JTextField(20);
        passwordLabel = new JLabel("密码：");
        passwordText = new JPasswordField(20);
        codeLabel = new JLabel("验证码：");
        codeText = new JTextField(10);
        codeImg = new JLabel();
        loginButton = new JButton("登录");
        userMap = new HashMap<>();
        userMap.put("admin", "123456");
        panel.setLayout(new GridLayout(4, 2));
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(codeLabel);
        panel.add(codeText);
        panel.add(codeImg);
        panel.add(loginButton);

        add(panel);

        // 随机生成验证码图片
        Random random = new Random(System.currentTimeMillis());
        String code1 = "";
        for (int i = 0; i < 2; i++) {
            int r = random.nextInt(36);
            code1 += (char) (r < 10 ? (r + '0') : ((r - 10) + 'A'));
        }
        String code2="";
        for (int i = 0; i < 2; i++) {
            int r = random.nextInt(36);
            code2 += (char) (r < 10 ? (r + '0') : ((r - 10) + 'A'));
        }
        BufferedImage img = new BufferedImage(80, 30, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = img.createGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 80, 30);
        g.setColor(Color.BLACK);
        for (int i = 0; i < 3; i++) {
            int x1 = random.nextInt(80);
            int y1 = random.nextInt(30);
            int x2 = random.nextInt(80);
            int y2 = random.nextInt(30);
            g.drawLine(x1, y1, x2, y2);
        }
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString(code1, 20, 20);
        g.setColor(Color.red);
        g.drawString(code2, 50, 20);
        g.dispose();
        codeImg.setIcon(new ImageIcon(img));

        // 验证码校验
        String finalCode = code1+code2;
        codeText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = codeText.getText();
                if (!input.equals(finalCode)) {
                    JOptionPane.showMessageDialog(null, "验证码错误！");
                    codeText.setText("");
                }
            }
        });

        // 登录按钮
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userText.getText();
                String password = new String(passwordText.getPassword());
                if (userMap.containsKey(user)) {
                    if (userMap.get(user).equals(password)) {
                        JOptionPane.showMessageDialog(null, "登陆成功！");
                        // 转到主界面
                        dispose();
                        new MainFrame();
                    } else {
                        JOptionPane.showMessageDialog(null, "密码错误！");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "用户名不存在！");
                }
            }
        });
        setVisible(true);
    }
}
