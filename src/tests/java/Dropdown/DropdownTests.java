package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

public class DropdownTests extends BaseTests {
    @Test
    public void testDropdown(){
        var dropdown = homePage.clickDropdownButton();
        dropdown.leftClick();
    }
}
