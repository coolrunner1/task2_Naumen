package ru.iKozlovtsev.tgBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.iKozlovtsev.tgBot.entity.Product;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")

public interface ProductRepository extends JpaRepository<Product, Long>
{
    Product findByName(String name);
}