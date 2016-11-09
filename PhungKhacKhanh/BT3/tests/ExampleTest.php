<?php
require '../src/Example.php';
class ExampleTest extends PHPUnit_Framework_TestCase
{
	/**
     * @covers Example::check
     */
    public function testCheck5()
    {
		$valTest = new Example();
		$val = $valTest->check(5);
        $this->assertEquals(1, $val);
    }
	/**
     * @covers Example::check
     */
	public function testCheck10(){
		$valTest = new Example();
		$val = $valTest->check(10);
        $this->assertEquals(0, $val);
	}
	
	/**
     * @covers Example::check
     */
	public function testCheck1000(){
		$valTest = new Example();
		$val = $valTest->check(1000);
        $this->assertEquals(0, $val);
	}
}
?>