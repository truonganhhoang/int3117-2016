<?php
require '../src/Sum.php';
 
class SumTests extends PHPUnit_Framework_TestCase
{
    private $calculator;
 
    protected function setUp()
    {
        $this->calculator = new Sum();
    }
 
    protected function tearDown()
    {
        $this->calculator = NULL;
    }
    // Mot so bat ky
    public function testAdd1()
    {
        $result = $this->calculator->calculator(3);
        $this->assertEquals(6, $result);
    }
    // So nguyen am (duoi gia tri cuc tieu)
    public function testAdd3()
    {
        $result = $this->calculator->calculator(-1);
        $this->assertEquals(0, $result);
    }
    // Bien Min
    public function testAdd4()
    {
        $result = $this->calculator->calculator(0);
        $this->assertEquals(0, $result);
    }
    // Can tren bien Min
    public function testAdd5()
    {
        $result = $this->calculator->calculator(1);
        $this->assertEquals(1, $result);
    }
    // So thap phan
    public function testAdd6()
    {
        $result = $this->calculator->calculator(1.5);
        $this->assertEquals(0, $result);
    }
    //Gia tri cuc dai
    public function testAdd7()
    {
        $result = $this->calculator->calculator(2147483647);
        $this->assertEquals(2305843007133300000, $result);
    }
    //Ngoai gia tri cuc dai
    public function testAdd8()
    {
        $result = $this->calculator->calculator(2147483648);
        $this->assertEquals(0, $result);
    }
 
}