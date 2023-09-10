import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class Test {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image cursorImg = toolkit.getImage("src/img/cursor.png");
        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        new LoginFrame().setCursor(customCursor);
    }
}
