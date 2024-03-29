import java.util.Scanner;

public class HighestFreq {

    public static void main(String[] args)
    {
        //Prompt the user to enter their sentence
        System.out.println("Enter your sentence: ");
        Scanner in = new Scanner(System.in);
        //Take the entered sentence
        String input = in.nextLine();
        //This is for searching
        char auxiliary = 'a';
        //This is the final letter which has the highest occurrence
        char[] letter = new char[26];
        int arrayCounter = 0;
        //This is simply a counter
        int frequency = 0;
        //This shows the highest frequency of a letter inside the entered sentence
        int maxFrequency = 0;
        //The outer loop goes for all letters in English
        for(int i = 0; i < 26; i++)
        {
            //The inner loop searches along the whole entered sentence
            for(int j = 0; j < input.length(); j++)
            {
                //No matter if the letter inside the sentence is capital or small
                if((auxiliary+i == input.charAt(j)) || (auxiliary+i-32 == input.charAt(j)))
                {
                    frequency++;
                }
            }
            //The counted number and its associated letter are saved as maxFrequency and
            //letter respectively, only if it is higher than the
            //previous maxFrequency
            if(frequency > maxFrequency)
            {
                maxFrequency = frequency;
                frequency = 0;
                letter[arrayCounter] = (char) (auxiliary+i);
                arrayCounter++;
            }
            //In case more than one letter has been repeated with the highest frequency
            else if((frequency == maxFrequency) && ((maxFrequency > 0)))
            {
                frequency = 0;
                letter[arrayCounter] = (char) (auxiliary+i);
                arrayCounter++;
            }
            else
            {
                //If not bigger than the max, its value simply vanishes!
                frequency = 0;
            }
        }
        System.out.print("The letter(s) ");
        for(int i = 0; i < arrayCounter-1; i++)
        {
            System.out.print(letter[i] + ", ");
        }
        System.out.print(letter[arrayCounter-1]);
        System.out.print(" has/have been repeated (regardless of being small or capital) "
                +maxFrequency+" times," +
                " which is the maximum in this entered sentence!");
    }
}
