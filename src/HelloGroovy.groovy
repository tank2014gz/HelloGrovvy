class HelloGroovy {


    static void main(args) {
        println("Hello,Groovy")

        //groovy实质上没有基本类型，本质都是Java中的装箱对象类型
        println("---------groovy实质上没有基本类型，本质都是Java中的装箱对象类型--------")
        int x = 0
        println x.class

        double y = 3.14
        println y.class

        println("--------强类型定义方式/ 弱类型def定义类型----------------")
        //强类型定义方式/ 弱类型def定义类型
        def x1 = 11
        println x1.class

        def y1 = 3.1415
        println y1.class

        def name = "Android"
        println name.class


        def name1 = 'a single\'a\' string'
        println name1.class

        def thupleName = '''three single string'''
        println thupleName.class

        def thupleName1 = '''\
                line one
                line two
                line three 
                '''
        println thupleName1
        println thupleName1.class

        def doubleName = "this is common String"
        println doubleName.class
        def doubleName1 = "Hello:${name1}"
        println doubleName1.class
        println doubleName1

        //新增的操作符

        def str = "groovy"
        def str1 = "gro"
        //center(numberOfChars,padding):使用Padding对已有的字符串进行填充
        // center(numberOfChars):使用空格对已有的字符串两边进行填充
        println str.center(8, 'a')
        println str.center(13, 'a')
        println str.center(7, 'a')

        println str.padLeft(8, 'a')

        println str.padRight(10, 'a')

        println str > str1

        println str[0]
        println str[1..3]


        println str - str1

        println str.reverse()

        println str.capitalize()

        println str.isNumber()

        println str.isCase("GROOVY")



    }

}
