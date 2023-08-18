

public class CD extends Elemento
{
    private String autor;
    private int numeroDePistas;
    
    public CD(String elTitulo, String elAutor, int pistas, int tiempo)
    {
        super(elTitulo, tiempo);
        autor = elAutor;
        numeroDePistas = pistas;
    }
    
    public  String getAutor()
    {
        return autor;
    }
    
    public int getNumeroDePistas()
    {
        return numeroDePistas;
    }
    
    public void print()
    {
        System.out.print("CD");
        System.out.print("Titulo: " +super.getTitulo());
        System.out.print("Autor: " +autor);
        System.out.print("Num pistas: " +numeroDePistas);
    }
}
