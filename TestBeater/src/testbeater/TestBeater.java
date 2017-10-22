

package testbeater;
public class TestBeater {
    int Monica;
    String asi;
    int no;
    String vas;
    int a;


    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Jeancarlos bica");
        System.out.println("Hola JC");
        System.out.println("MIREN EL CONSTRUCTOR XD");
    }

    public TestBeater() {
    }

    public TestBeater(int monica, String asi, int no, String vas, int a) {
        Monica = monica;
        this.asi = asi;
        this.no = no;
        this.vas = vas;
        this.a = a;
    }

    public int getMonica() {
        return Monica;
    }

    public void setMonica(int monica) {
        Monica = monica;
    }

    public String getAsi() {
        return asi;
    }

    public void setAsi(String asi) {
        this.asi = asi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getVas() {
        return vas;
    }

    public void setVas(String vas) {
        this.vas = vas;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

