package EbobEkok;

public class Number {
    private int n;
    private int isBig;

    public Number(int n){
        this.n=n;
    }

    public int EBOB(int b){

        isBig= n<b ? 0 : 1;
        if(isBig==1){
            if(b==0){
                return n;
            }
            n=n%b;
            return EBOB(b);
        }else{
            int temp=n;
            this.n= b ; 
            b=temp ;
            if(n==0){
                return b;
            }
            return EBOB(b);
        }

    }

    public int EKOK(int b){


        isBig= n<b ? 0 : 1;
        if(isBig==1){

            return (n/ EBOB(b)) * b ;
        }else{

            return (b/ EBOB(b)) * n ;
        }


        
    }

    public void fibonacci(){
        int f[] = new int[n+2]; 
        int i;
      
        f[0] = 0;
        f[1] = 1;
     
        for (i = 2; i <= n+1; i++){

            f[i] = f[i-1] + f[i-2];
            System.out.println(f[i-2]);
        }
      

    }

}
