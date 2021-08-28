import org.apache.commons.cli.*;

import java.util.Arrays;

/*
* <h1>main.java</h1>
*
* This class creates a CLI interface to allow the management of networks. The CLI interfaces uses the Apache commons-cli
* library for management of passed arguments.
* */

public class main {
    public static void main(String[] args) throws ParseException {
        CommandLine cmd = null;
        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        String newNetworkName;

        Options options = new Options();    //Create a new collection of CLI options.

        //Create new option to create a new network.
        Option newNet = new Option("n", "new", true, "Create a new network with given name");
        newNet.setRequired(false);

        //Create new option to delete an existing network.
        Option delNet = new Option("d", "delete", true, "Delete an existing network");
        delNet.setRequired(false);

        //Create new option to Load an existing network.
        Option loadNet = new Option("l", "load", true, "Load an existing network");
        loadNet.setRequired(false);

        //Create new option to create a Quick network, allows the user to pass in all args at once.
        Option quickNet = new Option("q", "quick", true, "Create a quick network");
        quickNet.setRequired(false);

        //Add each CLI option to the Options collection
        options.addOption(newNet);
        options.addOption(delNet);
        options.addOption(loadNet);
        options.addOption(quickNet);

        cmd = parser.parse(options, args);



        System.out.println(Arrays.toString(cmd.getOptions()));

    }
}
