package springAngularApp.system.domain.model;

import java.util.Objects;
import java.util.function.Function;

public class IdNameCommand {

    private String id;
    private String name;

    public IdNameCommand() {
    }

    public <T> IdNameCommand(T object, Function<T, String> idMapper, Function<T, String> nameMapper) {
        this.id = idMapper.apply(object);
        this.name = nameMapper.apply(object);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdNameCommand that = (IdNameCommand) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
