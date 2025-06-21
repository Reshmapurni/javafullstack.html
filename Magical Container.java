/*
class QualityFactor
{
public static void main(String[] args)
{
int N=5,A[]={1,2,3,4,5},k=0,B[]={5,4,6,3,1};
for(int i=0;i<N;i++)
{
int r=A[i]-B[i];
for(int j=i;j<N;j++)
{
B[j]=B[j]+r;
}
for(int l=0;l<N;l++)
{
System.out.print(B[l]+" ");
}
System.out.println();
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
1 0 2 -1 -3
1 2 4 1 -1
1 2 3 0 -2
1 2 3 4 2
1 2 3 4 5
magical array is:
1
2
3
4
5
5
*/
