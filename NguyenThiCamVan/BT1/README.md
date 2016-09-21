# Báo cáo tuần 2  

## Function cần test:  
* Mô tả: Tính ước chung lớn nhất của 2 số nguyên kiểu integer  
VD: GCD(2,3) = 1, GCD(0,999) = 999, ...   
* Code:  
```java
public int greatestCommonDivisor(int num1, int num2) {
    num1 = Math.abs(num1);
    num2 = Math.abs(num2);
    while (num1 != num2) {
      if (num1 == 0 || num2 == 0) {
        return (num1 + num2);
      }
      if (num1 == 1 || num2 == 1) {
        return 1;
      }
      if (num1 > num2) {
        num1 = num1 - num2;
      } else {
        num2 = num2 - num1;
      }
    }
    return num1;
  }
  ```  
  
## Phương pháp kiểm thử:    
* Phương pháp được lựa chọn: **Kiểm thử lớp tương đương**  
* Lý do lựa chọn: Hàm GCD có nhiều trường hợp đặc biệt cho 2 biến đầu vào, lựa chọn phương pháp này để đảm bảo bao phủ được hết các trường hợp test.  

## Kết quả kiểm thử:  
![Test result](https://github.com/trieudh58/int3117-2016/blob/master/NguyenThiCamVan/BT1/test_result/TestResult1.PNG)  

Các ca kiểm thử được thiết kế:  
* \#1: Pass  
```java
@Test
  public void testGCDWithOneZeroNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(0, 20), 20);
    Assert.assertEquals(gcd.greatestCommonDivisor(20, 0), 20);
  }
  ```   
  
* \#2: Pass   
```java  
  @Test
  public void testGCDWithMaxIntNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.MAX_VALUE, 85), 1);
    Assert.assertEquals(gcd.greatestCommonDivisor(85, Integer.MAX_VALUE), 1);
  }
  ```  
  
* \#3: Pass 
```java    
  @Test
  public void testGCDWithMaxNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(Integer.MAX_VALUE-1, 4563), 9);
    Assert.assertEquals(gcd.greatestCommonDivisor(4563, Integer.MAX_VALUE-1), 9);
  }
  ```  
  
* \#4: Pass  
```java 
  @Test
  public void testGCDWithNegativeNumber() {
    GreatestCommonDivisor gcd = new GreatestCommonDivisor();
    Assert.assertEquals(gcd.greatestCommonDivisor(-999999999, 456), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(456, -999999999), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(-999999999, -456), 3);
    Assert.assertEquals(gcd.greatestCommonDivisor(-456, -999999999), 3);
  } 
  ```
  
  
  
# Báo cáo tuần 1
## TestNG-SoftwareTesting
#### TestNG is a testing framework designed to simplify a broad range of testing needs, from unit testing to integration testing.  
This is simple Java project using TestNG as an unit testing framework.  
# Getting Started
### Prerequisities
Java SDK 1.7  
Maven  
Eclipse IDE  
TestNG Plugin  

### Installing
1. Clone this project to your computer and import to Eclipse IDE as Maven project. In this project, I've been using Eclipse IDE for programming. Instead of using it, you can use any IDE that's familiar with you. Make sure that your Java SDK version what you complie the project is suitable with Java SDK version in pom.xml file. You can change this if you want. 

2. You have to install TestNG Plugin to Elcipse IDE. TestNG can be installed in Eclipse by using Marketplace. Below are the steps:  
Open eclipse  
Go to Help -> Eclipse Marketplace...  
Do search for TestNG (Type the text TestNG in Find text box > Click Go button)  
After searching: Click Install button at TestNG for Eclipse area
Restart Eclipse and select the menu Window / Show View / Other...  and you should see the TestNG view listed in the Java category.  

### Running the tests
Class GreatestCommonDivisorTest.java is a simple test file. You can write more test function there.  
To run test, Right click / Run As / TestNg Test  
So you can see the test result in console.  
