<?php
	class Example {
		public $val1;
		public function __construct($val){
			$this->val1 = $val;
		}
		public function add($a){
			return ($a + $this->val1);
		}
	}
?>