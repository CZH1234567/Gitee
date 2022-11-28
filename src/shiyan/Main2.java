package shiyan;
// java文件对话框
public class Main2 {
    public static void main(String[] args) {
        // 1.创建文件选择器
        var chooser = new java.awt.FileDialog(new java.awt.Frame(), "选择文件");
        // 2.设置模式
        chooser.setMode(java.awt.FileDialog.LOAD);
        // 3.显示对话框
        chooser.setVisible(true);
        // 4.获取文件路径
        var file = chooser.getFile();
        // 5.获取文件夹路径
        var dir = chooser.getDirectory();
        // 6.输出
        System.out.println("文件路径: " + dir + file);
    }
}
