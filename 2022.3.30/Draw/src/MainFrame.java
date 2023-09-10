import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MainFrame {
/*
 *   @author 巩晨阳
 */
    public MainFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Gong Chenyang's Painting");
        frame.setIconImage(new ImageIcon("src/resources/img.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImg = toolkit.getImage("src/resources/cursor.png");
        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        frame.setCursor(customCursor);
        JMenuBar menuBar = new JMenuBar();
        JMenu projectMenu = new JMenu("文件");
        frame.setJMenuBar(menuBar);
        menuBar.add(projectMenu);
        JMenuItem newItem = new JMenuItem("新建");
        JMenuItem aboutItem = new JMenuItem("关于");
        JMenuItem clear = new JMenuItem("清空");
        JMenuItem save = new JMenuItem("保存");
        JMenuItem open =new JMenuItem("打开");

        projectMenu.add(newItem);
        projectMenu.add(clear);
        projectMenu.add(open);
        projectMenu.add(save);
        projectMenu.add(aboutItem);
        save.addActionListener(e->{
            Container contentPane = frame.getContentPane();
            Component[] components = contentPane.getComponents();

            for (Component c : components) {
                if (c instanceof DrawComponent) {
                    BufferedImage image = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    Graphics2D g2d = image.createGraphics();
                    c.paint(g2d);
                    try {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("保存");
                        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                        fileChooser.showDialog(frame, "保存");
                        File selectedFile = fileChooser.getSelectedFile();
                        if (selectedFile != null) {
                            if (!selectedFile.getName().endsWith(".png")) {
                                selectedFile = new File(selectedFile.getAbsolutePath() + ".png");
                            }
                            ImageIO.write(image, "png", selectedFile);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        aboutItem.addActionListener(e -> {
            new AboutFrame();
        });
        open.addActionListener(e->{
            frame.getContentPane().removeAll();
            frame.add(new DrawComponent());
            frame.revalidate();
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("打开");
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                if (selectedFile != null) {
                    try {
                        BufferedImage image = ImageIO.read(selectedFile);
                        JComponent demoComponent = new JComponent() {
                            @Override
                            protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
                            }
                        };
                        frame.add(demoComponent);
                        demoComponent.repaint();
                        demoComponent.setVisible(true);
                        frame.revalidate();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        clear.addActionListener(e -> {
            // 获取主界面的内容面板
            Container contentPane = frame.getContentPane();
            Component[] components = contentPane.getComponents();
            // 打印contentPane中包含的组件数量
            //System.out.println("contentPane中组件数量：" + components.length);
            for (Component c : components) {
                // 打印每个组件的类型
                //System.out.println("component type: " + c.getClass().getSimpleName());
                if (c instanceof DrawComponent) {
                    ((DrawComponent) c).clear();
                    ((DrawComponent) c).revalidate();
                    frame.revalidate();
                }
            }
        });
        newItem.addActionListener(e -> {
            JFrame eFrame = new JFrame("画板");
            eFrame.setIconImage(new ImageIcon("src/resources/img.png").getImage());
            eFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            JPanel contentPanel = new JPanel(new BorderLayout());
//            contentPanel.setPreferredSize(new Dimension(500, 500));
//            contentPanel.add(new DrawComponent(), BorderLayout.CENTER);
            //frame.setContentPane(contentPanel);
            frame.getContentPane().removeAll();
            frame.add(new DrawComponent());
            frame.revalidate();
            eFrame.pack();
            eFrame.setLocationRelativeTo(null);

            // 将主界面的所有组件禁用
//            frame.setEnabled(false);
//            for (Component c : frame.getContentPane().getComponents()) {
//                c.setEnabled(false);
//            }
//            eFrame.addWindowListener(new WindowAdapter() {
//                @Override
//                public void windowClosing(WindowEvent e) {
//                    // 将主界面的所有组件启用
//                    frame.setEnabled(true);
//                    for (Component c : frame.getContentPane().getComponents()) {
//                        c.setEnabled(true);
//                    }
//                }
//            });
            //eFrame.setVisible(true);
        });
        frame.setVisible(true);
    }
}
