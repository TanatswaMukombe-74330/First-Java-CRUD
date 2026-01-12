package edu.pl.vistula.firstrestapispring.product.support;

import edu.pl.vistula.firstrestapispring.product.api.request.ProductRequest;
import edu.pl.vistula.firstrestapispring.product.api.request.UpdateProductRequest;
import edu.pl.vistula.firstrestapispring.product.api.response.ProductResponse;
import edu.pl.vistula.firstrestapispring.product.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toProduct(ProductRequest productRequest) {

        return new Product(productRequest.getName());

    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }


    public ProductResponse toProductResponse(Product product) {

        return new ProductResponse(product.getId(), product.getName());
    }

}

