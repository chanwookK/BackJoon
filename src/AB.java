import java.io.*;
import java.util.StringTokenizer;

public class AB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
    }
}
