package ChainOfResponsibilityDesignPattern;

public class Main {
  public static void main(String[] args) {
    LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

    logProcessor.log(LogProcessor.ERROR, "something went wrong");
    logProcessor.log(LogProcessor.DEBUG, "this is for the debug");
    logProcessor.log(LogProcessor.INFO, "this is for the the info");

  }
}
