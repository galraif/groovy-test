class Cat extends Mammal {

    def eat(){
        return "mouses"

    }

    def sleep(){
        return "Commonly sleep between 12 and 16 hours a day — more than most mammals and up to twice as much as humans"
    }

    def sayHello(){
        return "MeowWWww"
    }

    def fly(){
        return "${this.class.name}s ${super.fly()}"
    }


}
