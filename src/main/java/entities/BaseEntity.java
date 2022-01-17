package entities;

import java.io.Serializable;

public interface BaseEntity extends Serializable {
    long getId();
    void setId(long id);
}
