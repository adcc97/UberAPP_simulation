<?php
  

       require_once('car.php');
       require_once('uberX.php');
       require_once('account.php');
       require_once('uberPool.php');

       $uberX = new UberX("CVB123", new Account("Andres Herrera", "AND456"),
       "Chevrolet","Spark");
       $uberX->printDataCar();



       $uberPool = new UberPool("NYU456", new Account("Manuel Mendoza", "SDER567"),"Dodge","Attitude");
       $uberPool->printDataCar();

?>
