package avocado.ecommercebackend.image.service;

import avocado.ecommercebackend.image.dto.IImage;
import avocado.ecommercebackend.image.dto.ImageDto;
import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.product.model.Product;

import java.util.List;
import java.util.Optional;

public interface ImageService {

    void addImage(IImage iImage);
    List<Image>getAllImage();
    Optional<Image>getImage(Long id);
    List<ImageDto>getImageByProductById(Long id);
}

