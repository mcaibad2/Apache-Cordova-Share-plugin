package com.phonegap.plugins.share;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;

public class SharePlugin extends CordovaPlugin 
{
	@Override
	public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException 
	{
		if (action.equals("share")) 
		{
            final String subject = args.getString(0); 
            final String text = args.getString(1); 
            cordova.getActivity().runOnUiThread(new Runnable() 
            {
                public void run() 
                {
                	share(subject, text, callbackContext);
                }
            });
            
            return true;
        }
        
		return false;
	}
	
	private void share(String subject, String text, CallbackContext callbackContext)
	{
		Intent intent = new Intent(android.content.Intent.ACTION_SEND);
		intent.setType("text/plain");
		intent.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
		intent.putExtra(android.content.Intent.EXTRA_TEXT, text);
		this.cordova.startActivityForResult(this, intent, 0);
	}
}