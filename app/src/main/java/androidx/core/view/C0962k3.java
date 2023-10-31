package androidx.core.view;

import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: androidx.core.view.k3 */
/* loaded from: classes.dex */
public class C0962k3 extends C0956j3 {
    public C0962k3(@NonNull Window window, @Nullable View view) {
        super(window, view);
    }

    @Override // androidx.appcompat.C0157c
    /* renamed from: d */
    public final void mo11372d(boolean z) {
        Window window = this.f2647D;
        if (z) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
