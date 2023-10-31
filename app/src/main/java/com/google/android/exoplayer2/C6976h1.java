package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.InterfaceC6753a;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7421n;
import java.util.Iterator;

/* renamed from: com.google.android.exoplayer2.h1 */
/* loaded from: classes.dex */
public final class C6976h1 {

    /* renamed from: a */
    public final Context f12138a;

    /* renamed from: b */
    public final Handler f12139b;

    /* renamed from: c */
    public final InterfaceC6977a f12140c;

    /* renamed from: d */
    public final AudioManager f12141d;
    @Nullable

    /* renamed from: e */
    public C6978b f12142e;

    /* renamed from: f */
    public int f12143f;

    /* renamed from: g */
    public int f12144g;

    /* renamed from: h */
    public boolean f12145h;

    /* renamed from: com.google.android.exoplayer2.h1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6977a {
    }

    /* renamed from: com.google.android.exoplayer2.h1$b */
    /* loaded from: classes.dex */
    public final class C6978b extends BroadcastReceiver {
        public C6978b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            final C6976h1 c6976h1 = C6976h1.this;
            c6976h1.f12139b.post(new Runnable() { // from class: com.google.android.exoplayer2.i1
                @Override // java.lang.Runnable
                public final void run() {
                    C6976h1.this.m5693c();
                }
            });
        }
    }

    public C6976h1(Context context, Handler handler, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
        boolean z;
        Context applicationContext = context.getApplicationContext();
        this.f12138a = applicationContext;
        this.f12139b = handler;
        this.f12140c = surfaceHolder$CallbackC6972b;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        C7394a.m5130e(audioManager);
        this.f12141d = audioManager;
        this.f12143f = 3;
        this.f12144g = m5695a(audioManager, 3);
        int i = this.f12143f;
        if (C7408g0.f13905a >= 23) {
            z = audioManager.isStreamMute(i);
        } else if (m5695a(audioManager, i) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f12145h = z;
        C6978b c6978b = new C6978b();
        try {
            applicationContext.registerReceiver(c6978b, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f12142e = c6978b;
        } catch (RuntimeException e) {
            C7421n.m5055c("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: a */
    public static int m5695a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            C7421n.m5055c("StreamVolumeManager", sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: b */
    public final void m5694b(int i) {
        if (this.f12143f == i) {
            return;
        }
        this.f12143f = i;
        m5693c();
        C6970g1 c6970g1 = C6970g1.this;
        DeviceInfo m5752Y = C6970g1.m5752Y(c6970g1.f12090o);
        if (!m5752Y.equals(c6970g1.f12075H)) {
            c6970g1.f12075H = m5752Y;
            Iterator<InterfaceC6753a> it = c6970g1.f12086k.iterator();
            while (it.hasNext()) {
                it.next().mo5196A();
            }
        }
    }

    /* renamed from: c */
    public final void m5693c() {
        boolean z;
        int i = this.f12143f;
        AudioManager audioManager = this.f12141d;
        int m5695a = m5695a(audioManager, i);
        int i2 = this.f12143f;
        if (C7408g0.f13905a >= 23) {
            z = audioManager.isStreamMute(i2);
        } else if (m5695a(audioManager, i2) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f12144g != m5695a || this.f12145h != z) {
            this.f12144g = m5695a;
            this.f12145h = z;
            Iterator<InterfaceC6753a> it = C6970g1.this.f12086k.iterator();
            while (it.hasNext()) {
                it.next().mo5192v();
            }
        }
    }
}
