package net.lucamasini;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DerivedEntity implements Serializable {

    @Id
    String id;

    @MapsId
    @OneToOne
    ParentEntity parent;

    String name;
}


