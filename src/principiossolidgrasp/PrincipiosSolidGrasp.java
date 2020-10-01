/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principiossolidgrasp;

import com.Dao.UsuarioDao;
import com.Dao.VehiculoDao;
import com.Dto.Chevrolet;
import com.Dto.Gato;
import com.Dto.Perro;
import com.Dto.Pinguino;
import com.Dto.Renault;
import com.Dto.UsuarioDto;
import com.Dto.Vehiculo;

/**
 *
 * @author stive
 * Para el ejemplo de los principios Grasp, podemos simular que esta clase Main es nuestro controlador ya que el el encargado
 * realizar las instacias y hacer los llamados a los respectivos metodos.
 */
public class PrincipiosSolidGrasp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Clase responsable del manejo de los atributos
        UsuarioDto usuarioDto= new UsuarioDto();   // Ejemplo principio Creador Grasp  
        usuarioDto.setId("12345");
        usuarioDto.setNombres("Andres Felipe");
        usuarioDto.setApellidos("Perez Perez");
        usuarioDto.setCorreo("correo@gmail.com");
        usuarioDto.setTelefono("313331331");
        
        // Clase responsable de los accesos a la base de datos
        System.out.println("Principio responsabilidad absoluta, Inversión de dependencias, +Bajo aclopamiento /alta cohesion-GRASP+ inicio");
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.crearUsuario(usuarioDto);
        System.out.println("Principio responsabilidad absoluta Inversión de dependencias +Bajo aclopamiento /alta cohesion-GRASP+ fin");
        System.out.println("*************************************");
        
        //principio abierto/ cerrado, asi podemos obtener el precio de cada vehiculo pero meedio de una clase abstracta
        System.out.println("Principio Abierto/Cerrado y principio de substitución inicio");
        VehiculoDao vehiculoDao = new VehiculoDao();
        Vehiculo[] arrayVehiculo= {new Renault(),
                                  new Chevrolet()};
        vehiculoDao.verPreciosVehiculos(arrayVehiculo);
        System.out.println("Principio Abierto/Cerrado y principio de substitución inicio");
        System.out.println("*************************************");
        
        //se hace la instancia de la clase Pinguino
        System.out.println("Principio de segregación de interfaz inicio");
        Pinguino pinguino= new Pinguino();
        pinguino.comer();
        pinguino.nadar();
        System.out.println("Principio de segregación de interfaz fin");
        System.out.println("***************************************");
        
        //Ejemplo polimorfismo
        System.out.println("Inicio polimorfismo");
        Perro perro = new Perro();
        Gato gato = new Gato();
        perro.hacerSonido();
        gato.hacerSonido();
        System.out.println("Fin polimorfismo");
        System.out.println("**************************");
    }
    
}
