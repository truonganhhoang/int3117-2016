using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BT2
{
    class Program
    {
        static void Main(string[] args)
        {
            if (Validate.ValidatePassword("helloworld123@"))
            {
                Console.WriteLine("true");
            }
            else Console.WriteLine("false");
            Console.ReadKey();
        }
    }
}
