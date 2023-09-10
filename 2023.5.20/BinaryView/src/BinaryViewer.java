import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author gong
 */
public class BinaryViewer {
    public static void main(String[] args) throws IOException {
        String filename = "file.bin";
        final int LINE_SIZE = 16;
        byte[] buffer = new byte[LINE_SIZE];

        // 打开文件
        FileInputStream fis = new FileInputStream(new File(filename));

        // 输出文件内容
        int offset = 0;
        while (fis.read(buffer) != -1) {
            // 输出左侧地址
            System.out.printf("%08x   ", offset);

            // 输出中间16字节的16进制字符并用空格分隔
            for (int i = 0; i < LINE_SIZE; i++) {
                if (i == 8) {
                    System.out.print(" ");
                }
                if (i < buffer.length) {
                    System.out.printf("%02x", buffer[i]);
                } else {
                    System.out.print("  ");
                }
                System.out.print(" ");
            }

            // 输出右侧字符
            System.out.print("  ");
            for (int i = 0; i < LINE_SIZE; i++) {
                if (i < buffer.length) {
                    if (buffer[i] >= ' ' && buffer[i] <= '~') {
                        System.out.print((char) buffer[i]);
                    } else {
                        System.out.print(".");
                    }
                } else {
                    System.out.print(" ");
                }
            }

            // 换行
            System.out.println();

            offset += LINE_SIZE;
        }

        // 关闭文件
        fis.close();
    }
}
