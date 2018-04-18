class Dog extends Mammal{
    def eat(){
        return "Bonzo"

    }

    def sleep(){
        return "The average amount of sleep for adult dogs is 12–14 hours per day"
    }

    def sayHello(){
        return "Bark!! Bark!"
    }

    def fly(){
        return "${this.class.name}s ${super.fly()}"
    }

}
