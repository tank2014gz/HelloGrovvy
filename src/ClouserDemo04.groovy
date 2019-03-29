class ClouserDemo04 {

    static void main(args) {
        def scriptClouser = {
            println "scriptClouser this:" + this
            println "scriptClouser own:" + owner
            println "scriptClouser delegate:" + delegate
        }
        scriptClouser.call()
// this == owner == delegate
        def scriptClosure = {
            println "scriptClosure this:" + this // 代表闭包定义处的类
            println "scriptClosure owner:" + owner // 代表闭包定义处的类或者对象
            println "scriptClosure delegate:" + delegate // 代码任意对象，默认与owner一致
        }
        scriptClosure.call()

    }
}
