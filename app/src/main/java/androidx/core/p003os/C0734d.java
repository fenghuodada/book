package androidx.core.p003os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* renamed from: androidx.core.os.d */
/* loaded from: classes.dex */
public final class C0734d {
    @DoNotInline
    /* renamed from: a */
    public static LocaleList m11861a(Configuration configuration) {
        LocaleList locales;
        locales = configuration.getLocales();
        return locales;
    }
}
