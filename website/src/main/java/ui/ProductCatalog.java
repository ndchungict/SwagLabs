package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductCatalog {
    public static Target IMG_SHOPPING_CART = Target.the("Shopping cart")
            .located(By.id("shopping_cart_container"));

    public static Target SELECT_SORT = Target.the("sort select")
            .located(By.className("product_sort_container"));

    public static Target TXT_ITEMS_NAME = Target.the("items name")
            .located(By.className("inventory_item_name"));

    public static Target TXT_ITEMS_PRICE = Target.the("items price")
            .located(By.className("inventory_item_price"));

    public static Target PRODUCT_ITEMS = Target.the("items price")
            .located(By.className("inventory_item"));

    public static Target TXT_ITEMS_PRICE(String productName){
        return Target.the("price text box of "+ productName)
                .located(By.xpath("//[@text='"+productName+"']/..//div"));
    }
}
