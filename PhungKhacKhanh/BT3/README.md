Họ tên: Phùng Khắc Khánh
Mã sv: 13020228
Lớp: K58-CB

##BT2:
Bài toán kiểm tra số nhập vào có lớn hơn 0 hoặc nhỏ hơn 10 không.
Nếu đúng thì in ra dãy từ 0 tới số đó, không thì in ra lỗi "Value must be in [0;10) or [10;100)".

Bài toán dùng phương pháp kiểm thử biên, "Line coverage total" là 100%, "Coverage function and method" là 100%, "Classes and Traits" là 100%

##BT3:
All-DU-Path

<?php
	class Example {
		const num = 100;
	1	public function check($a){
	2		try{
	3			if($a <= self::num){
	4				if(($a < 10 && $a >= 0) || ($a > 10 && $a < 100)){
	5					$i = 0;
	6					while($i <= $a){
	7						echo $i.'<br>';
	8						$i++;
	9					}
	14					return 1;
	10				}else{
	11					throw new Exception("Value must be in [0;10) or [10;100)");
					} 
	12			}
	13		}catch(Exception $e) {
			  echo 'Message: ' .$e->getMessage();
	14		  return 0;
			}
		}
	}
?>

Đường đi cho biến a: 
	Đường đi		Ca kiểm thử		KQ mong đợi
	1-2-3-4-5-6		a = 5			1
	1-2-3			a = 1000		0
	1-2-3-4			a = 10			0

Test case:

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