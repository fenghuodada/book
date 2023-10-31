package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.l */
/* loaded from: classes.dex */
public abstract class AbstractC2005l {

    /* renamed from: a */
    public static AbstractC2005l f4867a;

    /* renamed from: androidx.work.l$a */
    /* loaded from: classes.dex */
    public static class C2006a extends AbstractC2005l {

        /* renamed from: b */
        public final int f4868b;

        public C2006a(int i) {
            this.f4868b = i;
        }

        @Override // androidx.work.AbstractC2005l
        /* renamed from: a */
        public final void mo9731a(String str, String str2, Throwable... thArr) {
            if (this.f4868b <= 3) {
                if (thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.AbstractC2005l
        /* renamed from: b */
        public final void mo9730b(String str, String str2, Throwable... thArr) {
            if (this.f4868b <= 6) {
                if (thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.AbstractC2005l
        /* renamed from: d */
        public final void mo9729d(String str, String str2, Throwable... thArr) {
            if (this.f4868b <= 4) {
                if (thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.AbstractC2005l
        /* renamed from: f */
        public final void mo9728f(String str, String str2, Throwable... thArr) {
            if (this.f4868b <= 5) {
                if (thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    /* renamed from: c */
    public static synchronized AbstractC2005l m9733c() {
        AbstractC2005l abstractC2005l;
        synchronized (AbstractC2005l.class) {
            if (f4867a == null) {
                f4867a = new C2006a(3);
            }
            abstractC2005l = f4867a;
        }
        return abstractC2005l;
    }

    /* renamed from: e */
    public static String m9732e(@NonNull String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            str = str.substring(0, 20);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public abstract void mo9731a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo9730b(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo9729d(String str, String str2, Throwable... thArr);

    /* renamed from: f */
    public abstract void mo9728f(String str, String str2, Throwable... thArr);
}
