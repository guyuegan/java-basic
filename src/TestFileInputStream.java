import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: Neo
 * 日    期: 2018年03月12日  16:47:50
 * Q    Q: 1784286916
 * </pre>
 */
public class TestFileInputStream {
    public static void main(String[] args){
        try {
            FileInputStream fileInputStream = new FileInputStream("tmp/fileInputStream");
            byte[] content = new byte[2014];
            if(fileInputStream.read(content) != -1){
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
