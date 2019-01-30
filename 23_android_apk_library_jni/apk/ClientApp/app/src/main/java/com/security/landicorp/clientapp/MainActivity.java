package com.security.landicorp.clientapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import android.os.IBinder;

import android.content.Intent;
import android.content.ServiceConnection;
import android.content.ComponentName;

import android.os.RemoteException;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.Context;

import android.util.Log;

import java.io.IOException;

import android.widget.Toast;

import com.security.landicorp.vulnerabilitydetect.IRemoteService;

public class MainActivity extends AppCompatActivity {

    private static final String ACTION_BIND_LOCAL_SERVICE = "landicorp.intent.action.BIND_REMOTE_SERVICE";
    private static final String ACTIVITY_TAG = "ClientApp"; 

    IRemoteService mIRemoteService;

    private ServiceConnection mRemoteConnection = new ServiceConnection() {
	    public void onServiceConnected(ComponentName className, IBinder service) {
		    // Following the example above for an AIDL interface,
		    // this gets an instance of the IRemoteInterface, which we can use to call on the service
		    mIRemoteService = IRemoteService.Stub.asInterface(service);
	    	    Log.v(MainActivity.ACTIVITY_TAG,"kevin --->  client:ServiceConnect");  
		    try {
			    int id = mIRemoteService.getPid();
    			    showMessage(Integer.toString(id));
		    } catch (RemoteException e) {
			    e.printStackTrace();
		    }
	    }

	    // Called when the connection with the service disconnects unexpectedly
	    public void onServiceDisconnected(ComponentName className) {
		    Log.e(MainActivity.ACTIVITY_TAG, "Service has unexpectedly disconnected");
		    mIRemoteService = null;
		    // 注意只有在极端的服务端crash的情况下，该函数才会被调用
	    	    Log.v(MainActivity.ACTIVITY_TAG,"kevin --->  client:ServiceDisconnect");  
	    }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

    	    showMessage("Ver. 1.0.4");

	    Intent localIntent = new Intent();
	    // 以下这句是进行远方服务的关键
	    localIntent.setClassName("com.security.landicorp.vulnerabilitydetect","com.security.landicorp.vulnerabilitydetect.RemoteService");
	    bindService(localIntent, mRemoteConnection, BIND_AUTO_CREATE);

	    Log.v(MainActivity.ACTIVITY_TAG,"kevin --->  client:Create");  
    }

    @Override
    protected void onDestroy() {
	    super.onDestroy();
	    unbindService(mRemoteConnection);
	    Log.v(MainActivity.ACTIVITY_TAG,"kevin --->  client:Destroy:unbind");  
    }

    private void showMessage(String val)
    {
	    Context context = getApplicationContext();
	    CharSequence text = val; 
	    int duration = Toast.LENGTH_SHORT;
	    Toast toast = Toast.makeText(context, text, duration);
	    toast.show();
    }
}
