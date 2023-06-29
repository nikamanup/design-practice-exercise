package designpattern.proxy;

import java.io.IOException;

public class CommandExecuterProxy implements CommandExecuter {
    private boolean isAdmin;
    private CommandExecuter commandExecuter;

    public CommandExecuterProxy(String user, String pwd) {
        if(user.equals("anup")&&pwd.equals("pwd"))
            isAdmin=true;
        commandExecuter=new CommandExecuterImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin){
            commandExecuter.runCommand(cmd);
        }else {
            if (cmd.trim().startsWith("rm")){
                throw new Exception("RM Command not allowed");
            }else {
                commandExecuter.runCommand(cmd);
            }

        }
    }
}
