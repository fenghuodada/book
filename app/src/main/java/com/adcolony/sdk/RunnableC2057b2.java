package com.adcolony.sdk;

import android.util.Log;
import java.util.Date;

/* renamed from: com.adcolony.sdk.b2 */
/* loaded from: classes.dex */
public final class RunnableC2057b2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4952a;

    /* renamed from: b */
    public final /* synthetic */ String f4953b;

    /* renamed from: c */
    public final /* synthetic */ int f4954c;

    /* renamed from: d */
    public final /* synthetic */ boolean f4955d;

    /* renamed from: e */
    public final /* synthetic */ C2040a2 f4956e;

    public RunnableC2057b2(C2040a2 c2040a2, int i, String str, int i2, boolean z) {
        this.f4956e = c2040a2;
        this.f4952a = i;
        this.f4953b = str;
        this.f4954c = i2;
        this.f4955d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String substring;
        String str;
        C2040a2 c2040a2 = this.f4956e;
        int i = this.f4952a;
        String str2 = this.f4953b;
        int i2 = this.f4954c;
        if (c2040a2.f4926e != null) {
            if (i2 == 3 && C2040a2.m9709a(c2040a2.f4922a.m9439t(Integer.toString(i)), 3)) {
                C2323u4 c2323u4 = c2040a2.f4926e;
                synchronized (c2323u4) {
                    C2360x1 c2360x1 = new C2360x1();
                    c2360x1.f5676b = 3;
                    c2360x1.f5677c = c2323u4.f5632e;
                    c2360x1.f5678d = str2;
                    if (c2360x1.f5675a == null) {
                        c2360x1.f5675a = new Date(System.currentTimeMillis());
                    }
                    c2323u4.m9490c(c2360x1);
                }
            } else if (i2 == 2 && C2040a2.m9709a(c2040a2.f4922a.m9439t(Integer.toString(i)), 2)) {
                c2040a2.f4926e.m9488e(str2);
            } else if (i2 == 1 && C2040a2.m9709a(c2040a2.f4922a.m9439t(Integer.toString(i)), 1)) {
                c2040a2.f4926e.m9487f(str2);
            } else if (i2 == 0 && C2040a2.m9709a(c2040a2.f4922a.m9439t(Integer.toString(i)), 0)) {
                c2040a2.f4926e.m9489d(str2);
            }
        }
        int i3 = 0;
        while (i3 <= this.f4953b.length() / 4000) {
            int i4 = i3 * 4000;
            i3++;
            int min = Math.min(i3 * 4000, this.f4953b.length());
            if (this.f4954c == 3 && C2040a2.m9708b(this.f4956e.f4922a.m9439t(Integer.toString(this.f4952a)), 3, this.f4955d)) {
                Log.d("AdColony [TRACE]", this.f4953b.substring(i4, min));
            } else if (this.f4954c == 2 && C2040a2.m9708b(this.f4956e.f4922a.m9439t(Integer.toString(this.f4952a)), 2, this.f4955d)) {
                Log.i("AdColony [INFO]", this.f4953b.substring(i4, min));
            } else if (this.f4954c == 1 && C2040a2.m9708b(this.f4956e.f4922a.m9439t(Integer.toString(this.f4952a)), 1, this.f4955d)) {
                Log.w("AdColony [WARNING]", this.f4953b.substring(i4, min));
            } else {
                if (this.f4954c == 0 && C2040a2.m9708b(this.f4956e.f4922a.m9439t(Integer.toString(this.f4952a)), 0, this.f4955d)) {
                    substring = this.f4953b.substring(i4, min);
                    str = "AdColony [ERROR]";
                } else if (this.f4954c == -1 && C2040a2.f4920g >= -1) {
                    substring = this.f4953b.substring(i4, min);
                    str = "AdColony [FATAL]";
                }
                Log.e(str, substring);
            }
        }
    }
}
