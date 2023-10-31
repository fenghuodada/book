package com.google.ads.mediation.adcolony;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.AbstractC2317u;
import com.adcolony.sdk.C2201m0;
import com.adcolony.sdk.C2249q;
import com.adcolony.sdk.C2326v;
import com.adcolony.sdk.C2365y;
import com.adcolony.sdk.InterfaceC2349w;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AdColonyRewardedEventForwarder extends AbstractC2317u implements InterfaceC2349w {
    private static AdColonyRewardedEventForwarder instance;
    private static HashMap<String, WeakReference<AdColonyRewardedRenderer>> mListeners;

    private AdColonyRewardedEventForwarder() {
        mListeners = new HashMap<>();
    }

    public static AdColonyRewardedEventForwarder getInstance() {
        if (instance == null) {
            instance = new AdColonyRewardedEventForwarder();
        }
        return instance;
    }

    @Nullable
    private AdColonyRewardedRenderer getListener(@NonNull String str) {
        WeakReference<AdColonyRewardedRenderer> weakReference = mListeners.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void removeListener(@NonNull String str) {
        mListeners.remove(str);
    }

    public void addListener(@NonNull String str, @NonNull AdColonyRewardedRenderer adColonyRewardedRenderer) {
        mListeners.put(str, new WeakReference<>(adColonyRewardedRenderer));
    }

    public boolean isListenerAvailable(@NonNull String str) {
        return getListener(str) != null;
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onClicked(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onClicked(c2249q);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onClosed(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onClosed(c2249q);
            removeListener(c2249q.f5484i);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onExpiring(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onExpiring(c2249q);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onIAPEvent(C2249q c2249q, String str, int i) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onIAPEvent(c2249q, str, i);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onLeftApplication(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onLeftApplication(c2249q);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onOpened(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onOpened(c2249q);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onRequestFilled(C2249q c2249q) {
        AdColonyRewardedRenderer listener = getListener(c2249q.f5484i);
        if (listener != null) {
            listener.onRequestFilled(c2249q);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onRequestNotFilled(C2365y c2365y) {
        String str = c2365y.f5682a;
        String str2 = "";
        if (!C2201m0.m9586f() || C2201m0.m9588d().f4960B || C2201m0.m9588d().f4961C) {
            C1169e.m11129c("The AdColonyZone API is not available while AdColony is disabled.", 0, 0, false);
            str = "";
        }
        AdColonyRewardedRenderer listener = getListener(str);
        if (listener != null) {
            listener.onRequestNotFilled(c2365y);
            String str3 = c2365y.f5682a;
            if (C2201m0.m9586f() && !C2201m0.m9588d().f4960B && !C2201m0.m9588d().f4961C) {
                str2 = str3;
            } else {
                C1169e.m11129c("The AdColonyZone API is not available while AdColony is disabled.", 0, 0, false);
            }
            removeListener(str2);
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2349w
    public void onReward(C2326v c2326v) {
        AdColonyRewardedRenderer listener = getListener(c2326v.f5639c);
        if (listener != null) {
            listener.onReward(c2326v);
        }
    }
}
