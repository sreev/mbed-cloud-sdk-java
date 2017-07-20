package com.arm.mbed.cloud.sdk.common;

import com.arm.mbed.cloud.sdk.annotations.Preamble;

@Preamble(description = "Log level of the http communications between client and mbed Cloud")
public enum CallLogLevel {
	NONE,
	/**
	 * Logs request and response lines. See HttpLoggingInterceptor
	 * (https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor)
	 * for more information
	 */
	BASIC,
	/**
	 * Logs request and response lines and their respective headers. See
	 * HttpLoggingInterceptor
	 * (https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor)
	 * for more information
	 */
	HEADERS,
	/**
	 * Logs request and response lines and their respective headers and bodies
	 * (if present). See HttpLoggingInterceptor
	 * (https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor)
	 * for more information
	 */
	BODY;

	public static CallLogLevel getLevel(String level) {
		if (level == null || level.isEmpty()) {
			return NONE;
		}
		level = level.trim();
		for (CallLogLevel logLevel : values()) {
			if (logLevel.toString().equalsIgnoreCase(level)) {
				return logLevel;
			}
		}
		return NONE;
	}
}