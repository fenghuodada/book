package androidx.core.graphics;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.C0475g;
import androidx.core.content.res.C0676f;
import androidx.core.provider.FontsContractCompat$FontRequestCallback;
import java.lang.reflect.Method;

/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
public final class C0711e {

    /* renamed from: a */
    public static final C0721n f2402a;

    /* renamed from: b */
    public static final C0475g<String, Typeface> f2403b;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: androidx.core.graphics.e$a */
    /* loaded from: classes.dex */
    public static class C0712a extends FontsContractCompat$FontRequestCallback {
        @Nullable

        /* renamed from: a */
        public final C0676f.AbstractC0681e f2404a;

        public C0712a(@Nullable C0676f.AbstractC0681e abstractC0681e) {
            this.f2404a = abstractC0681e;
        }
    }

    static {
        C0721n c0713f;
        boolean z;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0713f = new C0719l();
        } else if (i >= 28) {
            c0713f = new C0717j();
        } else if (i >= 26) {
            c0713f = new C0716i();
        } else {
            if (i >= 24) {
                Method method = C0714g.f2412c;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c0713f = new C0714g();
                }
            }
            c0713f = new C0713f();
        }
        f2402a = c0713f;
        f2403b = new C0475g<>(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m11907a(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull androidx.core.content.res.FontResourcesParserCompat.InterfaceC0667b r8, @androidx.annotation.NonNull android.content.res.Resources r9, int r10, @androidx.annotation.Nullable java.lang.String r11, int r12, int r13, @androidx.annotation.Nullable androidx.core.content.res.C0676f.AbstractC0681e r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C0711e.m11907a(android.content.Context, androidx.core.content.res.FontResourcesParserCompat$b, android.content.res.Resources, int, java.lang.String, int, int, androidx.core.content.res.f$e, boolean):android.graphics.Typeface");
    }

    /* renamed from: b */
    public static String m11906b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
