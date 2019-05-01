import java.util.Scanner;
int n;

for(int a=0;a<=;a++)
{
	if (a==0)
	{
		s=1;
		System.out.println(a +"!"+"="+s);
	}
	else{
		int f=1;
		for(int b=1;b<=a;b++){
			f=f*b;
		}
		s=s+f;
		System.out.println(a+"!"+"="+f);
	}
}
System.out.println("la suma del factorial es ---> "+s);