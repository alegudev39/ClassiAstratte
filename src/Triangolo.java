public class Triangolo extends Forma{
    public Triangolo(int base, int altezza) {
        this.altezza = altezza;
        this.base = base;
    }

    @java.lang.Override
    int calcolaArea() {
        return (base*altezza)/2;
    }
}
