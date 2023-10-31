package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C2791o;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.Utils;

/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$a */
    /* loaded from: classes.dex */
    public static class HandlerC2673a extends Handler {
        private HandlerC2673a() {
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            try {
                C2791o c2791o = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (c2791o == null) {
                    if (!Utils.getBooleanForProbability(1)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                AbstractC3080e m8915a = c2791o.m8915a();
                int i = message.what;
                EnumC2674b enumC2674b = EnumC2674b.AD;
                if (i == enumC2674b.m9178a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, m8915a.getRawFullResponse());
                    bundle.putInt("ad_source", m8915a.getSource().m7998a());
                    Message obtain = Message.obtain((Handler) null, enumC2674b.m9178a());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                    } catch (RemoteException e) {
                        if (C3349v.m6862a()) {
                            C3349v.m6852c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        }
                    }
                } else if (message.what == EnumC2674b.AD_DISPLAYED.m9178a()) {
                    C3298j.m6967a(c2791o.m8899c(), m8915a);
                } else if (message.what == EnumC2674b.AD_CLICKED.m9178a()) {
                    C3298j.m6968a(c2791o.m8897d(), m8915a);
                } else if (message.what == EnumC2674b.AD_VIDEO_STARTED.m9178a()) {
                    C3298j.m6963a(c2791o.m8902b(), m8915a);
                } else if (message.what == EnumC2674b.AD_VIDEO_ENDED.m9178a()) {
                    Bundle data = message.getData();
                    C3298j.m6962a(c2791o.m8902b(), m8915a, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                } else if (message.what == EnumC2674b.AD_HIDDEN.m9178a()) {
                    C3298j.m6955b(c2791o.m8899c(), m8915a);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    /* loaded from: classes.dex */
    public enum EnumC2674b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: g */
        private final int f6373g;

        EnumC2674b(int i) {
            this.f6373g = i;
        }

        /* renamed from: a */
        public int m9178a() {
            return this.f6373g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new HandlerC2673a()).getBinder();
    }
}
