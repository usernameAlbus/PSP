package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Controller {

    @FXML
    private TextArea textArea;

    @FXML
    void setAction(ActionEvent event) throws IOException {
        Document doc = Jsoup.connect("https://www.youtube.com/feed/trending").get();
        int contador = 0;

        String title = doc.title();

        String resultado = "Titulo " + title + "\n___________________________________________________________________________________________________________\n";

        Elements titulos = doc.select("a");

        for (Element e : titulos) {
            if(!e.attr("title").equals("") && !e.attr("title").contains("http") && contador > 14) {
                resultado += "\nTitulo del video en trending:\n" + e.attr("title");
                resultado += "\nlink: https://www.youtube.com" + e.attr("href") + "\n___________________________________________________________________________________________________________\n";
            }
            contador++;
        }

        setAreaText(resultado);

    }

    @FXML
    void setMusica(ActionEvent event) throws IOException{
        Document doc = Jsoup.connect("https://www.youtube.com/feed/trending?bp=4gIuCggvbS8wNHJsZhIiUExGZ3F1TG5MNTlhazlNMUlzSUlFVXB2dEFaUkJJczBveA%3D%3D").get();
        int contador = 0;

        String title = doc.title();

        String resultado = "Titulo " + title + "\n_________________________________________________________________________________________\n";

        Elements titulos = doc.select("a");

        for (Element e : titulos) {
            if(!e.attr("title").equals("") && !e.attr("title").contains("http") && contador > 14) {
                resultado += "\nTitulo de la cancion en trending:\n" + e.attr("title");
                resultado += "\nlink: https://www.youtube.com" + e.attr("href") + "\n_________________________________________________________________________________________\n";
            }
            contador++;
        }

        setAreaText(resultado);
    }

    @FXML
    void setPeliculas(ActionEvent event) throws IOException{
        Document doc = Jsoup.connect("https://www.youtube.com/feed/trending?bp=4gIuCggvbS8wMnZ4bhIiUExuUzZNOHZRRmtkSWFWaU1mS3RMbndvekstbkpWNURsWA%3D%3D").get();
        int contador = 0;

        String title = doc.title();

        String resultado = "Titulo " + title + "\n_________________________________________________________________________________________\n";

        Elements titulos = doc.select("a");

        for (Element e : titulos) {
            if(!e.attr("title").equals("") && !e.attr("title").contains("http") && contador > 14) {
                resultado += "\nTitulo de la pelicula en trending:\n" + e.attr("title");
                resultado += "\nlink: https://www.youtube.com" + e.attr("href") + "\n_________________________________________________________________________________________\n";
            }
            contador++;
        }

        setAreaText(resultado);
    }

    public void setAreaText(String text) {
        textArea.setText(text);
    }
}
