class HelloWorld {


    static void main(args) {
        def x = 1
        System.out.println(x)
        System.out.println x

        println(x)
        println x

        //定义字符串
        def xx = 'i have ${x} ￥'
        println(xx)
        println(xx.getClass())

        def xxx = "u have ${x} \$"
        println(xxx)
        println(xxx.getClass())

        def xxxx = """we 
            have ${2 * x} 
            \$"""
        println(xxxx)
        println(xxxx.getClass())

        def xxxxx='''we all have ${3 *x} $'''
        println(xxxxx)
        println(xxxxx.getClass())

    }

}
