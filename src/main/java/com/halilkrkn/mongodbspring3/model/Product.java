package com.halilkrkn.mongodbspring3.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Document // MongoDb için gerekli
public class Product {

    @Id // MongoDb için gerekli
    private String id;
    private String name;
    private String description;
    private Double price;

    // Product collaction(table) içindeki tags alanında bir sütuna sahip.
    // Bu alan bir liste.
    // Bu liste içindeki elemanlar String.
    private List<String> tags;

    // Burada ne yapılıyor?
    // Product'ın bir kategorisi var. Bu kategori de bir Category nesnesi.
    // Bu Category nesnesi de MongoDb'de bir collection(table).
    // Bu collection'ın adı da category.
    // Bu collection'ın içindeki bir Category nesnesinin id'si ile Product nesnesinin category'si eşleştiriliyor.
    // Bu işlem için @DBRef kullanılıyor.
    @DBRef
    private Category category;


}
