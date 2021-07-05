import java.util.Scanner;

public class HighestFreq {

    public static void main(String[] args)
    {
        System.out.println("Enter your sentence: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char auxiliary = 'a';
        char letter = 'a';
        int frequency = 0;
        int maxFrequency = 0;
        for(int i = 0; i < 26; i++)
        {
            for(int j = 0; j < input.length(); j++)
            {
                if((auxiliary+i == input.charAt(j)) || (auxiliary+i-32 == input.charAt(j)))
                {
                    frequency++;
                }
            }
            if(frequency > maxFrequency)
            {
                maxFrequency = frequency;
                frequency = 0;
                letter = (char) (auxiliary+i);
            }
            else
            {
                frequency = 0;
            }
        }
        System.out.println("The letter " + letter + " has been repeated (regardless of being small or capital) "
                +maxFrequency+" times," +
                " which is the maximum in this entered sentence!");
    }
}
