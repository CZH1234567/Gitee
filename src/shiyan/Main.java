package shiyan;

//java文件对话框
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("文件对话框");
        jf.setSize(300, 200);
        jf.setLayout(new GridLayout(2, 1));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1, 2));
        JButton button1 = new JButton("选择文件");
        JButton button2 = new JButton("选择文件夹");
        jp.add(button1);
        jp.add(button2);

        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(1, 2));
        JButton button3 = new JButton("打开文件");
        JButton button4 = new JButton("打开文件夹");
        jp2.add(button3);
        jp2.add(button4);

        jf.add(jp);
        jf.add(jp2);
        jf.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jfc.showDialog(new JLabel(), "选择");
                File file = jfc.getSelectedFile();
                if (file != null) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                jfc.showDialog(new JLabel(), "选择");
                File file = jfc.getSelectedFile();
                if (file != null) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jfc.showDialog(new JLabel(), "选择");
                File file = jfc.getSelectedFile();
                if (file != null) {
                    try {
                        FileInputStream fis = new FileInputStream(file);
                        byte[] b = new byte[1024];
                        int len = 0;
                        while ((len = fis.read(b)) != -1) {
                            System.out.println(new String(b, 0, len));
                        }
                        fis.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
    }
}