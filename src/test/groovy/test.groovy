class test {
    static void main(String[] args) {
//        "#####-Ex-1-#####"
        String a = "Macabi Zona Macabi Zona Macabi Zona Macabi Zona"
        println "The number of Zona is: ${a.findAll("Zona").size()}"
        println "Lower case + without white spaces: ${a.toLowerCase().replaceAll(" ","")}"
        println a.replaceAll("Macabi","Hapoel").replaceAll("Zona", "Alufa")
        println "The number of a is: ${a.findAll("a").size()}"


//        "#####-Ex-2-#####"
        ArrayList<String> b = ["Gal","Daniel","Moshe","Haim"]
        b.each {name ->
            def time = new Date()
            println "In the name ${name} there are ${name.size()} letters and the time is ${time.format("HH:mm:ss")}"
        }

    }
}
