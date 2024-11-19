package implementado;
import Interface.Limpiar;



public class ManteninimientoLimp implements Limpiar {

    @Override
    public void limpiar(String ObjetoaLimpiar) {
        System.out.println("Su: " + ObjetoaLimpiar + " esta siendo Limpiado en este instante!");
    }

    
}

