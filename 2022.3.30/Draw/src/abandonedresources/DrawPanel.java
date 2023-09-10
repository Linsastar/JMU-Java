package abandonedresources;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
    private List<List<Point>> lines = new ArrayList<>();
    private List<Point> currentLine = null;

    public DrawPanel() {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(400, 400));

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);

        // 绘制所有曲线
//        for (List<Point> line : lines) {
//            if (line.size() <= 1) {
//                continue;
//            }
//
//            Point prev = line.get(0);
//            for (int i = 1; i < line.size(); i++) {
//                Point curr = line.get(i);
//                g.drawLine(prev.x, prev.y, curr.x, curr.y);
//                prev = curr;
//            }
//        }
//
//        // 绘制当前曲线
//        if (currentLine != null && currentLine.size() > 1) {
//            Point prev = currentLine.get(0);
//            for (int i = 1; i < currentLine.size(); i++) {
//                Point curr = currentLine.get(i);
//                g.drawLine(prev.x, prev.y, curr.x, curr.y);
//                prev = curr;
//            }
//        }
//    }

    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        currentLine = new ArrayList<>();
        currentLine.add(e.getPoint());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        currentLine.add(e.getPoint());
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        lines.add(currentLine);
        currentLine = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    // 其他Mouse事件省略

    public static void main(String[] args) {
        JFrame frame = new JFrame("画板");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setPreferredSize(new Dimension(500, 500));
        contentPanel.add(new DrawPanel(), BorderLayout.CENTER);

        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
