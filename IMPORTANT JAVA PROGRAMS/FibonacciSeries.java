public class FibonacciSeries
{
public static void main(String args[])
{
int limit = 30;
long[] series = new long[limit];

series[0] = 0;
series[1] = 1;

for(int i=2; i<limit; i++)
{
series[i] = series[i-2] + series[i-2];
}

System.out.println("Fibonacci Series upto " +limit);

for(int i=0; i<limit ; i++)
{

System.out.println(series[i] +"  ");
}
}

}