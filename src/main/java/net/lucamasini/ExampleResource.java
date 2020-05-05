package net.lucamasini;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String hello() {

        DerivedEntity derivedEntity = DerivedEntity.builder().name("derived")
                .parent(ParentEntity.builder().id("bar-158").name("barrone").build())
                .build();

        em.merge(derivedEntity);

        return "hello";
    }
}