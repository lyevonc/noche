package org.noche.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by Timi on 1/14/2017.
 */
@MappedSuperclass
public abstract class LiteAbstractEntity implements Serializable {

    /* --- Static members --- */

    private static final long serialVersionUID = 8788822574446121600L;

    /* --- Members --- */

    @Id
    @GeneratedValue
    private Integer id;

    /* --- Public methods --- */

    public boolean isPersisted() {
        return getId() != null;
    }

    /* --- Overridden methods --- */

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(id)
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }

        LiteAbstractEntity rhs = (LiteAbstractEntity) obj;
        return new EqualsBuilder().append(id, rhs.id).isEquals();
    }

    /* --- Getters/Setters --- */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
