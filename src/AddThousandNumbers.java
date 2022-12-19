public class AddThousandNumbers {
    public static void main(String[] args)
    {
        final int LOWERBOUND=1;
        final int UPPERBOUND=1000;
        int number=LOWERBOUND;
        int sum=0;
        while(number<=UPPERBOUND)
        {
            sum = sum+number;
            ++number;
        }
        System.out.println("the sum from" + LOWERBOUND + "to" + UPPERBOUND +"is" + sum);

    }
}
