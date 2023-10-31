package com.google.android.exoplayer2;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.audio.C6692f;
import com.google.android.exoplayer2.audio.C6694f0;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.InterfaceC6699h;
import com.google.android.exoplayer2.metadata.C7057f;
import com.google.android.exoplayer2.text.C7240j;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.video.C7454h;
import com.google.android.exoplayer2.video.spherical.C7476b;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class DefaultRenderersFactory implements InterfaceC6808e1 {

    /* renamed from: a */
    public final Context f10471a;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ExtensionRendererMode {
    }

    public DefaultRenderersFactory(Context context) {
        this.f10471a = context;
    }

    /* renamed from: a */
    public final Renderer[] m6215a(Handler handler, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b2, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b3, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b4) {
        boolean z;
        C6692f c6692f;
        C6692f c6692f2;
        ArrayList arrayList = new ArrayList();
        Context context = this.f10471a;
        C7454h c7454h = new C7454h(context, handler, surfaceHolder$CallbackC6972b);
        c7454h.f12400B0 = false;
        c7454h.f12402C0 = false;
        c7454h.f12404D0 = false;
        arrayList.add(c7454h);
        C6692f c6692f3 = C6692f.f10700c;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        int i = C7408g0.f13905a;
        if (i >= 17) {
            String str = C7408g0.f13907c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                z = true;
                if (!z && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                    c6692f = C6692f.f10701d;
                } else if (i < 29 && C7408g0.m5085u(context)) {
                    c6692f = new C6692f(C6692f.C6693a.m6069a(), 8);
                } else if (registerReceiver == null && registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
                    c6692f2 = new C6692f(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
                    C6694f0 c6694f0 = new C6694f0(context, handler, surfaceHolder$CallbackC6972b2, new DefaultAudioSink(c6692f2, new DefaultAudioSink.C6675d(new InterfaceC6699h[0])));
                    c6694f0.f12400B0 = false;
                    c6694f0.f12402C0 = false;
                    c6694f0.f12404D0 = false;
                    arrayList.add(c6694f0);
                    arrayList.add(new C7240j(surfaceHolder$CallbackC6972b3, handler.getLooper()));
                    arrayList.add(new C7057f(surfaceHolder$CallbackC6972b4, handler.getLooper()));
                    arrayList.add(new C7476b());
                    return (Renderer[]) arrayList.toArray(new Renderer[0]);
                } else {
                    c6692f = C6692f.f10700c;
                }
                c6692f2 = c6692f;
                C6694f0 c6694f02 = new C6694f0(context, handler, surfaceHolder$CallbackC6972b2, new DefaultAudioSink(c6692f2, new DefaultAudioSink.C6675d(new InterfaceC6699h[0])));
                c6694f02.f12400B0 = false;
                c6694f02.f12402C0 = false;
                c6694f02.f12404D0 = false;
                arrayList.add(c6694f02);
                arrayList.add(new C7240j(surfaceHolder$CallbackC6972b3, handler.getLooper()));
                arrayList.add(new C7057f(surfaceHolder$CallbackC6972b4, handler.getLooper()));
                arrayList.add(new C7476b());
                return (Renderer[]) arrayList.toArray(new Renderer[0]);
            }
        }
        z = false;
        if (!z) {
        }
        if (i < 29) {
        }
        if (registerReceiver == null) {
        }
        c6692f = C6692f.f10700c;
        c6692f2 = c6692f;
        C6694f0 c6694f022 = new C6694f0(context, handler, surfaceHolder$CallbackC6972b2, new DefaultAudioSink(c6692f2, new DefaultAudioSink.C6675d(new InterfaceC6699h[0])));
        c6694f022.f12400B0 = false;
        c6694f022.f12402C0 = false;
        c6694f022.f12404D0 = false;
        arrayList.add(c6694f022);
        arrayList.add(new C7240j(surfaceHolder$CallbackC6972b3, handler.getLooper()));
        arrayList.add(new C7057f(surfaceHolder$CallbackC6972b4, handler.getLooper()));
        arrayList.add(new C7476b());
        return (Renderer[]) arrayList.toArray(new Renderer[0]);
    }
}
