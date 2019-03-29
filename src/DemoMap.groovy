class DemoMap {


    static void main(args) {
        def map = [:]
        map = ['zhangsan': 18, ' lisi': 19]
        map.put('name', 'age')


        map.each {
            println("key=$it.key,value=$it.value")
        }

        map.eachWithIndex { LinkedHashMap.Entry<String, Integer> entry, int i ->
            println("index=$i,key=$entry.key,value=$entry.value")
        }
        def has = map.containsKey("name")

        println("has name=$has")




        assert map.containsKey("name")


        map.remove("name")

        map.each {
            println("key=$it.key,value=$it.value")
        }


    }
}
