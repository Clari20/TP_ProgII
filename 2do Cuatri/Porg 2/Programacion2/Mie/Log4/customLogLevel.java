package org.example;

import java.util.logging.Level;

public class customLogLevel extends Level {
    private static final long serialVersionUID = 1L;

    public static final int MI_LOG_LEVEL_INT = 350; // Un valor entre INFO (400) y WARN (500)
    public static final Level MI_LOG_LEVEL = new customLogLevel("MI_LOG_LEVEL", MI_LOG_LEVEL_INT);

    protected customLogLevel(String name, int intLevel) {
        super(name, intLevel);
    }
}
