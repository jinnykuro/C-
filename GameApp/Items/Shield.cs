using GameApp.Libraries.Abstract;

namespace GameApp.Items{
    public class Shield : GameItem
    {
        public int Defense;

        public Shield (String name, int value) : base (name)
        {
            this.Defense = value;/*property Defensse*/
        }/*Constructor that inherits the GameItem interface*/
        public override void UseItem()
        {
            Console.WriteLine("You equipped "+ this.Name + " your defense increased by "+ this.Defense);/*Implementing UseItem*/
        }
        
        
       
    
    }
}