package com._220a220e.common.controller;

import net.sf.json.JSONObject;

/**
 * @author Garrosh
 * @date 2019/1/6
 */
public abstract class BaseController {

    protected String ajaxDone(int code, String message, String forwardUrl) {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("code", code);
        jsonObj.put("message", message);
        jsonObj.put("forwardUrl",forwardUrl);
        return jsonObj.toString();
    }

    protected String ajaxDoneSuccess(String message) {
        return ajaxDone(200, message, "");
    }

    protected String ajaxDoneError(String message) {
        return ajaxDone(300, message, "");
    }

}
