package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        // Example of polymorphism
        // Writing manually
        // GoogleChrome chrome=new GoogleChrome();
        // chrome.openBrowser();
        // chrome.loadPage("www.google.com");
        // chrome.testThePage();
        // chrome.closeBrowser();

        // FireFox fireFox=new FireFox();
        // fireFox.openBrowser();
        // fireFox.loadPage("www.firefox.com");
        // fireFox.testThePage();
        // fireFox.closeBrowser();

        // Safari safari=new Safari();
        // safari.openBrowser();
        // safari.loadPage("www.safari.com");
        // safari.testThePage();
        // safari.closeBrowser();

        // IE ie=new IE();
        // ie.openBrowser();
        // ie.loadPage("www.IE.com");
        // ie.testThePage();
        // ie.closeBrowser();

        Browser[] browsers={new GoogleChrome(), new FireFox(), new Safari(), new IE()};
        for (Browser b : browsers) {
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }
    }
}
