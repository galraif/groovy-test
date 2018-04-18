class Sparrow extends Bird{
    def eat(){
        return "ragweed, crabgrass, buckwheat, cultivated corn, oats, wheat, and sorghum"

    }

    def fly(){
        return "The ${this.class.name.toLowerCase()} ${super.fly()} 46 km per hour"
    }
    def sayHello(){
        return "chif! chif!! chif!!!"
    }
}
