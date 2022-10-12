public class Main {
    public static void main(String[] args) {
        int mysuma = suma(1,5,3);
        System.out.println(mysuma);
        potato mypotato = new potato();

        mypotato.quitarBrazos();
        mypotato.quitarBrazos();

        System.out.println(mypotato.brazos);

        auto miAuto = new auto();
        miAuto.sumarPuertas();

        miAuto.sumarPuertas();
        System.out.println(miAuto.puertas);


    }
    public static int suma(int a, int b , int c ){
        var resultado = a+b+c;
        return resultado;
    }
}

class potato {
    public int brazos = 0;

    public void quitarBrazos(){
        this.brazos --;
    }
}

class auto{
    int puertas = 4;

    public void sumarPuertas(){
        this.puertas ++;
    }
}