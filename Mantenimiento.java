

/*Interfaz mantenimiento, esta es la que implementa todos los metodos, ahora se refactorizara. */

public interface Mantenimiento {
    public void revisar( String ObjetoaRevisar);
    public void reparar(String ObjetoaReparar);
    public void limpiar(String ObjetoaLimpiar);
}
