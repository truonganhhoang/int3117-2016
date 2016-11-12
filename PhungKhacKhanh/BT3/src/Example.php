<?php
	class Example {
		const num = 100;
		public function check($a){
			try{
				if($a <= self::num){
					if(($a < 10 && $a >= 0) || ($a > 10 && $a < 100)){
						$i = 0;
						while($i <= $a){
							echo $i.'<br>';
							$i++;
						}
						return 1;
					}else{
						throw new Exception("Value must be in [0;10) or [10;100)");
					} 
				}
			}catch(Exception $e) {
			  echo 'Message: ' .$e->getMessage();
			  return 0;
			}
		}
	}
?>