package ait.cochort49.shop.homeworkshop.controler;



import ait.cochort49.shop.homeworkshop.model.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;



// http://localhost:8080/products

// /login - фронт endpoint
// /api/login
// /api/products

@RestController
@RequestMapping("/products")
public class ProductController {


    // Create: POST -> /products/?title=rr&price=564
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        // Todo обращаемся к сервису для сохранения продукта
        return product;
    }

    // Получение ресурса
    // GET /products/5
    // GET /products/1565
    // GET /products/55
    @GetMapping("/{productId}")
    public Product getById(@PathVariable("productId") Long id) {
        // Todo обращаемся к сервисе и запрашиваем продукт по id
        return null;
    }

    // get:  GET /products
    @GetMapping
    public List<Product> getAll() {
        // Todo обращаемся к сервису, получаем все продукты
        return List.of();
    }

    //products?id=3
//    @GetMapping
//    public Product getById(@RequestParam Long id) {
//        // Todo обращаемся к сервисе и запрашиваем продукт по id
//        return null;
//    }

    // Update: PUT -> /products
    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody Product product){
        //Todo К сервису для обновления продукты
        return product;
    }

    // Delete: DELETE -> /products/id
    @DeleteMapping("/{id}")
    public Product remove(@PathVariable Long id) {
        // Todo сервис -> удаление продукта
        return null;
    }

}
