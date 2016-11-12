using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using MyCalculator;

namespace MyCalculator.Test
{
    [TestClass]
    public class CaltulatorTest
    {
        [TestMethod]
        public void AddSimple()
        {
            var calculator = new Calculator();
            Assert.AreEqual(5, calculator.Add(2, 3));
        }
        [TestMethod]
        public void DivideSimple()
        {
            var calculator = new Calculator();
            Assert.AreEqual(2, calculator.Divide(10, 5));
        }
    }
}
