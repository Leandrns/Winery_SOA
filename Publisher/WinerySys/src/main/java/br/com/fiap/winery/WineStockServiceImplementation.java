package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "Cabernet Sauvignon:\n" +
                "\n" +
                "Château Lafite Rothschild\n" +
                "\n" +
                "Caymus Cabernet Sauvignon\n" +
                "\n" +
                "Catena Zapata Cabernet Sauvignon\n" +
                "\n" +
                "Penfolds Bin 407 Cabernet Sauvignon\n" +
                "\n" +
                "Merlot:\n" +
                "\n" +
                "Pétrus\n" +
                "\n" +
                "Duckhorn Merlot\n" +
                "\n" +
                "Concha y Toro Marques de Casa Concha Merlot\n" +
                "\n" +
                "Stags' Leap Winery Merlot\n" +
                "\n" +
                "Pinot Noir:\n" +
                "\n" +
                "Domaine de la Romanée-Conti La Tâche\n" +
                "\n" +
                "Meiomi Pinot Noir\n" +
                "\n" +
                "Louis Jadot Pinot Noir\n" +
                "\n" +
                "Cloudline Pinot Noir\n" +
                "\n" +
                "Malbec:\n" +
                "\n" +
                "Catena Zapata Malbec Argentino\n" +
                "\n" +
                "Trapiche Malbec\n" +
                "\n" +
                "Terrazas de los Andes Malbec\n" +
                "\n" +
                "Alamos Malbec\n" +
                "\n" +
                "Syrah (Shiraz):\n" +
                "\n" +
                "Penfolds Grange\n" +
                "\n" +
                "E. Guigal Côte-Rôtie\n" +
                "\n" +
                "Yellow Tail Shiraz\n" +
                "\n" +
                "Torbreck Woodcutter's Shiraz\n" +
                "\n" +
                "Chardonnay:\n" +
                "\n" +
                "Kendall-Jackson Vintner’s Reserve Chardonnay\n" +
                "\n" +
                "Louis Latour Corton-Charlemagne\n" +
                "\n" +
                "La Crema Sonoma Coast Chardonnay\n" +
                "\n" +
                "Sauvignon Blanc:\n" +
                "\n" +
                "Cloudy Bay Sauvignon Blanc\n" +
                "\n" +
                "Kim Crawford Sauvignon Blanc\n" +
                "\n" +
                "Oyster Bay Sauvignon Blanc\n" +
                "\n" +
                "Riesling:\n" +
                "\n" +
                "Dr. Loosen Riesling\n" +
                "\n" +
                "Egon Müller Scharzhofberger Riesling\n" +
                "\n" +
                "Trimbach Riesling";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
