/*******************************************************************************
 * Copyright (c) 2013 Jeff Mixon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * (or any later version, at your option) which accompanies this distribution,
 * and is available at http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Jeff Mixon - initial public release
 ******************************************************************************/
/**
 * 
 */
package com.steelthorn.android.watch.smartsquare;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import br.com.condesales.models.Venue;

/**
 * @author Jeff Mixon
 *
 */
public interface ISmartSquareControlView extends IBaseView
{
	Context getContext();
	
	void onNearbyVenuesReceived(List<Venue> venues);
	
	void onVenueCategoryIconRetrieved(Venue v, Bitmap b);
	
	void onCheckinResponse(Boolean success);
	
	void onVenueRefreshed(Venue original, Venue refreshed);
	
	void onNotFoursquareAuthenticated();
}
