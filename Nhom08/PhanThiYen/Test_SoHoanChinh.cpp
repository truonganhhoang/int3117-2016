#include"iostream"
#include<conio.h>

using namespace std;
int main()
{
	int n,s=0,i; // gia tri nhap vao
	
	@test
	
	do
	{
		cout<<"\nNhap so nguyen duong n :";
		cin>>n;
	}while(n<=0);
	for(i=1;i<=n/2;i++)
		if(n%i==0) // lenh kiem thu
		s+=i;
		
	@test
	
	if(s==n)
		cout<<n<<" La so hoan chinh "; // ket qua mong muon
	else
		cout<<n<< " Khong la so hoan chinh "; //ket qua mong muon
	getch();
	return 0;
}
