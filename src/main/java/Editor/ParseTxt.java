package Editor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParseTxt {
    public static ArrayList<String> ToList() {

        ArrayList MyData = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("testfile1.txt"));
            String line = reader.readLine();
            Integer count = 1;
            MyData.add(line);
            while (line != null) {
                //System.out.println(line + " " + count);
                line = reader.readLine();
                count++ ;
                MyData.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }return MyData;
    }
}
