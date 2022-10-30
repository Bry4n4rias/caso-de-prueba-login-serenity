package starter.checkout;

import org.openqa.selenium.By;

public class CheckoutProcessObjects {

    public static By PRODUCT_CHOOSED = By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[1]/div/a[1]/img");

    public static  By ADD_TO_CART_BUTTON = By.xpath("//*[@id=\"add_to_cart\"]/button");

    public static By PROCCED_TO_CHECKOUT_BUTTON1 = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");

    public static By PROCCED_TO_CHECKOUT_BUTTON2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");

    public static By PROCCED_TO_CHECKOUT_BUTTON3 = By.xpath("//*[@id=\"center_column\"]/form/p/button");

    public static By TERMS_OF_SERVICE_BUTTON4 = By.xpath("//*[@id=\"cgv\"]");

    public static By PROCCED_TO_CHECKOUT_BUTTON4 = By.xpath("//*[@id=\"form\"]/p/button");

    public static By PAY_BY_BANK_WIRE = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p");

    public static By CONFIRM_ORDER_BUTTON = By.xpath("//*[@id=\"cart_navigation\"]/button");


}
