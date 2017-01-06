/**
 *  Nest Manager
 *
 *  Copyright 2017 Christopher Sirois
 *
 */
metadata {
	definition (name: "Nest Manager", namespace: "cjsirois", author: "Christopher Sirois", oauth: true) {
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"

}