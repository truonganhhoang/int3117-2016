<?php
class Sum
{
    public function calculator($a)
    {
    	if(is_int($a)){
    		$sum = 0;
    		for($i=0; $i<=$a; $i++){
    			$sum += $i;
    		}
    		return $sum;
    	}
    	else {
    		return 0;
    	}
    }
}