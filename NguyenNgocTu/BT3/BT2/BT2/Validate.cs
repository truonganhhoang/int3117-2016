using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BT2
{
    public class Validate
    {
        public static bool ValidatePassword(string password)
        {
            bool flag1 = false, flag2 = false;
            int i = 0;

            while(i < password.Length)
            {
                if((password[i] >= 'A' && password[i] <= 'Z') || (password[i] >='a' && password[i] <= 'z'))
                {
                    flag1 = true;
                }
                else if(password[i] >= '0' && password[i] <= '9')
                {
                    flag2 = true;
                }
                i++;
            }

            if (flag1 && flag2 && password.Length>8)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
