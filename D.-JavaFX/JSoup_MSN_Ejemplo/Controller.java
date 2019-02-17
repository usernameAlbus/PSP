package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Controller {

    @FXML
    void setAction(ActionEvent event) throws IOException {
        Document doc = Jsoup.connect("https://www.msn.com/es-es/?ocid=BHEA000").get();

        String title = doc.title();
        System.out.println("Titulo " + title);

        Elements links = doc.select("a[href]");
        for (Element link : links) {
            if(link.text() != "" && link.attr("aria-label") != ""){
                System.out.println("\nTitulo: " + link.text());
                System.out.println("Link: " + link.attr("href"));
            }
        }
    }
}
