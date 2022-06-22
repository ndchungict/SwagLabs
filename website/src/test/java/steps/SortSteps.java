package steps;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ui.Select;
import ui.ProductCatalog;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SortSteps {

    @And("^(?:he|she|they|we) should see all products$")
    public void userShouldSeeAllProducts() {
        List<String> productsName = new ArrayList<>();
        List<String> productsPrice= new ArrayList<>();
        productsName = ProductCatalog.TXT_ITEMS_NAME.resolveAllFor(theActorInTheSpotlight()).texts();
        productsPrice = ProductCatalog.TXT_ITEMS_PRICE.resolveAllFor(theActorInTheSpotlight()).texts();

    }

    @And("^(?:he|she|they|we) is browsing the product catalog$")
    public void verifyThatUserIsBrowsingTheProductCatalog() {
        theActorInTheSpotlight().attemptsTo(
                Select.value("az").from(ProductCatalog.SELECT_SORT)
        );
    }

    @And("^(?:he|she|they|we) select product sort by name A to Z$")
    public void selectSortAToZOption() {
        theActorInTheSpotlight().attemptsTo(
                Select.value("az").from(ProductCatalog.SELECT_SORT)
        );
    }

    @And("^(?:he|she|they|we) select product sort by name Z to A$")
    public void selectSortZToAOption() {
        theActorInTheSpotlight().attemptsTo(
                Select.value("za").from(ProductCatalog.SELECT_SORT)
        );
    }

    @And("^(?:he|she|they|we) select product sort by price low to high$")
    public void selectSortLowToHighOption() {
        theActorInTheSpotlight().attemptsTo(
                Select.value("lohi").from(ProductCatalog.SELECT_SORT)
        );
    }
    @And("^(?:he|she|they|we) select product sort by price high to low")
    public void selectSortHighToLowOption() {
        theActorInTheSpotlight().attemptsTo(
                Select.value("hilo").from(ProductCatalog.SELECT_SORT)
        );
    }

    @And("^the products will be sorted")
    public void verifyTheProductsWillBeSorted() {
        theActorInTheSpotlight().attemptsTo(

        );
    }
}

