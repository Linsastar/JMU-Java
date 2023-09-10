import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.swing.*;


/**
 * @author gong
 */
public class FileSearchApp extends JFrame {

    private JTextField dirField;
    private JTextField extField;
    private JTextArea resultsArea;

    public FileSearchApp() {
        super("文件搜索");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        Image image= new ImageIcon("src/res/img.png").getImage();
        setIconImage(image);
        Image cursorImg = Toolkit.getDefaultToolkit().getImage("src/res/cursor.png");
        Cursor customCursor = Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(0, 0), "YuanShen");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        // 创建顶部面板
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("检索目录："));
        dirField = new JTextField(30);
        topPanel.add(dirField);
        topPanel.add(new JLabel("文件类型："));
        extField = new JTextField(10);
        topPanel.add(extField);

        JButton searchBtn = new JButton("搜索");
        searchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                searchFiles();
            }
        });
        topPanel.add(searchBtn);

        contentPane.add(topPanel, BorderLayout.NORTH);

        // 创建结果显示区域
        resultsArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(resultsArea);
        scrollPane.setPreferredSize(new Dimension(550, 300));
        contentPane.add(scrollPane, BorderLayout.CENTER);
    }

    private void searchFiles() {
        resultsArea.setText("");

        String startDir = dirField.getText().trim();
        String ext = extField.getText().trim();

        if (startDir.length() == 0 || ext.length() == 0) {
            resultsArea.setText("请输入检索目录和文件类型");
            return;
        }

        File dir = new File(startDir);
        if (!dir.isDirectory()) {
            resultsArea.setText("起始检索目录不存在或不是一个目录！");
            return;
        }

        ArrayList<String> foundFiles = findFiles(dir, ext);

        resultsArea.append("检索完成，共找到 " + foundFiles.size() + " 个符合条件的文件：\n");
        for (String file : foundFiles) {
            resultsArea.append(file + "\n");
        }
    }

    private ArrayList<String> findFiles(File dir, String ext) {
        ArrayList<String> fileList = new ArrayList<String>();
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(ext)) {
                fileList.add(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                ArrayList<String> subList = findFiles(file, ext);
                fileList.addAll(subList);
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        FileSearchApp app = new FileSearchApp();
        app.setVisible(true);
    }
}
