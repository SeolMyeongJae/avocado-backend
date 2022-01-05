package avocado.ecommercebackend.wish.service;

import avocado.ecommercebackend.wish.model.Wish;
import avocado.ecommercebackend.wish.repository.WishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class WishServiceImpl implements WishService{

    private final WishRepository wishRepository;

    @Override
    public Wish addWish(Wish wish) {
        return wishRepository.save(wish);
    }

    @Override
    public Optional<Wish> getWish(Long id) {
        return Optional.ofNullable(wishRepository.findById(id)).get();
    }
}
