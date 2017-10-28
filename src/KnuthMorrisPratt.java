//STRING PROCESSING:	String Matching--
//			A string is a sequence of characters from an alphabet.		
//			Searching for a given word/pattern in a text.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
// Class KnuthMorrisPratt //
public class KnuthMorrisPratt
{
    // Failure array //
    private int[] failure;
    // Constructor //
    public KnuthMorrisPratt(String text, String pat)
    {
        // pre construct failure array for a pattern //
        failure = new int[pat.length()];
        fail(pat);
        // find match //
        int pos = posMatch(text, pat);
        if (pos == -1)
            
            //		If the search value has no match, ex:
            //          therefore return "no match"
            System.out.println("No match found");
        else
            //Third:	If the value has been found therefore locate its place and output, ex:
            //		"The string "orl" is found at the 7th array of the input "hello world"

            System.out.println("The String Match is found at the "+ pos + " array of the input ");
    }
    // Failure function for a pattern //
    private void fail(String pat)
    {
        int n = pat.length();
        failure[0] = -1;
        for (int j = 1; j < n; j++)
        {
            int i = failure[j - 1];
            while ((pat.charAt(j) != pat.charAt(i + 1)) && i >= 0)
                i = failure[i];
            if (pat.charAt(j) == pat.charAt(i + 1))
                failure[j] = i + 1;
            else
                failure[j] = -1;
        }
    }
    // Function to find match for a pattern //
    private int posMatch(String text, String pat)
    {
        int i = 0, j = 0;
        int lens = text.length();
        int lenp = pat.length();
        while (i < lens && j < lenp)
        {
            if (text.charAt(i) == pat.charAt(j))
            {
                i++;
                j++;
            }
            else if (j == 0)
                i++;
            else
                j = failure[j - 1] ;
        }
        return ((j == lenp) ? (i - lenp) : -1);
    }
    // Main Function //
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //First:    Enter values to be inputted (must be a combination of strings "words or sentences")
        System.out.println("Enter text values to be inputted: ");
        String text = br.readLine();
        //Second:   Enter values to be searched from the inputted
        System.out.println("Enter Pattern to be searched: ");
        String pattern = br.readLine();
        KnuthMorrisPratt kmp = new KnuthMorrisPratt(text, pattern);        
    }
}