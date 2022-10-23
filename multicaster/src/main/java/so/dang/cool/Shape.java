package so.dang.cool;

import java.util.Optional;

public interface Shape {
    double area();

    double perimeter();

    default <T> Optional<T> to(Class<T> clazz) {
        return Optional.of(this).filter(clazz::isInstance).map(clazz::cast);
    }
}
