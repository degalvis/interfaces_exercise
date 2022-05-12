import java.util.Scanner;
class Main {

    public static Carro crearVehiculo(){
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        int opcion = 0;
        while(i < 1){
            System.out.println("1.Crear carro particular");
            System.out.println("2.Crear taxi");
            opcion = entrada.nextInt();
            if(opcion == 1 || opcion == 2){
                i++;
            }else{
                i = 0;
            }
        }

        

        if(opcion == 1){
            Carro c1 = new CarroParticular("Carro Particular");
            return c1;
        }else{
            Carro t1 = new TaxiMauricio("Taxi");
            return t1;
        }

    }

  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
        
    Carro carro = crearVehiculo();

    int userNum = 0;
    do{
    System.out.println("Menu");
    System.out.println("\t 3.Prender ");
    System.out.println("\t 4.Apagar ");
    System.out.println("\t 5.Recoger Pasajero");
    System.out.println("\t 6.Dejar Pasajero");
    System.out.println("\t 7.Terminar programa");
    userNum = entrada.nextInt();
    
      switch(userNum){
      case 3:
        carro.prender();
        break;
      case 4:
        carro.apagar();
        break;
      case 5:
        carro.subirPasajero();
        break;
      case 6:
        carro.bajarPasajero();
        break;
    }
  }while(userNum != 7);
    
  }
}