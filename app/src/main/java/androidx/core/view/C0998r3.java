package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0157c;
import androidx.collection.C0482i;

@RequiresApi(30)
/* renamed from: androidx.core.view.r3 */
/* loaded from: classes.dex */
public final class C0998r3 extends C0157c {

    /* renamed from: D */
    public final WindowInsetsController f2667D;

    /* renamed from: E */
    public final Window f2668E;

    public C0998r3(@NonNull Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        new C0482i();
        this.f2667D = insetsController;
        this.f2668E = window;
    }

    @Override // androidx.appcompat.C0157c
    /* renamed from: c */
    public final void mo11373c(boolean z) {
        WindowInsetsController windowInsetsController = this.f2667D;
        Window window = this.f2668E;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // androidx.appcompat.C0157c
    /* renamed from: d */
    public final void mo11372d(boolean z) {
        WindowInsetsController windowInsetsController = this.f2667D;
        Window window = this.f2668E;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
