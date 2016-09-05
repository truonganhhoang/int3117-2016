<?php
require '../src/autoload.php';
class ExampleTest extends PHPUnit_Framework_TestCase
{
	 /**
	 * @covers            \money\src\Example::__construct
     * @uses              \money\src\Example
     */
    public function testOne()
    {
         //$this->assertEquals(2, $valTest->add(1));
    }
}
?>