<?php
require '../src/Divisiblenumbercount.php';
 
class CountPrimeNumberTests extends PHPUnit_Framework_TestCase
{
    private $calculator;
 
    protected function setUp()
    {
        $this->calculator = new Divisiblenumbercount();
    }
 
    protected function tearDown()
    {
        $this->calculator = NULL;
    }
    // truong hop a>b va trong khoang a,b co so chia het cho 3,5 nhung khong co so nao chia het cho 4
    public function testAdd1()
    {
        $result = $this->calculator->count(15,14);
        $this->assertEquals(1, $result);
    }
    // truong hop a<b va trong khoang a,b co so chia het cho 4 nhung khong co so nao chia het cho 3, 5
    public function testAdd2()
    {
        $result = $this->calculator->count(16,17);
        $this->assertEquals(0, $result);
    }
    // truong hop a<b va trong khoang a,b co so chia het cho ca 3, 4 và 5
    public function testAdd3()
    {
        $result = $this->calculator->count(12,15);
        $this->assertEquals(2, $result);
    }
 
}