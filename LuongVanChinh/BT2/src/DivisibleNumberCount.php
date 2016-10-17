<?php
class DivisibleNumberCount
{
    public function count($a,$b)
    {
        $count = 0;
        if($a>$b){
            $m=$a;
            $a=$b;
            $b=$m;
        }
        $i=$a;
        while( $i<=$b) {
            if(( $i%4==0 && $i%3==0 ) || $i%5==0){
                $count ++;
            }
            $i++;
        }
		return $count;
    }
}