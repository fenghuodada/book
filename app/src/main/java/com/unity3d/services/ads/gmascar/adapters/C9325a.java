package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.GMAAdsError;
import com.unity3d.scar.adapter.common.IAdsErrorHandler;
import com.unity3d.scar.adapter.common.IScarAdapter;
import com.unity3d.scar.adapter.v2000.ScarAdapter;
import com.unity3d.services.core.log.C9549a;

/* renamed from: com.unity3d.services.ads.gmascar.adapters.a */
/* loaded from: classes3.dex */
public class C9325a {
    /* renamed from: a */
    public IScarAdapter m2457a(long j, IAdsErrorHandler iAdsErrorHandler) {
        if (j >= 210402000) {
            return new ScarAdapter(iAdsErrorHandler);
        }
        if (j < 203404000 || j > 204890000) {
            if (j >= 201604000) {
                return new com.unity3d.scar.adapter.v1920.ScarAdapter(iAdsErrorHandler);
            }
            String format = String.format("SCAR version %s is not supported.", Long.valueOf(j));
            iAdsErrorHandler.handleError(GMAAdsError.AdapterCreationError(format));
            C9549a.m2019b(format);
            return null;
        }
        return new com.unity3d.scar.adapter.v1950.ScarAdapter(iAdsErrorHandler);
    }
}
