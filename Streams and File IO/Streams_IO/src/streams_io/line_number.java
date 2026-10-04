package streams_io;
import java.io.*;

public class line_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter file name: ");
        String fname = br.readLine();

        BufferedReader fr = new BufferedReader(new FileReader(fname));
        String line;
        int lineNo = 1;

        while ((line = fr.readLine()) != null) {
            System.out.println(lineNo + ": " + line);
            lineNo++;
        }

        fr.close();
        br.close();
    }
}
