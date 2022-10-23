package so.dang.cool.multicaster.shapes;

import java.util.Optional;

public interface Shape {
    double area();

    double perimeter();

    /**
     * It would be nice to be able to just have this:
     * <pre>
     * {@code
     * default <T> Optional<T> to() {
     *     if (this instanceof T t) return Optional.of(t);
     *     return Optional.empty;
     * }
     * }
     * </pre>
     * However it's not possible. Generic types are only a compiler feature,
     * not a feature of the virtual machine. They get erased during compilation
     * and are not available during runtime (when the function is executed).
     */
    default <T> Optional<T> to(Class<T> clazz) {
        return Optional.of(this).filter(clazz::isInstance).map(clazz::cast);
    }
}
