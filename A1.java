
public class A1
{
    public static void main(String[] args_){
        int i,j,r;
        r=5;
        for(i=0;i<r;i++){
            for(j=1;j<=r-i;j++){
                System.out.print(" ");
                
            }
            for(j=1;j<=2*i-1;j++){
                System.out.print("+");
            }
            System.out.print("\n");
        }
    }
}
