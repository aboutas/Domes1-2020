package Editor;

import sun.applet.Main;

import java.util.ListIterator;
import java.util.Scanner;

public class Menu {

    private static StandardInputRead strInputRead= new StandardInputRead();;
    private static boolean isNotX = true;

    public static void main(String[] args) {

        ListIterator list = ParseTxt.ToList().listIterator();
        while (isNotX) {
            char input = strInputRead.readString("Enter a character : ").charAt(0);
            switch (input) {
                case '^':    //Go to the first line
                    System.out.println(ParseTxt.ToList().get(0));
                case '$':    //Go to the last line
                    String last = ParseTxt.ToList().get(ParseTxt.ToList().size() - 2);
                case '-':    //Go up one line
                    while (list.hasPrevious()) {
                        String prev = (String) list.previous();
                    }
                    break;
                case '+':    //Go down one line
                    if (list.hasNext()) {
                        String next = String.valueOf(list.next());
                        System.out.println(next);
                        break;
                    }
                case 'a':    //Add new line after current line (the user is asked to type in the text for the new line)
                    break;
                case 'x':    //Add new line after current line (the user is asked to type in the text for the new line)
                    isNotX=false;
                    break;
                case 't':    //Add new line before current line (the user is asked to type in the text for the new line)
                    break;
                case 'd':    //Delete current line
                    break;
                case 'l':    //Print all lines
                    break;
                case 'n':    //Toggle whether line numbers are displayed when printing all lines (l command)
                    break;
                case 'p':    //Print current line
                    break;
                case 'q':    //Quit without save
                    break;
                case 'w':    //Write file to disk
                    break;
                case '=':    //Print current line number
                    break;
                case '#':    //Print number of lines and characters
                    break;
            }
        }
    }
}
