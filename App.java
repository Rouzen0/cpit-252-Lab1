/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
//    Product p1 = new Product(6745, 5.50, "Penne Pasta");
//    Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
//    Product p3 = new Product(2106, 4.50, "Linguine Pasta");
//    p3.printTotalQuantity();
        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",
                LocalDate.parse("2022-06-07"));
        ElectricProduct p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        Product[]Product_list={p4,p5};
        for (Product p:Product_list) {
            p.getSellableStatus();
        }
    }
}
