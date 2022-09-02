package com.example.cideo.models;

import android.webkit.JavascriptInterface;

import com.example.cideo.activities.CallActivity;

public class InterfaceJava {
    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        // per activity notification
       callActivity.onPeerConnected();
    }

}
