package com.home.post;

import lombok.Data;

@Data
public class _links {

	public self self;
	public edit edit;
	public avatar avatar;
	
	@Data
	class self {
		String href;

	}

	@Data
	class edit {

		String href;

	}

	@Data
	class avatar {

		String href;
	}
}
