package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.p048d.C8794e;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;

/* loaded from: classes3.dex */
public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C8794e.m3041a();
        C8794e.m3038a(adSessionConfiguration, "AdSessionConfiguration is null");
        C8794e.m3038a(adSessionContext, "AdSessionContext is null");
        return new C8773a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
