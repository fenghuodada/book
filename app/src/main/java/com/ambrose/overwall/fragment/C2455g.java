package com.ambrose.overwall.fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.kongzue.dialogx.dialogs.C8897o;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

/* renamed from: com.ambrose.overwall.fragment.g */
/* loaded from: classes.dex */
public final class C2455g implements QMUIDialogAction.InterfaceC9166a {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5885a;

    public C2455g(C2470n c2470n) {
        this.f5885a = c2470n;
    }

    @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogAction.InterfaceC9166a
    /* renamed from: a */
    public final void mo2596a(DialogC9181l dialogC9181l) {
        dialogC9181l.dismiss();
        int i = C2470n.f5898e0;
        C2470n c2470n = this.f5885a;
        C8897o.m2897M(c2470n.m2811m(), "Loading..");
        RewardedAd.load(c2470n.m2811m(), "ca-app-pub-3572596334288821/5546397619", new AdRequest.Builder().build(), new C2463k(c2470n));
    }
}
