<?php
    require_once('account.php');
    class Car{
        public $id = integer;
        public $driver = string;
        public $license = string;
        public $passenger = integer;

        public function __construct($license,$driver){
            $this->license = $license;
            $this->driver = $driver;

        }
        public function printDataCar() {
            echo "Licencia: $this->license Driver: ".$this->driver->name;
        }

        public function getPassenger(){
            return $this->passenger;
        }
    }

?>