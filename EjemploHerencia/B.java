public class B extends A{
    String c1 = "amarillo";
    String c3 = "verde";

    void imprimeC1 (){
        System.out.println(this.c1);
        System.out.println(super.c1);
        System.out.println(c1);
    }
    B (String c1){
        this.c1 = c1;
    }
}
