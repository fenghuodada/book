package com.applovin.impl.sdk.p028a;

import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a.a */
/* loaded from: classes.dex */
public interface InterfaceC3039a {
    @Nullable
    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}
