using InterfaceDemo.Vehicles;
using InterfaceDemo.Libraries.Interfaces;

namespace InterfaceDemo{

    public class Program {
        public static void Main(String[] args){
            
            Ivehicle[] v1 = new Ivehicle[4];

            v1[0] = new Ebike("Ebike");
             v1[1] = new Rakal("Rakal");
             v1[2] = new Scooter("Scooter");
            v1[3] = new Ebike("Ebike Full charge");
         

               for(int i = 0; i < 4; i++){
                v1[i].start();
                v1[i].drive();
                v1[i].stop();
                Console.WriteLine("==================");
               }


        }
    }
}