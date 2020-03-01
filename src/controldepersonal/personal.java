
package controldepersonal;

//Esta es la clase madre

public class personal {
    public String Nombre;
    public String Apellido;
    public String Cedula;
    public String Direccion;
    public String Zonapostal;
    
    public String RegistrarPersonal (String Nombre, String Apellido, String Cedula,
            String Direccion, String Zonapostal)
//            Metodo de registro
    {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Zonapostal = Zonapostal;

        String h= "Nombre: " +this.Nombre+"\n"+ "Apellido : " +this.Apellido+"\n" 
                + "Cedula: " + this.Cedula +"\n"+ "Direccion: "+this.Direccion+"\n"+ 
                "Zona Postal: " + this.Zonapostal+"\n";
        return h;

    }
}
