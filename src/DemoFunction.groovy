class DemoFunction {

    static void main(args) {
        doSomething()

        def person1 = new Person(1, "张三")
        def person2 = new Person(2, "李四")
        doSomething(person1, person2)

        println doSomething("111111111111111111", person2)

        play("jdjjdj")

        println userName("国强")


        println write()
    }

    static String doSomething(Person arg1, Person arg2) {
        println "I will do something $arg1,$arg2"
    }

    static String doSomething(arg1, arg2) {
        "I will do -------------something $arg1,$arg2"
    }

    static def doSomething() {
        println "I will do something"
    }

    static def play = {
        println "一块踢足球"
    }

    static def userName = { it ->
        "hello,$it"
    }

    static def write = {
        "我的都是实打实的坚实的绝对是"
        "市地税局绝对是近段时间回电话滑动事件"
    }

}
