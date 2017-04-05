package com.ryout.paynotebeta;


import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Me on 3/19/2017.
 */

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "https://connubial-arc.000webhostapp.com/PaynoteRegister.php";
    private Map<String, String> params;

    public RegisterRequest(String email, String name, String password, int passcode, Response.Listener<String> listener)
    {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();

        params.put("email",email);
        params.put("name",name);
        params.put("password",password);
        params.put("passcode",passcode + "");
    }

    @Override
    public Map<String, String> getParams() {
        return params;

    }
}
