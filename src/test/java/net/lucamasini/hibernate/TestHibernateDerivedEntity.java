package net.lucamasini.hibernate;

import net.lucamasini.DerivedEntity;
import net.lucamasini.ParentEntity;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestHibernateDerivedEntity {

    @Test
    public void bootstrapAndTest() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "CRM" );
        final EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        final ParentEntity parentEntity = ParentEntity.builder().id("bar-158").name("barrone").build();
        DerivedEntity derivedEntity = DerivedEntity.builder().name("derived")
                .parent(parentEntity)
                .build();

        em.persist(parentEntity);
        em.merge(derivedEntity);
        em.getTransaction().commit();


    }
}
