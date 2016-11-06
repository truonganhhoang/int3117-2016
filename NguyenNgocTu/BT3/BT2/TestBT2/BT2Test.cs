using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using BT2;

namespace TestBT2
{
    [TestClass]
    public class BT2Test
    {
        [TestMethod]
        public void ValidateTestC1TC2TC3T_1()
        {
            String password = "ABCDEFGH1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2TC3F_1()
        {
            String password = "ABC1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_1()
        {
            String password = "ABC";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_12()
        {
            String password = "ABCDEFGHI";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2TC3T_2()
        {
            String password = "abcdefgh1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2TC3F_2()
        {
            String password = "abc1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_2()
        {
            String password = "abc";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_22()
        {
            String password = "abcdefghi";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2TC3T_3()
        {
            String password = "AbCdEFGH1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsTrue(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2TC3F_3()
        {
            String password = "AbC1";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_3()
        {
            String password = "AbC";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1TC2FC3F_32()
        {
            String password = "AbCdEfghi";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1FC2TC3F_1()
        {
            String password = "12345678";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1FC2FC3F_1()
        {
            String password = "@@@";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

        [TestMethod]
        public void ValidateTestC1FC2FC3F_2()
        {
            String password = "@@@@@@@@@@@@@@@@";
            bool result = Validate.ValidatePassword(password);
            Assert.IsFalse(result);
        }

    }
}
