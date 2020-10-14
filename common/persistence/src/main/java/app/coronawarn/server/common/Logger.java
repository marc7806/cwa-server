package app.coronawarn.server.common;

import app.coronawarn.server.common.persistence.service.common.LogMessages;

/**
 * Delegate logger that only accepts and correctly handles {@link LogMessages}.
 */
public class Logger {

	private final org.slf4j.Logger delegate;

	public Logger(org.slf4j.Logger logger) {
		this.delegate = logger;
	}

    /**
     * Log a message at the INFO level according to the specified format
     * and argument.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg    the argument
     */
    public void info(LogMessages logMessage, Object arg) {
    	delegate.info(logMessage.toString(), arg);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous object creation when the logger
     * is disabled for the INFO level. </p>
     *
     * @param format the format string
     * @param arg1   the first argument
     * @param arg2   the second argument
     */
    public void info(LogMessages logMessage, Object arg1, Object arg2) {
    	delegate.info(logMessage.toString(), arg1, arg2);
    }

    /**
     * Log a message at the INFO level according to the specified format
     * and arguments.
     * <p/>
     * <p>This form avoids superfluous string concatenation when the logger
     * is disabled for the INFO level. However, this variant incurs the hidden
     * (and relatively small) cost of creating an <code>Object[]</code> before invoking the method,
     * even if this logger is disabled for INFO. The variants taking
     * {@link #info(String, Object) one} and {@link #info(String, Object, Object) two}
     * arguments exist solely in order to avoid this hidden cost.</p>
     *
     * @param format    the format string
     * @param arguments a list of 3 or more arguments
     */
    public void info(LogMessages logMessage, Object... arguments) {
    	delegate.info(logMessage.toString(), arguments);
    }
	
}
