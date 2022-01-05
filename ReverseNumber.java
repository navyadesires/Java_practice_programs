// reverse the number

class ReverseNumber{
public static void main(string args[])
{
int n,reverse=;
Scanner in = new Scanner(system.in);
System.Out.Println("Enter a Number");

n = in.nextInt();
while(n! =0)
{
reverse = reverse * 10;
reverse = reverse +n % 10;
 n= n/10;
}
System.out.println(" The Reverse number is", +Reverse);
}
}