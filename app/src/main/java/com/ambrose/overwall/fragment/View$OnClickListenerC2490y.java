package com.ambrose.overwall.fragment;

import android.content.Intent;
import android.view.View;
import com.ambrose.overwall.R;

/* renamed from: com.ambrose.overwall.fragment.y */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2490y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2451e0 f5948a;

    public View$OnClickListenerC2490y(C2451e0 c2451e0) {
        this.f5948a = c2451e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2451e0 c2451e0 = this.f5948a;
        c2451e0.getClass();
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", c2451e0.getString(R.string.app_name));
        intent.setFlags(268435456);
        intent.putExtra("android.intent.extra.TEXT", c2451e0.getString(R.string.share_one) + " https://play.google.com/store/apps/details?id=com.ambrose.overwall " + c2451e0.getString(R.string.share_two));
        c2451e0.getActivity().startActivityForResult(Intent.createChooser(intent, c2451e0.getString(R.string.app_name)), 1);
    }
}
