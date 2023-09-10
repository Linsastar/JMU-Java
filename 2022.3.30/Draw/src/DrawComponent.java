import javax.swing.*;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class DrawComponent extends JComponent implements MouseListener, MouseMotionListener {
    private List<List<Point>> lines = new ArrayList<>();
    private List<Point> currentLine = null;

    public DrawComponent() {
        setPreferredSize(new Dimension(400, 400));

        addMouseListener(this);
        addMouseMotionListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension size = getSize();
        Graphics2D g2d = (Graphics2D) g;
        // 设置线条粗细为3
        g2d.setStroke(new BasicStroke(3));
        g.drawRect(0, 0, size.width - 1, size.height - 1);
        // 绘制所有曲线
        for (List<Point> line : lines) {
            if (line.size() <= 1) {
                continue;
            }

            Point prev = line.get(0);
            for (int i = 1; i < line.size(); i++) {
                Point curr = line.get(i);
                g.drawLine(prev.x, prev.y, curr.x, curr.y);
                prev = curr;
            }
        }

        // 绘制当前曲线
        if (currentLine != null && currentLine.size() > 1) {
            Point prev = currentLine.get(0);
            for (int i = 1; i < currentLine.size(); i++) {
                Point curr = currentLine.get(i);
                g.drawLine(prev.x, prev.y, curr.x, curr.y);
                prev = curr;
            }
        }
    }


    @Override
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("画板");
        ImageIcon icon=new ImageIcon("src/resources/img.png");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setPreferredSize(new Dimension(500, 500));
        contentPanel.add(new DrawComponent());

        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void clear() {
        // 清空线段
        lines.clear();
        currentLine = null;
        // 重绘画板
        revalidate();
        repaint();
    }
}
