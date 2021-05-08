package kmit;

@FunctionalInterface
interface Cab{
    int bookCab(String src, String dest); // abstract, static , public
}

/*class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("Booked");
    }
}*/

public class TestLamda {
    public static void main(String[] args) {
       /* Cab cab=new Ola();
        cab.bookCab();*/

      /* Cab cab=new Cab() {
           @Override
           public void bookCab() {
               System.out.println("Booked");
           }
       };

       cab.bookCab();
*/

        Cab cab =(x,y)-> {
            System.out.println("Booked from "+x+" to "+y);
            return 200;
        };
        System.out.println("Rs - "+ cab.bookCab("Banjara Hills","kmit"));


    }
}
