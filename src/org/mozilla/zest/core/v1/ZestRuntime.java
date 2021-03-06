/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.zest.core.v1;

import javax.script.ScriptEngineFactory;


/**
 * The Interface ZestRuntime.
 */
public interface ZestRuntime {
	
	/**
	 * Get the current value of the specified variable.
	 *
	 * @param name the name
	 * @return the current value of the specified variable
	 */
	String getVariable(String name);
	
	/**
	 * Set the value of the specified variable.
	 * @param name
	 * @param value
	 */
	void setVariable(String name, String value);

	/**
	 * Get the last response.
	 *
	 * @return the last response
	 */
	ZestResponse getLastResponse();
	
	/**
	 * Get the last request.
	 *
	 * @return the last request
	 */
	ZestRequest getLastRequest();
	
	/**
	 * Replace any variables in the supplied string
	 * @param str
	 * @param urlEncode
	 * @return the string with the variables replaces
	 */
	String replaceVariablesInString (String str, boolean urlEncode);

	/**
	 * Outputs the specified string
	 * @param str
	 */
	void output(String str);

	ScriptEngineFactory getScriptEngineFactory();

	/**
	 * Sets the standard variables for a request.
	 *
	 * @param request the new standard variables
	 */

	void setStandardVariables(ZestRequest request);

	/**
	 * Sets the standard variables for a response.
	 *
	 * @param response the new standard variables
	 */

	void setStandardVariables(ZestResponse response);
}
