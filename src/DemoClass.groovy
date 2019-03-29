class DemoClass {

    static void main(args) {
        def student = new Student(className: "高中一班")

        assert student.getClassName("className")=="高中一班"


        student.setClassName("高中二班")

        assert student.getClassName("className")=="高中一班"
    }
}
