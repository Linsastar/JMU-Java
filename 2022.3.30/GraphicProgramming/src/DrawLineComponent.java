import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class DrawLineComponent extends JComponent implements MouseListener, MouseMotionListener {
    private ArrayList<Point2D> points;
    private Point2D.Double dragOrigin = null; // 拖动起点
    private boolean isDragging = false; // 是否正在拖动
    private int selectedPointIndex = -1; // 选中的点的索引
    private boolean button1_isPressed=false;
    private boolean button3_isPressed=false;
    public DrawLineComponent(ArrayList<Point2D> points) {
        this.points = points;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        for (int i = 0; i < points.size() - 1; i++) {
            Point2D p1 = points.get(i);
            Point2D p2 = points.get(i + 1);
            Line2D line = new Line2D.Double(p1, p2);
            g2.draw(line);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2f));
        g2d.setColor(Color.RED);
        int n = points.size();
        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                Point2D p1 = points.get(i);
                Point2D p2 = points.get(i + 1);
                g2d.drawLine((int) p1.getX(), (int) p1.getY(), (int) p2.getX(), (int) p2.getY());
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            // 判断鼠标是否按下左键
            dragOrigin = new Point2D.Double(e.getX(), e.getY()); // 记录起始坐标
            isDragging = true;
            button1_isPressed=true;
            selectedPointIndex = getSelectedIndex(points, e); // 获取被选中的点的索引
        } else if (e.getButton() == MouseEvent.BUTTON3) {
            // 判断鼠标是否按下右键
            dragOrigin = new Point2D.Double(e.getX(), e.getY()); // 记录起始坐标
            isDragging = true;
            button3_isPressed=true;
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            isDragging = false;
            button1_isPressed=false;
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            isDragging = false;
            button3_isPressed=false;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (isDragging&& button1_isPressed) { // 鼠标右键已经按下，正在拖动
            double xShift = e.getX() - dragOrigin.getX(); // 计算x轴平移量
            double yShift = e.getY() - dragOrigin.getY(); // 计算y轴平移量
            for (Point2D point : points) {
                double newX = point.getX() + xShift;
                double newY = point.getY() + yShift;
                point.setLocation(newX, newY); // 将每个点向右平移xShift，向下平移yShift
            }
            dragOrigin.setLocation(e.getX(), e.getY()); // 更新拖动起点坐标
            repaint(); // 重新绘制曲线
        }
        if (isDragging && button3_isPressed && selectedPointIndex != -1) {
            // 鼠标右键已经按下，正在拖动
            double xShift = e.getX() - dragOrigin.getX(); // 计算x轴平移量
            double yShift = e.getY() - dragOrigin.getY(); // 计算y轴平移量
            Point2D point = points.get(selectedPointIndex);
            double newX = point.getX() + xShift;
            double newY = point.getY() + yShift;
            point.setLocation(newX, newY); // 将该点向右平移xShift，向下平移yShift
            dragOrigin.setLocation(e.getX(), e.getY()); // 更新拖动起点坐标
            repaint(); // 重新绘制曲线
        }

    }
    private double getDistance(Point2D p1, Point2D p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {

    }
    private int getSelectedIndex(ArrayList<Point2D> points, MouseEvent e) {
        for (int i = 0; i < points.size(); i++) {
            Point2D point = points.get(i);
            if (getDistance(point, e.getPoint()) < 5) { // 当鼠标与数据点的距离小于 5 时视为选中
                return i;
            }
        }
        return -1; // 没有选中任何点
    }

}