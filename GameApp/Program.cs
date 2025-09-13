using GameApp.Items;
using GameApp.Libraries.Abstract;

namespace GameApp{
    public class Program{
        public static void Main(String [] args){
        GameItem Item1 = new Shield("[Shield]",20);
        GameItem Item2 = new Potion("[Potion]",10);

            Item1.Showinfo();
            Item1.UseItem();
            Item2.Showinfo();
            Item2.UseItem();
        }
    }
}