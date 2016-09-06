using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using BaiTapKiemThu;
using System.Collections.Generic;

namespace UnitTest
{
    [TestClass]
    public class LeapYearTest
    {
        [TestMethod]
        public void isLeapYearTestTrue()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(4);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void isLeapYearTestFalse()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(5);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void isLeapYearTestSkipTrue()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(400);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void isLeapYearTestSkipFalse()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(100);
            Assert.IsFalse(result);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void isLeapYearTestZeroYear()
        {
            LeapYear target = new LeapYear();
            target.IsLeapYear(0);
        }

        [TestMethod]
        public void ListLeapYearTest()
        {
            LeapYear target = new LeapYear();
            var expected = new List<int>();
            expected.Add(2000);
            expected.Add(2004);
            expected.Add(2008);
            expected.Add(2012);

            var actual = target.ListLeapYear(2000, 2015);
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void ListLeapYearTestOutOfRange()
        {
            LeapYear target = new LeapYear();
            target.ListLeapYear(0, 2015);
        }

    }
}
