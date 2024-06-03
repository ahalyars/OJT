public class construc {
    int bornYr;
    String fname;

public construc(int yr,String name)
{
bornYr=yr;
fname=name;
}

public static void main(String[] args) {
    construc myConstruc=new construc(2000, "Ahalya");
    System.out.println(myConstruc.bornYr+ " "+myConstruc.fname);
}
}

