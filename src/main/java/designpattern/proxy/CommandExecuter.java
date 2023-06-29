package designpattern.proxy;

import java.io.IOException;

public interface CommandExecuter {

    public void runCommand(String cmd) throws Exception;
}
