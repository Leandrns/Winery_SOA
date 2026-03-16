package br.com.fiap.winery;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {
        final String WSDL = "";
        final String TARGET = "";
        final String NAME = "";

        URL url = new URL(WSDL);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);

        String menu = wineStockService.getMenu(WineStockService.class);

        System.out.println(wineStockService.showResult(menu));

    }
}
