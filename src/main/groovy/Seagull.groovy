class Seagull extends Bird{
    def eat(){
        return "a pigeon! https://www.thesun.co.uk/news/4202841/horrific-moment-a-giant-seagull-eats-a-pigeon-whole-leaving-onlookers-in-rome-traumatised/"

    }

    def fly(){
        return "The ${this.class.name.toLowerCase()} ${super.fly()} 60 mph or even faster"
    }
    def sayHello(){
        return "Quahaa quhaa!!"
    }
}
