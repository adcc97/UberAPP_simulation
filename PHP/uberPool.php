<?php
require_once('car.php');

Class UberPool extends Car{

    public $brand;
    public $model;

    public function __construct($license, $brand, $model) {
        parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}

?>
