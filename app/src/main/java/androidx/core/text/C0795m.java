package androidx.core.text;

import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* renamed from: androidx.core.text.m */
/* loaded from: classes.dex */
public final class C0795m {

    /* renamed from: a */
    public static final /* synthetic */ int f2499a = 0;

    @RequiresApi(17)
    /* renamed from: androidx.core.text.m$a */
    /* loaded from: classes.dex */
    public static class C0796a {
        @DoNotInline
        /* renamed from: a */
        public static int m11797a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        new Locale("", "");
    }
}
