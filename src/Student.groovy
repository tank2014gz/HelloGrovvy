import groovy.transform.PackageScope

class Student {

    private String className

    def getClassName = {
        className
    }
    def setClassName = {it->
        className = it
    }
}
