package avocado.ecommercebackend.image.dto;


import lombok.Data;

@Data
public class IImage {


    private String imageUrl;
    private Long productId;

    public IImage(String imageUrl, Long productId) {
        this.imageUrl = imageUrl;
        this.productId = productId;
    }
}
