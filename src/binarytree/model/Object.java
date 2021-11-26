package binarytree.model;

import java.util.Objects;

public class Object extends TreeObject<Object> {

    Integer value;

    public Object(Integer value){
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Object obj = (Object) object;
        return Objects.equals(value, obj.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public int compareTo(Object objectToCompare) {
        int i = 0;

        if(this.value > objectToCompare.value){
            i = 1;
        }else if(this.value < objectToCompare.value){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
