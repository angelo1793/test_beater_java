
package testbeater;


public class TestBeater {
    int Monica;
    String asi;
    int no;
    String vas;
    int a;
    String pasar;
    String el;
    int curso;
    String de;
    int web;
    String integrado;

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Jeancarlos bica");
        System.out.println("Hola JC");
        System.out.println("MIREN EL CONSTRUCTOR XD");
    }

    public TestBeater() {
    }

    public TestBeater(int monica, String asi, int no, String vas, int a, String pasar, String el, int curso, String de, int web, String integrado) {
        Monica = monica;
        this.asi = asi;
        this.no = no;
        this.vas = vas;
        this.a = a;
        this.pasar = pasar;
        this.el = el;
        this.curso = curso;
        this.de = de;
        this.web = web;
        this.integrado = integrado;
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

    public String getPasar() {
        return pasar;
    }

    public void setPasar(String pasar) {
        this.pasar = pasar;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }
        int i;
        for(i=1;i<5;i++){
            System.out.println("Jeancarlos bica");
        }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public int getWeb() {
        return web;
    }

    public void setWeb(int web) {
        this.web = web;
    }

    public String getIntegrado() {
        return integrado;
    }

    public void setIntegrado(String integrado) {
        this.integrado = integrado;
    }

    public int nacimiento(int edad){
        int nac = 2017- edad;
        return nac;
    }
    //Este es un comentario muy sad esperando que todo salga bien

}
