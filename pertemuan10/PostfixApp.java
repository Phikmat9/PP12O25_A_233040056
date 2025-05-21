package pertemuan10;

import java.io.IOException;
import java.util.Scanner;

public class PostfixApp {
    public static void main(String[] args) throws IOException {
        String input;
        int output;
        while (true) {
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if (input.equals("")) break;

            ParsePost aParser = new ParsePost (input);
            output = aParser.doParse();
            System.out.print("hasil operasi: "+ output);
        }
    }

    public static String getString() throws IOException
    {
        Scanner Scanner = new Scanner(System.in);
        String s = Scanner.nextLine();
        return s;
    }
}
