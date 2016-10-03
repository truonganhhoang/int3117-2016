using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace BaiTapKiemThu
{

    public class LeapYear
    {
        /// <summary>
        /// Kiểm tra 1 số có phải năm nhuận không
        /// </summary>
        /// <param name="y"> Số năm</param>
        /// <returns>
        /// true nếu là năm nhuận
        /// false nếu không phải
        /// </returns>
        public bool IsLeapYear(int y)
        {
            if (y <= 0 || y > 9999)
            {
                throw new ArgumentOutOfRangeException();
            }
            else
            {
                if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }

        /// <summary>
        /// Tìm các năm nhuận trong khoảng giữa 2 mốc năm
        /// </summary>
        /// <param name="firstYear"> Năm đầu tiên</param>
        /// <param name="lastYear"> Năm cuối cùng</param>
        /// <returns>
        /// List<int> các năm nhuận trong khoảng [a,b]
        /// </returns>
        public List<int> ListLeapYear(int firstYear, int lastYear)
        {
            List<int> year = new List<int>();
            for (int i = firstYear; i <= lastYear; i++)
            {
                if (IsLeapYear(i))
                {
                    year.Add(i);
                }
            }
            return year;
        }
    }
}
