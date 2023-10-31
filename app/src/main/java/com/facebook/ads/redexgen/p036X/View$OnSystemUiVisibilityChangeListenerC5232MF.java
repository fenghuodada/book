package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.MF */
/* loaded from: assets/audience_network.dex */
public final class View$OnSystemUiVisibilityChangeListenerC5232MF implements View.OnSystemUiVisibilityChangeListener {
    public int A00;
    @Nullable
    public Window A01;
    public final View A03;
    public EnumC5231ME A02 = EnumC5231ME.A03;
    public final Runnable A04 = new C5696Tm(this);

    public View$OnSystemUiVisibilityChangeListenerC5232MF(View view) {
        this.A03 = view;
        this.A03.setOnSystemUiVisibilityChangeListener(this);
    }

    private void A00(int i, boolean z) {
        Window window = this.A01;
        if (window == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags |= i;
        } else {
            attributes.flags &= i ^ (-1);
        }
        this.A01.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(boolean z) {
        if (EnumC5231ME.A03.equals(this.A02)) {
            return;
        }
        int i = 3840;
        if (!z) {
            i = 3840 | 7;
        }
        Handler handler = this.A03.getHandler();
        if (handler != null && z) {
            handler.removeCallbacks(this.A04);
            handler.postDelayed(this.A04, 2000L);
        }
        this.A03.setSystemUiVisibility(i);
    }

    public final void A03() {
        this.A01 = null;
    }

    public final void A04(Window window) {
        this.A01 = window;
    }

    public final void A05(EnumC5231ME enumC5231ME) {
        this.A02 = enumC5231ME;
        if (C5230MD.A00[this.A02.ordinal()] != 1) {
            A00(67108864, false);
            A00(134217728, false);
            this.A03.setSystemUiVisibility(0);
            return;
        }
        A00(67108864, true);
        A00(134217728, true);
        A02(false);
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        this.A00 = i;
        if (((this.A00 ^ i) & 2) != 0 && (i & 2) == 0) {
            A02(true);
        }
    }
}
