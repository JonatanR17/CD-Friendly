//-Creación de la clase DAO o Modelo:        
     
package co.edo.unab.catydog.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor 
@AllArgsConstructor
@Getter
@Setter
@Table(name="producto")
public class ProductoModel {
    private int idproducto;
    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;
    
}