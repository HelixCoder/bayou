// do-while loop
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.File;

class Test {
    BufferedReader br;
    public Test(File file) {
        br = new BufferedReader(new FileReader(file));
    }

    public void doTest() {
        String s;
        int i;
        for (i = 0; i < 10; i++)
            System.out.println(i);
        do {
            s = br.readLine();
        } while (br.ready());
        br.close();
    }
}