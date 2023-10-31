package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.k2 */
/* loaded from: classes.dex */
public final class C2182k2 extends ContentObserver {

    /* renamed from: a */
    public AudioManager f5332a;

    /* renamed from: b */
    public C2249q f5333b;

    public C2182k2(Handler handler, C2249q c2249q) {
        super(handler);
        Context context = C2201m0.f5363a;
        if (context != null) {
            this.f5332a = (AudioManager) context.getSystemService("audio");
            this.f5333b = c2249q;
            context.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AudioManager audioManager;
        C2249q c2249q;
        if (this.f5332a != null && (c2249q = this.f5333b) != null && c2249q.f5478c != null) {
            double streamVolume = (audioManager.getStreamVolume(3) / 15.0f) * 100.0f;
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9663e(c2367y1, "audio_percentage", streamVolume);
            C2080d1.m9660h(c2367y1, "ad_session_id", this.f5333b.f5478c.f5203l);
            C2080d1.m9657k(this.f5333b.f5478c.f5201j, c2367y1, FacebookAdapter.KEY_ID);
            new C2100e2(this.f5333b.f5478c.f5202k, c2367y1, "AdContainer.on_audio_change").m9640b();
        }
    }
}
