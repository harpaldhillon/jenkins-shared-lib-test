import com.example.MySharedLibrary

def call() {
    echo 'Hello from my custom step!'

    // Example usage:
    def version1 = "1.2.3"
    def version2 = "1.2.3-alpha.1"

    MySharedLibrary imagebuild = new MySharedLibrary();
    imagebuild.isSemanticVersioning(version1)
    imagebuild.isSemanticVersioning(version2)

}
