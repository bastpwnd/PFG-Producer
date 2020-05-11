package products;

import java.util.Random;

public enum TypeProduct {

    ALIMENTARIO,
    ENTRETENIMIENTO,
    DECORACION,
    DEPORTIVO,
    INFORMATICO;

    public static TypeProduct getRandomProduct(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}




