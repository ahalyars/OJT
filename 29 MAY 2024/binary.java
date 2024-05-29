class BinaryNumber{
    public static void main(String[] args) {
        long b1=2000,b2=1100;
        int i=0,remaider=0;
        long[] res=new long[25];
        while (b1!=0 || b2!=0) { 
            res[i++]=(b1%10+b2%10+remaider)%2;
            remaider=(int)(b1%10+b2%10+remaider)/2;
            b1=b1/10;
            b2=b2/10;
        }
        if(remaider!=0){
            res[i++]=remaider;
        }
        --i;
        System.out.println("Sum of the two binary numbers are :");
        while(i>=0){
            System.out.println(res[i]);
            i--;
        }
    }
}