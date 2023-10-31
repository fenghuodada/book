package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* renamed from: androidx.emoji2.text.b */
/* loaded from: classes.dex */
public final class C1295b {
    @DoNotInline
    /* renamed from: a */
    public static Handler m10680a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
