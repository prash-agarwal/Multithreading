import java.time.LocalDateTime;

public class NativeExample {
	 // Declare a native method
	//Learn more about native keyword lates thru ChatGPT
    public native void nativeMethod();

    // Load the library containing the native implementation
    static {
        System.loadLibrary("NativeLib");
    }

    public static void main(String[] args) {
        NativeExample example = new NativeExample();
        example.nativeMethod();
        LocalDateTime currentDateTime = LocalDateTime.now();
    }
}
