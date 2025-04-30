package Map.HashMap;

import java.util.Objects;

public class person {

    String name;
    Integer age;

    public person(String name, Integer age){
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this  == obj) return true;
        if(!(obj instanceof person))return false;
        person p = (person) obj;
        return this.name.equals(p.name) && this.age == p.age;
    }
}
