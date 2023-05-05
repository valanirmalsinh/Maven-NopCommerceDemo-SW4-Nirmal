package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomeToOurStorePage extends Utility {
    By welcomeToOurStore =By.xpath("//h2[normalize-space()='Welcome to our store']");

    public By welcomeToOurStoreElement(){
        return welcomeToOurStore;
    }
}
