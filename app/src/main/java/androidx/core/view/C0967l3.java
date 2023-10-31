package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* renamed from: androidx.core.view.l3 */
/* loaded from: classes.dex */
public final class C0967l3 extends C0962k3 {
    public C0967l3(@NonNull Window window, @Nullable View view) {
        super(window, view);
    }

    @Override // androidx.appcompat.C0157c
    /* renamed from: c */
    public final void mo11373c(boolean z) {
        Window window = this.f2647D;
        if (z) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
