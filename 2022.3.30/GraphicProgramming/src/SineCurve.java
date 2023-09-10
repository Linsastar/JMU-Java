import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import javax.swing.*;

public class SineCurve {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("画图——巩晨阳简洁版");
        frame.setIconImage(new ImageIcon("src/resources/img.png").getImage());
        ArrayList<Point2D> points = new ArrayList<>();
        DrawLineComponent component = new DrawLineComponent(points);
        JButton functionbuttonSin = new JButton("正弦函数");
        JButton functionbuttonCos = new JButton("余弦函数");
        JButton functionbuttonEx = new JButton("ex函数");
        functionbuttonSin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                points.clear(); // 清空旧数据
                for (double x = 0; x < 2 * Math.PI; x += 0.001) {
                    double y = 2 * Math.sin(x);
                    points.add(new Point2D.Double(x * 80, y * 80 + 250));
                }
                component.repaint(); // 更新曲线
            }
        });
        functionbuttonCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                points.clear(); // 清空旧数据
                for (double x = 0; x < 2 * Math.PI; x += 0.001) {
                    double y = -2 * Math.cos(x);
                    points.add(new Point2D.Double(x * 80, y * 80 + 250));
                }
                component.repaint(); // 更新曲线
            }
        });
        functionbuttonEx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                points.clear(); // 清空旧数据
                for (double x = 0; x < 10; x += 0.1) {
                    double y = -Math.pow(Math.E, x);
                    points.add((new Point2D.Double(x * 80, y + 400)));
                }
                component.repaint(); // 更新曲线
            }
        });
        JPanel panel = new JPanel();
        panel.add(functionbuttonSin);
        panel.add(functionbuttonCos);
        panel.add(functionbuttonEx);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(component);
        frame.setVisible(true);
    }
}
