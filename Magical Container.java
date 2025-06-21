/*
class QualityFactor
{
public static void main(String[] args)
{
int N=5,A[]={1,2,3,4,5},k=0,B[]={0,0,0,0,0};
for(int i=0;i<N;i++)
{
int r=A[i]-B[i];
for(int j=i;j<N;j++)
{
B[j]=B[j]+r;
}
k++;
}
System.out.println("magical array is:");
for(int i=0;i<N;i++)
{
System.out.println(B[i]);
}
System.out.println(k);

}
}
Output:
magical array is:
1
2
3
4
5
5
*/
