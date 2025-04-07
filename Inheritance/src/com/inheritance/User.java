package com.inheritance;

public class User {
    public void use(Browser browser) {
        browser.name();
        browser.speed();
        browser.security();
        browser.extensions();
        browser.platform();

        if (browser instanceof Chrome) {
            Chrome chrome = (Chrome) browser;
            chrome.devTools();
        }
    }
}
