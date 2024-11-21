import implementado.MantenimientoRep;
import implementado.MantenimientoRev;
import implementado.ManteninimientoLimp;

public class Main_1 {

     public static void main(String[] args) {
        

MantenimientoRep MantenimientoRep = new MantenimientoRep();
MantenimientoRev mantenimientoRev = new MantenimientoRev();
ManteninimientoLimp ManteninimientoLimp = new ManteninimientoLimp();


MantenimientoRep.reparar("Lavadora");
mantenimientoRev.revisar("Televisor");
ManteninimientoLimp.limpiar("Estufa");
     }
}