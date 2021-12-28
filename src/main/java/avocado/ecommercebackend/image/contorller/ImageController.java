package avocado.ecommercebackend.image.contorller;

import avocado.ecommercebackend.image.dto.IImage;
import avocado.ecommercebackend.image.model.Image;
import avocado.ecommercebackend.image.service.ImageService;
import avocado.ecommercebackend.product.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @PostMapping("/add")
    public Image add(@RequestBody IImage iImage){
        return imageService.addImage(iImage);
    }
    @GetMapping("/getall")
    public List<Image>getAllImage(){
        return imageService.getAllImage();
    }
    @GetMapping("/get/{id}")
    public Image get(@PathVariable Long id){
        return imageService.getImage(id).get();
    }
    @GetMapping("/getCategoryByProductById/{id}")
    public List<Product> getCategoryByProductById(@PathVariable Long id){
        return imageService.getCategoryByProductById(id);
    }
}
