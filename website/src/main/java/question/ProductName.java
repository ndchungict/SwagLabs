package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.ProductCatalog;

import java.util.List;

public class ProductName implements Question<List<String>> {
    @Override
    public List<String> answeredBy(Actor actor) {
        return ProductCatalog.TXT_ITEMS_NAME.resolveAllFor(actor).texts();
    }

    public static Question<List<String>> isDisplay(){
        return new ProductName();
    }
}
