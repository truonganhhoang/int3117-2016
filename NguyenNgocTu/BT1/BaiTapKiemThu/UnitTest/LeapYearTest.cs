using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using BaiTapKiemThu;
using System.Collections.Generic;

namespace UnitTest
{
    [TestClass]
    public class LeapYearTest
    {
        //Weak normal ECT test IsLeapYear method
        [TestMethod]
        public void isLeapYearTestEvenlyDeviedBy4AndNotDeviedBy100()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(2016);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void isLeapYearTestEvenlyDeviedBy100ButNotDeviedBy400()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(2200);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void isLeapYearTestEvenlyDeviedBy400()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(2000);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void isLeapYearTestEvenlyNotDeviedBy4()
        {
            LeapYear target = new LeapYear();
            bool result = target.IsLeapYear(2017);
            Assert.IsFalse(result);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void isLeapYearTestInvalidInput()
        {
            LeapYear target = new LeapYear();
            target.IsLeapYear(-42);
        }

        //Weak normal ECT test ListLeapYear method
        [TestMethod]
        public void ListLeapYearValidInput()
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
        public void ListLeapYearALessThanB()
        {
            LeapYear target = new LeapYear();
            var expected = new List<int>();
            var actual = target.ListLeapYear(2015, 2000);
            CollectionAssert.AreEqual(expected, actual);
        }

        [TestMethod]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void ListLeapYearTestInvalid()
        {
            LeapYear target = new LeapYear();
            target.ListLeapYear(0, 2015);
        }

    }
}
