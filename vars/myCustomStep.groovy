import com.example.MySharedLibrary

def call() {
    echo 'Hello from my custom step!'

    // Example usage:
    def version1 = "1.2.3"
    def version2 = "alpha"

    MySharedLibrary imagebuild = new MySharedLibrary();
    assert true, imagebuild.isSemanticVersioning(version1)
    assert true, imagebuild.isSemanticVersioning(version2)

}
