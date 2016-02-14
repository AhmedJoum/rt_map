package com.example.carsiow.rt_map;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class LocListener implements LocationListener
{
    private  double lat =0.0;
    private  double lon = 0.0;
    private  double alt = 0.0;
    private  double speed = 0.0;

    public  double getLat()
    {
        return lat ;
    }

    public  double getLon()
    {
        return lon;
    }

    public  double getAlt()
    {
        return alt;
    }

    public  double getSpeed()
    {
        return speed;
    }

    @Override
    public void onLocationChanged(Location location)
    {
        lat = location.getLatitude();
        lon = location.getLongitude();
        alt = location.getAltitude();
        speed = location.getSpeed();
    }

    @Override
    public void onProviderDisabled(String provider) {}
    @Override
    public void onProviderEnabled(String provider) {}
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {}
}

