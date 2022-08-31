package projeto.com.springboot.projeto2.model;



@RepositoryRestResource(collectionResourceRel = "clientes",path ="clientes")
public  interface ClinteRepositorio extends JpaRepository<Cliente,Long> {
    
}
