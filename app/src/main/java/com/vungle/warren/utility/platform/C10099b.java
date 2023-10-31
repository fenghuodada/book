package com.vungle.warren.utility.platform;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vungle.warren.C9963q1;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10111y;

/* renamed from: com.vungle.warren.utility.platform.b */
/* loaded from: classes3.dex */
public final class C10099b implements InterfaceC10100c {

    /* renamed from: a */
    public final PowerManager f20333a;

    /* renamed from: b */
    public final Context f20334b;

    /* renamed from: c */
    public final C9928h f20335c;

    /* renamed from: d */
    public final C10111y f20336d;

    public C10099b(Context context, C9928h c9928h, C10111y c10111y) {
        this.f20334b = context;
        this.f20333a = (PowerManager) context.getSystemService("power");
        this.f20335c = c9928h;
        this.f20336d = c10111y;
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: a */
    public final boolean mo1259a() {
        boolean canRequestPackageInstalls;
        int i = Build.VERSION.SDK_INT;
        Context context = this.f20334b;
        if (i < 26) {
            try {
                return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
            } catch (Settings.SettingNotFoundException unused) {
                return false;
            }
        } else if (context.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
            canRequestPackageInstalls = context.getApplicationContext().getPackageManager().canRequestPackageInstalls();
            return canRequestPackageInstalls;
        } else {
            return false;
        }
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: b */
    public final void mo1258b() {
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: c */
    public final boolean mo1257c() {
        return ((AudioManager) this.f20334b.getSystemService("audio")).getStreamVolume(3) > 0;
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: d */
    public final void mo1256d(C9963q1 c9963q1) {
        this.f20336d.execute(new RunnableC10098a(this, c9963q1));
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: e */
    public final double mo1255e() {
        AudioManager audioManager = (AudioManager) this.f20334b.getSystemService("audio");
        return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: f */
    public final boolean mo1254f() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    /* renamed from: g */
    public final boolean mo1253g() {
        return this.f20333a.isPowerSaveMode();
    }

    @Override // com.vungle.warren.utility.platform.InterfaceC10100c
    @Nullable
    public final String getUserAgent() {
        C9867g c9867g = (C9867g) this.f20335c.m1383p(C9867g.class, "userAgent").get();
        if (c9867g != null) {
            String m1446c = c9867g.m1446c("userAgent");
            if (!TextUtils.isEmpty(m1446c)) {
                return m1446c;
            }
        }
        return System.getProperty("http.agent");
    }
}
