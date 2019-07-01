package nz.net.citnz.yourproject.ui.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {

    @FindBy(css = "input[title=Search]")
    public WebElementFacade googleSearchField;

}