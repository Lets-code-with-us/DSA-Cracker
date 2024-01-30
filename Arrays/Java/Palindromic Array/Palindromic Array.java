

/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int y=0;

     for(int i=0;i<n;i++){

         int x=a[i];

         int temp=x;

         int rev=0;

         while(x>0){

             rev=(rev*10)+(x%10);

             x=x/10;

            }

         if(rev==temp)

             y=y+1;

         }

         if(y==n)

             return 1;

         else

             return 0;
           }
}
