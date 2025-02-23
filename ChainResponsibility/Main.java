public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "email request not defined");
        logProcessor.log(LogProcessor.INFO, "Email method called");
        logProcessor.log(LogProcessor.DEBUG, "Email method deubugging on");
    }
}
