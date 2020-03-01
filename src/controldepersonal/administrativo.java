
package controldepersonal;


public class administrativo extends personal {
   
//    Estas son las propiedades de la clase
    public String Diasdetrabajo;
    public String Diasdedescanso;
    
    private int diasdetrabajo;
    private int diasdedescanso;
    private double sueldo;
    private double bonoalimentacionadmin;
    
    public administrativo ()
{
//    Este es el constructor
    super.Nombre=null;
    super.Apellido=null;
    super.Cedula=null;
    super.Direccion=null;
    super.Zonapostal=null;
    this.Diasdetrabajo=null;
    this.Diasdedescanso=null;
    
    diasdetrabajo=0;
    diasdedescanso=0;
    diasdetrabajo=0;
    sueldo=0;
    bonoalimentacionadmin=0;
}
   
    
    public administrativo (String nombre, String apellido, String cedula, String 
            direccion, String zonapostal, int Diasdetrabajo, 
            int Diasdedescanso)
    {
//       Aqui se llama a propiedades de la clase madre. Esto seria la sobrecarga 
 super.Nombre= nombre;
 super.Apellido= apellido;
 super.Cedula= cedula;
 super.Direccion= direccion;
 super.Zonapostal=zonapostal;
 this.diasdetrabajo= Diasdetrabajo;
 this.diasdedescanso= Diasdedescanso;
 
    }
    
    public String RegistrarPersonalAdministrativo(String nombre, String apellido,
            String cedula, String direccion, String zonapostal, int Diasdetrabajo, 
         int Diasdedescanso)
            
//            Este es el metodo de registro
    {
      this.diasdetrabajo= Diasdetrabajo;
      this.diasdedescanso= Diasdedescanso;
      String h = super.RegistrarPersonal(nombre, apellido, cedula, direccion, 
              zonapostal)+"Dias de trabajo: "+ this.diasdetrabajo+"\n"+
              "Dias de descanso: "+ this.diasdedescanso+ "\n";
    return h;

    }
    
    public double sueldoadministrativo (int dato1, int dato2)
    {
//        Este es el metodo de calculo
      diasdetrabajo= dato1;
      diasdedescanso= dato2;
      sueldo = (diasdetrabajo * 75)- (diasdedescanso-30);
      return sueldo;
    }
    public double bonoalimentacionadmin (int dato)
    {
//        metodo de calculo
      diasdetrabajo= dato;
      bonoalimentacionadmin = diasdetrabajo * 150;
      return bonoalimentacionadmin;
    }
    
//    Esta explicacion aplica para las demas subclases
}
