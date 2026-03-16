package br.com.fiap.winery;

import javax.xml.namespace.QName;

import br.com.fiap.winery.stubclasses.WineStockService;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        final String wsdl = "http://localhost:8085/WineStockService?wsdl";
        final String TARGET = "http://winery.fiap.com.br/";
        final String NAME = "WineWarningServiceImplementationService";

        URL url = new URL(wsdl);
        QName qName = new QName(TARGET, NAME);
        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);

        String order = wineStockService.placeOrder("Dr. Loosen Riesling", 2);

        System.out.println(order);
    }
}
