public class PrimeNumber_1 {
    public static void main (String[] args)
    {
        int i, number;


        for (i = 2; i <= 100; i++)
        {
            int counter=0;
            for(number =i; number>=1; number--)
            {
                if(i%number==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
                System.out.print(i + " ");
            }
        }

    }
}
