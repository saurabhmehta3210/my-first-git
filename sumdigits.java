class sumdigits
{
public static void main(String args[])
{
int r=0;
int s=0;
int num=Integer.parseInt(args[0]);
for(int i=num;i>=1;i=i/10)
{
r=i%10;
s=s+r;
}
System.out.println("the sum is"+s);
}
}

