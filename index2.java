//repository
package co.edo.unab.catydog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edo.unab.catydog.model.ProductoModel;

@Repository
public interface ProductoRepository  extends CrudRepository <ProductoModel,Integer>{
    
}
