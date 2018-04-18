class Hawk extends Bird {
    def eat(){
        return "snakes, lizards, fish, mice, rabbits, squirrels, birds, " +
                "and any other type of small game that is found on the ground"

    }

    def fly(){
        return "The ${this.class.name.toLowerCase()} ${super.fly()} at a speed of at least 120 miles per hour"
    }
    def sayHello(){
        return "Guru Guru!! Guru Guru!!"
    }
}
