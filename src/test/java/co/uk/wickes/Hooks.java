package co.uk.wickes;

import co.uk.wickes.propertyreader.PropertyReader;
import co.uk.wickes.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Utility {

    @Before
public void setUp() {
    selectBrowser(PropertyReader.getInstance().getProperty("browser"));
}

    @After
    public void tearDown() {
        closeBrowser();
    }

}
