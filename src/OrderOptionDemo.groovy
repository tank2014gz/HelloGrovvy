class OrderOptionDemo {

    static void main(args) {
        def x = 1.23
        def result
        switch (x) {
            case 'foo':
                result = 'found foo'
                break
            case [4, 5, 6, 'isList']:
                result = "list"
                break
            case 12..30:
                result = "range"
                break
            case Integer:
                result = 'integer'
                break
            case BigDecimal:
                result = 'big decimal'
                break
            default:
                result = 'default'
                break
        }
        println result

        def sum = 0
        for (i in 0..10) {
            sum += i
        }
//        println sum
        sum = 0
        for (i in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) {
            sum += i
        }
//        println sum
        sum = 0
        for (i in ["lili": 1, "xiaoming": 3]) {
            sum += i.value
        }
        println sum
    }
}
