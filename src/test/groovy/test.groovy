import groovy.json.*
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
//        "#####-Ex-3-#####"

        String buildinfo = new File('resources/buildinfo.json').text
        def jsonSlurper = new JsonSlurper()
        def json = jsonSlurper.parseText(buildinfo)

        //###Print modules###/
        def modules = json.modules
        modules.each {module ->
            println "Module ID: ${module.id} contains ${module.artifacts.name.size()} Artifact(s) name:"
            module.artifacts.each{artifact ->
                println "   * ${artifact.name}"
            }
            println ""
       }

        //###Export dependencies to cvs file###//
        def dependencies = json.modules.dependencies
        def uniqueDependencies = []

        dependencies.each {dependencie ->
            //Some dependencies NOT contains sha1, sha2 and etc.
            if (dependencie[0].size()==6)
                uniqueDependencies.add(dependencie[0])
        }
        uniqueDependencies = uniqueDependencies.unique()

        def csvFile = new File("resources/dependencies.csv")
        csvFile.createNewFile()
        csvFile << "type , sha1 , sha256 , md5 , id , scopes \n"
        uniqueDependencies.each {uniqueDependencie ->
            csvFile << "${uniqueDependencie.type} , ${uniqueDependencie.sha1} , ${uniqueDependencie.sha256} , ${uniqueDependencie.md5} , ${uniqueDependencie.id} , ${uniqueDependencie.scopes[0]}\n"
        }
        println "Dependencies exported to dependencies.csv"
    }
}
