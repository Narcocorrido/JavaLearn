package chapter.d.table.d.string;

import java.util.Scanner;

public class LineReader {
    public static String getLine(String info) {
        System.out.println(info);
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
