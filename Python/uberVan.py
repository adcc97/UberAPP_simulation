from car import Car

class UberVan(Car):
    typecarAccepted = []
    seatsMaterial = []

    def __init__(self, licence, driver, typecarAccepted, seatsMaterial):
        super().__init__(licence, driver)
        self.typecarAccepted = typecarAccepted
        self.seatsMaterial = seatsMaterial
        