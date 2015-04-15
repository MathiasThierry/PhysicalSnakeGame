package com.yourdomain.physicalsnakegame;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by mathi_000 on 13-04-2015.
 */
public class MyCurrentLocationListener implements LocationListener {
    public boolean Triggered = false;

    public MyCurrentLocationListener(Context context, LocationManager locationManager) {
    }


    @Override
    public void onLocationChanged(Location location) {
        Log.i("onLocationChanged", "Triggered");
        this.Triggered = true;

    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}


