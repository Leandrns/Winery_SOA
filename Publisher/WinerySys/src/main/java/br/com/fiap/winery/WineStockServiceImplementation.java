package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "Cabernet Sauvignon:\n" +
                "- Château Lafite Rothschild\n" +
                "- Caymus Cabernet Sauvignon\n" +
                "- Catena Zapata Cabernet Sauvignon\n" +
                "- Penfolds Bin 407 Cabernet Sauvignon\n" +
                "\n" +
                "Merlot:\n" +
                "- Pétrus\n" +
                "- Duckhorn Merlot\n" +
                "- Concha y Toro Marques de Casa Concha Merlot\n" +
                "- Stags' Leap Winery Merlot\n" +
                "\n" +
                "Pinot Noir:\n" +
                "- Domaine de la Romanée-Conti La Tâche\n" +
                "- Meiomi Pinot Noir\n" +
                "- Louis Jadot Pinot Noir\n" +
                "- Cloudline Pinot Noir\n" +
                "\n" +
                "Malbec:\n" +
                "- Catena Zapata Malbec Argentino\n" +
                "- Trapiche Malbec\n" +
                "- Terrazas de los Andes Malbec\n" +
                "- Alamos Malbec\n" +
                "\n" +
                "Syrah (Shiraz):\n" +
                "- Penfolds Grange\n" +
                "- E. Guigal Côte-Rôtie\n" +
                "- Yellow Tail Shiraz\n" +
                "- Torbreck Woodcutter's Shiraz\n" +
                "\n" +
                "Chardonnay:\n" +
                "- Kendall-Jackson Vintner’s Reserve Chardonnay\n" +
                "- Louis Latour Corton-Charlemagne\n" +
                "- La Crema Sonoma Coast Chardonnay\n" +
                "\n" +
                "Sauvignon Blanc:\n" +
                "- Cloudy Bay Sauvignon Blanc\n" +
                "- Kim Crawford Sauvignon Blanc\n" +
                "- Oyster Bay Sauvignon Blanc\n" +
                "\n" +
                "Riesling:\n" +
                "- Dr. Loosen Riesling\n" +
                "- Egon Müller Scharzhofberger Riesling\n" +
                "- Trimbach Riesling";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}
