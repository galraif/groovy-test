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

        animals.each {animal ->
            println "The ${animal.class.name}:"
            println "\t* Belongs to the ${animal.class.superclass.name.toLowerCase()}s family"
            println "\t* Eating ${animal.eat()}"
            println "\t* ${animal.sleep()}"
            println "\t* ${animal.fly()}"
            println "\t* It's ${animal.isMammal()} that the ${animal.class.name.toLowerCase()} is a mammal"
            println "\t* It's ${animal.isBird()} that the ${animal.class.name.toLowerCase()} is a bird"
            println "\t* Says: \"${animal.sayHello()}\""
        }
    }
}
