package androidx.fragment;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import androidx.constraintlayout.motion.widget.C0561g;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.manager.C2559b;
import com.google.android.exoplayer2.util.C7436v;
import com.iab.omid.library.adcolony.C8727b;
import com.iab.omid.library.adcolony.p040a.C8710b;
import com.iab.omid.library.adcolony.p041b.C8729b;
import com.iab.omid.library.adcolony.p041b.C8732d;
import com.iab.omid.library.adcolony.p041b.C8735g;
import com.iab.omid.library.adcolony.p043d.C8742a;
import com.iab.omid.library.vungle.C8831b;
import com.qmuiteam.qmui.skin.C9108h;
import org.json.JSONException;

/* renamed from: androidx.fragment.a */
/* loaded from: classes.dex */
public final class C1349a {

    /* renamed from: a */
    public static final C8727b f3312a = new C8727b();

    /* renamed from: a */
    public static void m10610a(String str, JSONException jSONException) {
        if (C8831b.f16828a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, jSONException);
    }

    /* renamed from: b */
    public static void m10609b(Context context) {
        C8727b c8727b = f3312a;
        Context applicationContext = context.getApplicationContext();
        C0561g.m12182a(applicationContext, "Application Context cannot be null");
        if (!c8727b.f16590a) {
            c8727b.f16590a = true;
            C8735g m3181a = C8735g.m3181a();
            m3181a.f16609c.getClass();
            C1435b c1435b = new C1435b();
            Handler handler = new Handler();
            m3181a.f16608b.getClass();
            m3181a.f16610d = new C8710b(handler, applicationContext, c1435b, m3181a);
            C8729b c8729b = C8729b.f16594d;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(c8729b);
            }
            WindowManager windowManager = C8742a.f16623a;
            C8742a.f16625c = applicationContext.getResources().getDisplayMetrics().density;
            C8742a.f16623a = (WindowManager) applicationContext.getSystemService("window");
            C8732d.f16602b.f16603a = applicationContext.getApplicationContext();
        }
    }

    /* renamed from: c */
    public static void m10608c(int i) {
        C9108h.m2670f(ApplicationC2534a.f6025a).m2673c(i);
        C2559b.m9372a(ApplicationC2534a.f6025a).getClass();
        SharedPreferences.Editor edit = C2559b.f6057a.edit();
        edit.putInt("app_skin_index", i);
        edit.apply();
    }

    /* renamed from: d */
    public static long m10607d(C7436v c7436v, int i, int i2) {
        boolean z;
        boolean z2;
        byte[] bArr;
        c7436v.m4992z(i);
        if (c7436v.f13980c - c7436v.f13979b < 5) {
            return -9223372036854775807L;
        }
        int m5015c = c7436v.m5015c();
        if ((8388608 & m5015c) != 0 || ((2096896 & m5015c) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if ((m5015c & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && c7436v.m5002p() >= 7 && c7436v.f13980c - c7436v.f13979b >= 7) {
            if ((c7436v.m5002p() & 16) == 16) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c7436v.m5016b(0, new byte[6], 6);
                return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
