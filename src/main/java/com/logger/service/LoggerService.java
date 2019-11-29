package com.logger.service;

import org.springframework.stereotype.Service;

import com.logger.LogUserJourney;

@Service
public class LoggerService {

	@LogUserJourney
	public String serve() {
		return "Hi DJ";
	}

	@LogUserJourney
	public String serve1() {
		return "Hello";
	}

	@LogUserJourney
	public String serve2() {
		return "Hi DJ";
	}

}
