package com.mutipcai;

import java.util.HashMap;
import java.util.Map;



public class BaseController {


	protected Map<String, Object> result(String error, Object object) {
		Map<String, Object> result = new HashMap<String, Object>();
		// 若失敗則有消息
		if (error != null) {
			result.put("error", error);
			return result;
		}
		if (object != null) {
			result.put("object", object);
		}
		return result;
	}


}
