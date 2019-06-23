import java.util.Scanner;
class Main
{
  public static int squ(int num)
  {
    int squ=num*num;
    System.out.println(squ);
    return squ;
  }
  
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n1= in.nextInt();
      int squ1=squ(n1);
	} 
}