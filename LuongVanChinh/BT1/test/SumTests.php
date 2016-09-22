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
    // String
    public function testAdd2()
    {
        $result = $this->calculator->calculator('string');
        $this->assertEquals(0, $result);
    }
    // So nguyen am
    public function testAdd3()
    {
        $result = $this->calculator->calculator(-2);
        $this->assertEquals(0, $result);
    }
    // Bien Min
    public function testAdd4()
    {
        $result = $this->calculator->calculator(0);
        $this->assertEquals(0, $result);
    }
    // So thap phan
    public function testAdd5()
    {
        $result = $this->calculator->calculator(1.5);
        $this->assertEquals(0, $result);
    }
    // Bien max 
    public function testAdd7()
    {
        $result = $this->calculator->calculator(2147483647);
        $this->assertEquals(0, $result);
    }
    // Ngoai bien max 
    public function testAdd8()
    {
        $result = $this->calculator->calculator(2147483648);
        $this->assertEquals(0, $result);
    }
 
}