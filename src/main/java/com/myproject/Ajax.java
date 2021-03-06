package com.myproject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Serzhan Daniil
 * @version 12.0.2
 * Class for models returning
 */


public class Ajax {

    /**
     * @param object
     * @return
     */
    public static Map<String, Object> successResponse(Object object) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", "success");
        response.put("data", object);
        return response;
    }

    /**
     * @return
     */
    public static Map<String, Object> emptyResponse() {
        Map<String, Object> response = new HashMap<>();
        response.put("result", "success");
        return response;
    }

    /**
     * @param errorMessage
     * @return
     */
    public static Map<String, Object> errorResponse(String errorMessage) {
        Map<String, Object> response = new HashMap<>();
        response.put("result", "error");
        response.put("message", errorMessage);
        return response;
    }
}
