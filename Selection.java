import java.util.Scanner;
class SelectionSort
{
   private int[] arr;
   public SelectionSort(int[] arr)
   { 
     this.arr=arr;
   }
   public int[] proccess()
   {
      for(int i=0;i<arr.length-1;i++)
      {
         int min=i;
         for(int j=i+1;j<arr.length;j++)
         {
            if(arr[min]>arr[j])
            {
              min=j;
            }
         }
       int temp=arr[i];
       arr[i]=arr[min];
       arr[min]=temp;
      }
     return arr;
    }
}
class Main
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter the size of an Arrar : ");
     int n=sc.nextInt();
     int[] arr=new int[n];
     for(int i=0;i<n;i++)
     {
        System.out.print("Enter the "+(i+1)+" element : ");
        arr[i]=sc.nextInt();
     }
     SelectionSort obj=new SelectionSort(arr);
     System.out.println("Origional Array");
     for(int i=0;i<n;i++)
     {
        System.out.print(arr[i]+" ");
     }
     System.out.println();
     System.out.println("Array after Selection sort");
     int[] arr2=obj.proccess();
     for(int i=0;i<n;i++)
     {
        System.out.print(arr2[i]+" ");
     }
     //System.out.print(obj.proccess());
   }
}