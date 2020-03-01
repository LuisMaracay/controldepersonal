
package controldepersonal;

public class proveedor extends personal{
    
    public String Productoprincipal;
    public String Productosecundario;
    
    public proveedor ()
{
    super.Nombre=null;
    super.Apellido=null;
    super.Cedula=null;
    super.Direccion=null;
    super.Zonapostal=null;
    this.Productoprincipal=null;
    this.Productosecundario=null;
}
    
    public proveedor (String nombre, String apellido, String cedula, String direccion,
            String zonapostal, String Productoprincipal, String Productosecundario)
    {
 super.Nombre= nombre;
 super.Apellido= apellido;
 super.Cedula= cedula;
 super.Direccion= direccion;
 super.Zonapostal=zonapostal;
 this.Productoprincipal= Productoprincipal;
 this.Productosecundario= Productosecundario;
 
    }
    
    public String RegistrarPersonalProveedor(String nombre, String apellido, String cedula,
         String direccion, String zonapostal, String Productoprincipal, 
         String Productosecundario) 
    {
      this.Productoprincipal=Productoprincipal;
      this.Productosecundario= Productosecundario;
      String h = super.RegistrarPersonal(nombre, apellido, cedula, direccion, 
              zonapostal)+"Producto principal: "+ this.Productoprincipal +"\n" + 
              "Producto secundario: " +this.Productosecundario+"\n";
    return h;

    }
    
    
    
}
