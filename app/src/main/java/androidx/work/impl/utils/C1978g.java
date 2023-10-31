package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.AbstractC2005l;

/* renamed from: androidx.work.impl.utils.g */
/* loaded from: classes.dex */
public final class C1978g {

    /* renamed from: a */
    public static final String f4801a = AbstractC2005l.m9732e("PackageManagerHelper");

    /* renamed from: a */
    public static void m9747a(@NonNull Context context, @NonNull Class<?> cls, boolean z) {
        String str = f4801a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            AbstractC2005l m9733c = AbstractC2005l.m9733c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? "enabled" : "disabled";
            m9733c.mo9731a(str, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            AbstractC2005l m9733c2 = AbstractC2005l.m9733c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            objArr2[1] = z ? "enabled" : "disabled";
            m9733c2.mo9731a(str, String.format("%s could not be %s", objArr2), e);
        }
    }
}
