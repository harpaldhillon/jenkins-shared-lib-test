import com.example.MySharedLibrary
import groovy.util.GroovyTestCase

def call() {
    echo 'Hello from my custom step!'

    // Example usage:
    def version1 = "1.2.3"
    def version2 = "alpha"

    MySharedLibrary imagebuild = new MySharedLibrary();
    assert true == imagebuild.isSemanticVersioning(version1)
    assert false == imagebuild.isSemanticVersioning(version2)


    // def value = 10
    // assert value > 5, "Value should be greater than 5"
    // echo "Value is greater than 5"

}
