from car import Car
from account import Account
from uberX import UberX
from User import User


if __name__ == "__main__":
    print("Hola mundo")
    
    car = Car("AMS234", Account("Manuel Pérez", "ASDF123", "mape@outlook.com","2345"))
    print(vars(car))
    print(vars(car.driver))

    uberX = UberX("KLO123", Account("Carlos Serrano", "FRE234","case@gmail.com","5478"),"Chevrolet","Spark")
    print(vars(uberX))
    print(vars(uberX.driver))