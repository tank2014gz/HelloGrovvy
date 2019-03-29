class ClouserSetting {

    static void main(args) {
        int x = fab(5)
        println x

        int t = fab1(4)
        println t


        int y = cal(3)
        println y

        p1()
        p2()
        p3()
        p4()
        p5()
        p6()
    }


    static int fab(int number) {
        int resulte = 1
        1.upto(number, { num -> resulte *= num })
        return resulte
    }

    static int fab1(int number) {
        int resulte = 1
        number.downto(1) { num ->
            resulte *= num
        }
        return resulte
    }

    static int cal(int number) {
        int resulte = 1
        number.times { num ->
            resulte += num
        }
        return resulte
    }


    static void p1() {
        String str = 'The 2 and 3 is 5'
        str.each {
            String temo -> print temo
        }
        println ""
    }

    static void p2() {
        String str = "The 2 and 3 is 5"
        println str.find {
            String s -> s.isNumber()
        }
    }

    static void p3() {
        String st2 = "The 2 and 3 is 5"
        println st2.findAll {
            String str -> str.isNumber()
        }
    }

    static void p4() {
        String st2 = "The 2 and 3 is 5"
        println st2.any {
            String str -> str.isNumber()
        }
    }

    static void p5() {
        String st2 = "The 2 and 3 is 5"
        println st2.every {
            String s -> s.isNumber()
        }
    }

    static void p6() {
        String str = "The 2 and 3 is 5"
        def list = str.collect {
            it.toUpperCase()
        }
        println list.toListString()

    }

}
