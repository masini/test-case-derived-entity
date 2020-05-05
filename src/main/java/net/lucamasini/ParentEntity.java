package net.lucamasini;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ParentEntity {
    @Id
    String id;

    String name;
}
