public class Rettangolo extends Forma{

    //int base;
    //int altezza;

    @java.lang.Override
    public int calcolaArea(){
       return this.altezza * this.base;
    }


    public Rettangolo(int base, int altezza) {
      this.base = base;
      this.altezza = altezza;
   }



    @java.lang.Override
    public java.lang.String toString() {
        return "Rettangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
