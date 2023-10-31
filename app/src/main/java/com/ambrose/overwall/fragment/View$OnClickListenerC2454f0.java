package com.ambrose.overwall.fragment;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;

/* renamed from: com.ambrose.overwall.fragment.f0 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2454f0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2451e0 f5884a;

    public View$OnClickListenerC2454f0(C2451e0 c2451e0) {
        this.f5884a = c2451e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://t.me/ShareOpenVPN"));
        ComponentName resolveActivity = intent.resolveActivity(MyApplication.f5741c.getPackageManager());
        C2451e0 c2451e0 = this.f5884a;
        if (resolveActivity != null) {
            c2451e0.startActivity(intent);
        } else {
            Toast.makeText(MyApplication.f5741c, c2451e0.getString(R.string.tg_tips), 0).show();
        }
    }
}
