class DemoList {

    static void main(args) {
        //集合--相当于Java中的List
        def a = []
        a.add("Groovy")
        //左移插入，插在数据最后面
        a << "Gradle"
        println(a)
//这个右移插入数据无法操作
//        a >> "Groovy A  Gradle"
//        println(a)

        a.addAll(["Groovy", "Gradle"])
        println(a)

        a << ["a", "b", "c"]
        println(a)

        a.remove("Groovy")
        println(a)
//        a.remove("Gradle")
//        println(a)


        a.removeAll("Gradle")
        println(a)

        for (value in a) {
            print("$value:")
        }

        //映射相当于Java中的Map
    }
}
