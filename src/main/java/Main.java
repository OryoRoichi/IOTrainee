import java.io.*;

public class Main {

    public static void main(String[] args) throws  IOException {
        File file = new File("E:\\Alekseev\\text.txt");
        InputStream in = new BufferedInputStream(new FileInputStream(file));
        byte[] buffer = new byte[1024];
        String res = "";
        while(in.read(buffer) != -1){
            res = res.concat(new String(buffer)).concat("\n");
        }
        res = replace(res);
        System.out.println(res);
        OutputStream out = new BufferedOutputStream(new FileOutputStream(new File(System.getProperty("user.home")+File.separator+"result.txt")));
        out.write(res.getBytes());
        out.flush();
        in.close();
        System.out.println("worked");

    }
    public static String replace(String str){
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 's'){
                arr[i] = '0';
            }
        }

        return String.valueOf(arr);
    }

}
