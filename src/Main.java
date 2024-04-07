import com.aluracursos.screenmacth.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempo;

public class Main {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2021, 120, true, "diyoifa");

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie casaDragon = new Serie("la casa del dragon", 2022, true, 1, 10, 50);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuration());

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNumber(1);
        episodio.setName("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        filtroRecomendacion.filtra(episodio);


    }
}