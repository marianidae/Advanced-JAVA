package StreamsFilesAndDirectories;

import java.io.*;

public class ALLCAPITALS_03 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("src/Exercises Resources/output.txt"));
        BufferedReader br = new BufferedReader(new FileReader("src/Exercises Resources/input.txt"));
        br.lines().forEach(line -> pw.println(line.toUpperCase()));
        br.close();
        pw.close();
    }
}
