import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class MainFrame extends JFrame {
    private JMenuItem sinItem;
    private JMenuItem cosItem;
    private JMenuItem otherItem;
    private JComponent demoComponent;

    public MainFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImg = toolkit.getImage("src/img/cursor.png");
        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        setCursor(customCursor);
        setTitle("Gong Chenyang's Painting");
        setIconImage(new ImageIcon("src/img/img.png").getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 菜单栏
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu projectMenu = new JMenu("曲线演示");
        JMenu openMenu = new JMenu("打开文件");
        JMenu exitMenu=new JMenu("退出");
        JMenu about=new JMenu("关于");
        menuBar.add(projectMenu);
        menuBar.add(openMenu);
        menuBar.add(exitMenu);
        menuBar.add(about);
        JMenuItem exit=new JMenuItem("退出");
        JMenuItem aboutItem=new JMenuItem("关于");
        sinItem = new JMenuItem("正弦图像");
        cosItem = new JMenuItem("余弦图像");
        otherItem = new JMenuItem("其他图像");
        exitMenu.add(exit);
        about.add(aboutItem);
        projectMenu.add(sinItem);
        projectMenu.add(cosItem);
        projectMenu.add(otherItem);
        exit.addActionListener(e->{
            System.exit(0);
        });
        aboutItem.addActionListener(e->{
            JOptionPane.showMessageDialog(null, "本软件由JMU巩晨阳制作\n版本1.0\n联系方式：QQ675629384");
        });
        // 曲线演示面板
        demoComponent = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                g2d.drawLine(0, height / 2, width, height / 2); //x轴
                g2d.drawLine(width / 2, 0, width / 2, height);  //y轴
                g2d.setColor(Color.BLUE);
                double step = Math.PI / 180;
                for (int i = -width / 2; i < width / 2; i++) {
                    double x = (double) i / 20;
                    double y = 2 * Math.sin(x);
                    int x1 = i + width / 2;
                    int y1 = (int) (-y * 20) + height / 2;
                    g2d.fillOval(x1, y1, 2, 2);
                }
                g2d.dispose();
            }
        };
        // 菜单项事件处理
        sinItem.addActionListener(e -> {
            remove(demoComponent);
            demoComponent = new JComponent() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    int width = getWidth();
                    int height = getHeight();
                    g2d.drawLine(0, height / 2, width, height / 2); //x轴
                    g2d.drawLine(width / 2, 0, width / 2, height);  //y轴
                    g2d.setColor(Color.BLUE);
                    double step = Math.PI / 180;
                    for (int i = -width / 2; i < width / 2; i++) {
                        double x = (double) i / 20;
                        double y = 2 * Math.sin(x);
                        int x1 = i + width / 2;
                        int y1 = (int) (-y * 20) + height / 2;
                        g2d.fillOval(x1, y1, 2, 2);
                    }
                    g2d.dispose();
                }
            };
            add(demoComponent, BorderLayout.CENTER);
            revalidate();
        });
        cosItem.addActionListener(e -> {
            remove(demoComponent);
            demoComponent = new JComponent() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    Graphics2D g2d = (Graphics2D) g;
                    int width = getWidth();
                    int height = getHeight();
                    g2d.drawLine(0, height / 2, width, height / 2); //x轴
                    g2d.drawLine(width / 2, 0, width / 2, height);  //y轴
                    g2d.setColor(Color.BLUE);
                    double step = Math.PI / 180;
                    for (int i = -width / 2; i < width / 2; i++) {
                        double x = (double) i / 20;
                        double y = 2 * Math.cos(x);
                        int x1 = i + width / 2;
                        int y1 = (int) (-y * 20) + height / 2;
                        g2d.fillOval(x1, y1, 2, 2);
                    }
                }
            };
            add(demoComponent, BorderLayout.CENTER);
            revalidate();
        });
        otherItem.addActionListener(e -> {
            remove(demoComponent);
            demoComponent = new JComponent() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    try {
                        BufferedImage image = ImageIO.read(new File("src/img/yuanshen.jpg"));
                        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            add(demoComponent, BorderLayout.CENTER);
            revalidate();
        });
        setSize(552,561);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImg = toolkit.getImage("src/img/cursor.png");
        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        new MainFrame().setCursor(customCursor);
    }
}

