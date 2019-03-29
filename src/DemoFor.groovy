class DemoFor {

    static void main(args){
      //范围
        //1..10 --包含范围的示例
        for (i in 1..10){
            print("$i,")
        }
        println()
        //1..<10  独占范围的示例

        for (i in  1..<10){
            print("$i,")
        }
        // 'a'..'z' 范围可以由字符组成
        println()
        for (i in 'a' .. 'z'){
            print("$i,")
        }
        //可以降序
        println()
        for (i in 'z' .. 'a'){
            print("$i,")
        }
    }
}
