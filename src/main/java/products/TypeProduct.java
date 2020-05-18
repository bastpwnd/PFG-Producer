package products;

import java.util.Random;

/**
 * Enum with five products
 */
public enum TypeProduct {

    ALIMENTARIO,
    ENTRETENIMIENTO,
    DECORACION,
    DEPORTIVO,
    INFORMATICO;

    /**
     * Method to select random Product
     * @return random typeProduct
     */
    public static TypeProduct getRandomProduct(){
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}




