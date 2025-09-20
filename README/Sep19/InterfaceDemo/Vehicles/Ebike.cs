using InterfaceDemo.Libraries.Interfaces;

namespace InterfaceDemo.Vehicles{

    public class Ebike : Ivehicle {

        private String Name;
        public Ebike(String name){
            this.Name = name;
        }
        public void start(){
            Console.WriteLine(this.Name + " Is Starting");
        }
         public void drive(){
            Console.WriteLine(this.Name + " Is Driving");
        }
         public void stop(){
            Console.WriteLine(this.Name + " Is Stopping");
        }

    
    }
}