<?php
require '../src/Example.php';
class ExampleTest extends PHPUnit_Framework_TestCase
{
	/**
     * @covers Example::check
     */
    public function testCheck0()
    {
		$valTest = new Example();
		$val = $valTest->check(0);
        $this->assertEquals(1, $val);
    }
	/**
     * @covers Example::check
     */
	public function testCheck10(){
		$valTest = new Example();
		$val = $valTest->check(10);
        $this->assertEquals(1, $val);
	}
	/**
     * @covers Example::check
     */
	public function testCheckMinus1(){
		$valTest = new Example();
		$val = $valTest->check(-1);
        $this->assertEquals(0, $val);
	}
	/**
     * @covers Example::check
     */
	public function testCheck99(){
		$valTest = new Example();
		$val = $valTest->check(99);
        $this->assertEquals(1, $val);
	}
	/**
     * @covers Example::check
     */
	public function testCheckBigInteger(){
		$valTest = new Example();
		$val = $valTest->check(10000000000000000000000000000000000000000000000000000000000000000000000000000);
        $this->assertEquals(0, $val);
	}
}
?>