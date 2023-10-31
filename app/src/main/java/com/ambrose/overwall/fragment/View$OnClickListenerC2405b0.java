package com.ambrose.overwall.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;

/* renamed from: com.ambrose.overwall.fragment.b0 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2405b0 implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MyApplication myApplication = MyApplication.f5741c;
        int i = C2451e0.f5865L;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.ambrose.overwall"));
            intent.addFlags(268435456);
            myApplication.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(MyApplication.f5741c, (int) R.string.ic_wrong, 0).show();
        }
    }
}
