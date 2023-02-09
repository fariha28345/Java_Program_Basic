import java.util.Scanner;
public class CountNumberOfNotes_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] array={1000,500,200,100,50,20,10,5,2,1};

        int count;

        for(int i=0;i<10;i++)
        {
            count=amount/array[i];
            if(count!=0)
            {
                System.out.println(array[i]+" "+count);
            }
            amount=amount%array[i];
        }
    }
}
