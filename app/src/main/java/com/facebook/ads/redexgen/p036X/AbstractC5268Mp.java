package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.widget.LinearLayout;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;

/* renamed from: com.facebook.ads.redexgen.X.Mp */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5268Mp extends LinearLayout {
    public static int A00 = (int) (C5208Lr.A00 * 56.0f);

    public abstract void A04(C39871K c39871k, boolean z);

    public abstract boolean A05();

    public abstract int getToolbarHeight();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setPageDetails(C39971U c39971u, String str, int i, C40041b c40041b);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i);

    public abstract void setToolbarListener(InterfaceC5267Mo interfaceC5267Mo);

    public AbstractC5268Mp(Context context) {
        super(context);
    }
}
