
import java.util.Scanner;

public class Main
{
    public static final String _word = "антрикот";
    public static String[] currentWord;
    public static int length = _word.length();

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        currentWord = new String[length];

        for (int i=0;i<length;i++)
        {
            currentWord[i]="-";
            System.out.print(currentWord[i]);
        }

        while (true)
        {
            char vvod = scanner.next().charAt(0);
            if (_word.toLowerCase().indexOf(vvod) >= 0)
            {
                ShowLetters(vvod);
            }
            else
            {
                System.out.print("Такой буквы нет");
            }
        }
    }

    public static void ShowLetters(char x)
    {
        for (int i=0;i<length;i++)
        {
            if (_word.charAt(i)==x)
            {
                currentWord[i]=String.valueOf(x);
            }
            System.out.print(currentWord[i]);
        }
    }
}