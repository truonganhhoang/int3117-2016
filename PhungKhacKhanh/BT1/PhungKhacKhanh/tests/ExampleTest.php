<?php
require '../src/Example.php';
class ExampleTest extends PHPUnit_Framework_TestCase
{
	 /**
	 * @covers            \money\src\Example::__construct
     * @uses              \money\src\Example
     */
    public function testOne()
    {
		$valTest = new Example();
		$val = $valTest->check(0);
        $this->assertEquals(1, $val);
    }
	
	public function testTwo(){
		$valTest = new Example();
		$val = $valTest->check(10);
        $this->assertEquals(0, $val);
	}
	
	public function testThree(){
		$valTest = new Example();
		$val = $valTest->check(-1);
        $this->assertEquals(0, $val);
	}
	
	public function testFour(){
		$valTest = new Example();
		$val = $valTest->check(10000000000000000000000000000000000000000000000000000000000000000000000000000);
        $this->assertEquals(0, $val);
	}
}
?>