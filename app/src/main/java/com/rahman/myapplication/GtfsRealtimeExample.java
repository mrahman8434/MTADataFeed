package com.rahman.myapplication;

/**
 * Created by Mahbubur on 10/19/2016.
 */

import com.google.transit.realtime.GtfsRealtime.FeedEntity;
import com.google.transit.realtime.GtfsRealtime.FeedMessage;

import java.net.URL;


public class GtfsRealtimeExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://datamine.mta.info/files/k38dkwh992dk/gtfs");
        FeedMessage feed = FeedMessage.parseFrom(url.openStream());

        for (FeedEntity entity : feed.getEntityList()) {

            System.out.println(entity.getId());
            if (entity.hasTripUpdate()) {
                System.out.println(entity.getTripUpdate());




                }
        }
    }
}