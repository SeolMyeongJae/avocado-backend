package avocado.ecommercebackend.wish.service;

import avocado.ecommercebackend.wish.model.Wish;

import java.util.Optional;

public interface WishService {
    Optional<Wish> getWish(Long id);
    Wish addWish(Wish wish);

}
