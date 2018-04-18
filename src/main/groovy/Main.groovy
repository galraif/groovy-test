class Main {

    static void main(String[] args){

        Cat cat = new Cat()
        Dog dog = new Dog()
        Lion lion = new Lion()
        Hawk hawk = new Hawk()
        Seagull seagull = new Seagull()
        Sparrow sparrow = new Sparrow()

        ArrayList< Animal > animals = new ArrayList<Animal>()
        animals.add(cat)
        animals.add(dog)
        animals.add(lion)
        animals.add(hawk)
        animals.add(seagull)
        animals.add(sparrow)

        animals.each {animel ->
            println "The ${animel.class.name}:"
            println "\t* Belongs to the ${animel.class.superclass.name.toLowerCase()}s family"
            println "\t* Eating ${animel.eat()}"
            println "\t* ${animel.sleep()}"
            println "\t* ${animel.fly()}"
            println "\t* It's ${animel.isMammel()} that the ${animel.class.name.toLowerCase()} is a mammal"
            println "\t* It's ${animel.isBird()} that the ${animel.class.name.toLowerCase()} is a bird"
            println "\t* Says: \"${animel.sayHello()}\""
        }
    }
}
