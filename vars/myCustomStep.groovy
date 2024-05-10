import com.example.MySharedLibrary

def call() {
    echo 'Hello from my custom step!'

    // Example usage:
    def version1 = "1.2.3"
    def version2 = "alpha"

    MySharedLibrary imagebuild = new MySharedLibrary();
    assert imagebuild.isSemanticVersioning(version1), true
    // assert imagebuild.isSemanticVersioning(version2), false


    // def value = 10
    // assert value > 5, "Value should be greater than 5"
    // echo "Value is greater than 5"

}
