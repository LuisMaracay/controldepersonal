
package controldepersonal;


public class decampo extends administrativo{
    public String Representante;
    public String Guardia;
    
    private int diasdetrabajo;
    private int diasdedescanso;
    private double sueldo;
    private double bonoalimentaciondecampo;
    
     public decampo ()
{
    super.Nombre=null;
    super.Apellido=null;
    super.Cedula=null;
    super.Direccion=null;
    super.Zonapostal=null;
    this.Representante=null;
    this.Guardia=null;
    super.Diasdetrabajo=null;
    super.Diasdedescanso=null;
    
    diasdetrabajo=0;
    diasdedescanso=0;
    diasdetrabajo=0;
    sueldo=0;
    bonoalimentaciondecampo=0;

}
    
     public decampo (String nombre, String apellido, String cedula, String 
            direccion, String zonapostal, String representante, 
            String guardia, String diasdetrabajo, String diasdedescanso)
    {
        
 super.Nombre= nombre;
 super.Apellido= apellido;
 super.Cedula= cedula;
 super.Direccion= direccion;
 super.Zonapostal=zonapostal;
 this.Representante= representante;
 this.Guardia= guardia;
 super.Diasdetrabajo=diasdetrabajo;
 super.Diasdedescanso=diasdedescanso;
 
    }
     
     public String RegistrarPersonalDeCampo(String nombre, String apellido, String cedula,
         String direccion, String zonapostal, String representante, 
         String guardia, int diasdetrabajo, int diasdedescanso) 
    {
      this.Representante = representante;
      this.Guardia= guardia;
      String h = super.RegistrarPersonalAdministrativo(nombre, apellido, cedula, direccion, 
              zonapostal, diasdetrabajo, diasdedescanso)+"Representante: "+
              this.Representante +"\n"+ "Guardia: "+this.Guardia +"\n";
    return h;
    }
     
     public double sueldodecampo (int dato1, int dato2)
    {
      diasdetrabajo= dato1;
      diasdedescanso= dato2;
      sueldo = (diasdetrabajo * 100)- (diasdedescanso-50);
      return sueldo;
    }
     
     public double bonoalimentaciondecampo (int dato1, int dato2)
    {
      diasdetrabajo= dato1;
      diasdedescanso = dato2;
      bonoalimentaciondecampo = (diasdetrabajo * 150) + (diasdedescanso*150*(0.04));
      return bonoalimentaciondecampo;
    }
     
}
