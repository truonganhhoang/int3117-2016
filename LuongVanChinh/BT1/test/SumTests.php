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
 
    public function testAdd1()
    {
        $result = $this->calculator->calculator(3);
        $this->assertEquals(6, $result);
    }
    public function testAdd2()
    {
        $result = $this->calculator->calculator('string');
        $this->assertEquals(0, $result);
    }
    public function testAdd3()
    {
        $result = $this->calculator->calculator(-2);
        $this->assertEquals(0, $result);
    }
    public function testAdd4()
    {
        $result = $this->calculator->calculator(0);
        $this->assertEquals(0, $result);
    }
    public function testAdd5()
    {
        $result = $this->calculator->calculator(1.5);
        $this->assertEquals(0, $result);
    }
    public function testAdd6()
    {
        $result = $this->calculator->calculator(-1.5);
        $this->assertEquals(0, $result);
    }
    public function testAdd7()
    {
        $result = $this->calculator->calculator(999999999999);
        $this->assertEquals(0, $result);
    }
 
}