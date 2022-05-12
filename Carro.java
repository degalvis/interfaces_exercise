public abstract class Carro{
    protected String name;
    private boolean bolEncendido;
    private boolean bolPasajero;
  
    public void prender(){
      if(!bolEncendido){
        bolEncendido = true;
        System.out.println(name + " encendido");
  
      }else{
        System.out.println();
      }
    }
  
    public void apagar(){
      if(bolEncendido){
        bolEncendido = false;
        System.out.println(name + " apagado");
  
      }else{
        System.out.println(name + " no está encendido");
      }
    }
  
    public void subirPasajero(){
      bolPasajero = false;
      if(bolEncendido && !bolPasajero){
        bolPasajero = true;
        System.out.println("El pasajero se subió al " + name);
      }else{
        System.out.println("El " + name + " no está encendido o hay un pasajero");
  
      }
    }
  
    public void bajarPasajero(){
      if(bolPasajero){
        bolPasajero = false;
        System.out.println("El pasajero se ha bajado del " + name);
      }else{
        System.out.println("No hay pasajero en el " + name);
  
      }
    }
  
}