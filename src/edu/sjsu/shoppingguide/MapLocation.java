package edu.sjsu.shoppingguide;

import com.google.android.maps.GeoPoint;

	/** Class to hold location information */
	public class MapLocation {

		private GeoPoint	mPoint;
		private String		mName;

		public MapLocation(String name,double latitude, double longitude) {
			this.mName = name;
			mPoint = new GeoPoint((int)(latitude*1e6),(int)(longitude*1e6));
		}

		public GeoPoint getPoint() {
			return mPoint;
		}

		public String getName() {
			return mName;
		}
	}