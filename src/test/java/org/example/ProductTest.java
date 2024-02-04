package org.example;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductTest
{
    @Test
    public void shouldCountQuantity()
    {
        Product p1 = new FoodProduct(6745, 5.50, "Penne Pasta",300.33,LocalDate.parse("2024-04-02"));
        Product p2 = new FoodProduct(8853, 6.50, "Spaghetti Pasta",551.6, LocalDate.parse("2024-04-04"));
        Product p3 = new FoodProduct(2106, 4.50, "Linguine Pasta",991 ,LocalDate.parse("2024-04-24"));
        assertEquals(p3.getTotalQuantity(), 3);
    }
}
