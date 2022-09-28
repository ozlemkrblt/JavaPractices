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

}
