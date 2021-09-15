package org.example;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.FIREFOX_45);
        HtmlPage page = webClient.getPage("https://www.google.sk/");
        String pageConten = page.asText();
        System.out.println(pageConten);

    }
}
