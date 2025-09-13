using GameApp.Libraries.Interface;

namespace GameApp.Libraries.Abstract{

    public abstract class GameItem : IGameItem
    {
        public String Name;

        public GameItem(String name)
        {
            this.Name = name;
        }
        public void Showinfo()
        {
            Console.WriteLine("Item: "+ this.Name);
        }
        public abstract void UseItem();
    }
}
