#include"iostream"
#include<conio.h>

using namespace std;
int main()
{
	int n,s=0,i;
	do
	{
		cout<<"\nNhap so nguyen duong n :";
		cin>>n;
	}while(n<=0);
	for(i=1;i<=n/2;i++)
		if(n%i==0)
		s+=i;
	if(s==n)
		cout<<n<<" La so hoan chinh ";
	else
		cout<<n<< " Khong la so hoan chinh ";
	getch();
	return 0;
}
