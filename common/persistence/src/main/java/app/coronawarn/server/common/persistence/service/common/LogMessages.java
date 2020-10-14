package app.coronawarn.server.common.persistence.service.common;

public enum LogMessages {

	KEYS_SELECTED_FOR_UPLOAD("Keys selected for upload: {}"), //
	KEYS_PICKED_FROM_UPLOAD_TABLE("{} keys picked after read from upload table"), //
	KEYS_REMAINING_AFTER_FILTERING_BY_CONSENT("{} keys remaining after filtering by consent"), //
	KEYS_REMAINING_AFTER_FILTERING_BY_VALIDITY("{} keys remaining after filtering by validity"), //
	KEYS_REMAINING_AFTER_FILTERING_BY_SHARE_POLICY("{} keys remaining after filtering by share policy"), //
	;

	private final String message;

	/**
	 * @return the log message (default English).
	 */
	public String toString() {
		return message;
	}

	private LogMessages(String message) {
		this.message = message;
	}
}
