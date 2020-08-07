package net.janrupf.ultralight.javascript.interop;

import net.janrupf.ultralight.annotation.NativeCall;
import net.janrupf.ultralight.annotation.NativeType;
import net.janrupf.ultralight.javascript.JavascriptContext;
import net.janrupf.ultralight.javascript.JavascriptObject;
import net.janrupf.ultralight.javascript.JavascriptValue;

/**
 * Callback when an object is used with an instanceof test.
 */
@NativeType("JSObjectHasInstanceCallback")
public interface JavascriptObjectHasInstanceTester {
    /**
     * The callback invoked when an object is used as the target of an 'instanceof' expression.
     *
     * @param context          The execution context to use
     * @param constructor      The object that is the target of the 'instanceof' expression
     * @param possibleInstance The value being tested to determine if it is an instance of constructor
     * @return {@code true} if possibleInstance is an instance of constructor, otherwise {@code false}
     * @throws JavascriptInteropException If an error occurs while testing if the object is an instance of the value
     */
    @NativeCall
    boolean hasJavascriptInstance(
            JavascriptContext context, JavascriptObject constructor, JavascriptValue possibleInstance)
            throws JavascriptInteropException;
}