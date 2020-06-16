package com.itmo.commands;

import com.itmo.app.Application;
import com.itmo.client.User;
import com.itmo.collection.Dragon;
import com.itmo.utils.FieldsScanner;

/**
 * The type Add if min command.
 */
public class AddIfMinCommand extends Command {
    private Dragon dr;
    /**
     * Instantiates a new Command.
     */
    public AddIfMinCommand(String[] args) {
        super(args);
    }

    @Override
    public int getNumberOfRequiredArgs() {
        return 0;
    }

    @Override
    public void clientInsertion() {
        FieldsScanner helper = FieldsScanner.getInstance();
        dr = helper.scanDragon();
    }

    @Override
    public String execute(Application application, User user)
    {
        return application.getCollection().addIfMin(dr);
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент в коллекцию, если его значение меньше, чем у наименьшего элемента этой коллекции";
    }
}
