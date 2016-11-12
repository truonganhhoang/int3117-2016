<?php
	class Example {
		//public $val1;
		public function __construct(){
			//$this->val1 = $val;
		}
		public function check($a){
			try{
				if($a < 10 && $a >= 0){
					for($i = 0; $i <= $a; $i++){
						echo $i .'<br>';
					}
					return 1;
				}else{
					throw new Exception("Value must be less than 10 and more than 0");
					return 0;
				} 
			}catch(Exception $e) {
			  echo 'Message: ' .$e->getMessage();
			}
		}
	}
?>