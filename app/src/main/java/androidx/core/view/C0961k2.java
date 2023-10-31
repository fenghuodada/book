package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
/* renamed from: androidx.core.view.k2 */
/* loaded from: classes.dex */
public final class C0961k2 {
    @DoNotInline
    /* renamed from: a */
    public static void m11424a(@NonNull Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}
