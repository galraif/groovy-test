class Lion extends Mammal{
    def eat(){
        return "medium-to-large mammals that are about their own size or larger. " +
                "The preferred prey range is from 190 to 550 kg (420 pounds to 1210 pounds) with the favorite prey size being around 350 kg (770 pounds)! " +
                "This is substantially heavier than the average lion (about 280 pounds for females and 400 pounds for males.)"

    }
    def sleep(){
        return "Male lions spend 18 to 20 hours a day snoozing, while females get 15 to 18 hours of shuteye. " +
                "The lionesses spend more time hunting and taking care of cubs, which is why they get slightly less sleep. " +
                "And following a large meal, lions may even sleep up to 24 hours"
    }

    def sayHello(){
        return "Roaring!!!"
    }

    def fly(){
        return "${this.class.name}s ${super.fly()}"
    }
}
