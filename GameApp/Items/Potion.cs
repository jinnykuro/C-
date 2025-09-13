using GameApp.Libraries.Abstract;

namespace GameApp.Items{
    public class Potion : GameItem
    {
        
        public int HealAmount;

        public Potion (String name, int value) : base (name)
        {
            this.HealAmount = value;
        }
        public override void UseItem()
        {
            Console.WriteLine("You equipped "+ this.Name + " Restored Health "+ this.HealAmount + "HP!");
        }  
    }
}