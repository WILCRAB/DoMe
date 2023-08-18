
public class DVD extends Elemento
{
    private String director;
    
    public DVD(String elTitulo, String elDirector, int tiempo)
    {
            super(elTitulo, tiempo);
            director = elDirector;
    }

    public  String getDirector()
    {
        return director;
    }
    
    public void print()
    {
        System.out.print("DVD");
        System.out.print("Titulo: " +getTitulo());
        System.out.print("Director: " +director);
    }
}
