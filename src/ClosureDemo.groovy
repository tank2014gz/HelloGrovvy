class ClosureDemo {

    static void main(args) {
        //无参数的闭包
        def clouser = { println 'Hello groovy!' }

        clouser.call()

        clouser()
        //普通闭包的参数

        def clouser1 = { String name, int age ->
            println "Hello ${name},my age is ${age}"
        }
        clouser1.call("xiaoming", 188)

        clouser1("张三", 17)

        //隐式参数
        def closer = { println "Hello ${it}" }
        closer('groovy!!')

        //闭包返回值
        def clouser2 = { return 'Hello groovy!' }
        def result = clouser2()
        println result

        def clouser3 = { println 'Hello groovy!!!!' }
        def result3 = clouser3()
        println result3
    }


}
