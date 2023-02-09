import java.util.Scanner;
import java.util.Random;

class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
    	int i=5,j,sample=0,guess;
        int randomNumber = random.nextInt(100);
	
	
	
	for(j=0;j<i;j++)
	{
		sample++;
        	System.out.println("Enter number between 1 to 100");
        	guess = sc.nextInt();
		
		
		if(randomNumber>guess)
		{
			System.out.println("number is greater than "+guess);
			
		}
		else if(randomNumber<guess)
		{
			System.out.println("number is less than "+guess);
			
		      
		}
		else
		{
			System.out.println("congratulations,guessed number is correct");
			System.out.println("you guessed number in "+sample+" trials");
			break;
		}
		
	}
	if(j==i)
	{
		System.out.println("you exhausted "+i+" trials");
	}
	
	
    }
}