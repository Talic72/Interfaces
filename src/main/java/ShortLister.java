import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class ShortLister {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        JFileChooser chooser = new JFileChooser(projectPath);
        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION)
        {
            File file = chooser.getSelectedFile();
            Filter filter = new ShortWordFilter();

            try (Scanner sc = new Scanner(file))
            {
                System.out.println("Words less then 5 characters from " + file.getName() + ":");
                while (sc.hasNext())
                {
                    String word = sc.next();
                    if (filter.accept(word))
                    {
                        System.out.println(word);
                    }
                }
            }
            catch (IOException e)
            {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }
        else
        {
            System.out.println("No file selected.");
        }
    }
}
