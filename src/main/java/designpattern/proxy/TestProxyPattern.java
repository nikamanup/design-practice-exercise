package designpattern.proxy;

public class TestProxyPattern {
    public static void main(String[] args) {
        CommandExecuter commandExecuter=new CommandExecuterProxy("anup","pwd1");
        try {
            commandExecuter.runCommand("ls -ltr");
            commandExecuter.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
