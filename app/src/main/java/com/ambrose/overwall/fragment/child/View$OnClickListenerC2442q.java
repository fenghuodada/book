package com.ambrose.overwall.fragment.child;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.android.tool.util.proxy.WifiDirectService;

/* renamed from: com.ambrose.overwall.fragment.child.q */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2442q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2439o f5852a;

    public View$OnClickListenerC2442q(C2439o c2439o) {
        this.f5852a = c2439o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MyApplication myApplication;
        int i;
        C2439o c2439o = this.f5852a;
        if (!c2439o.f5847x.getSwitch().isChecked()) {
            MyApplication myApplication2 = MyApplication.f5741c;
            WifiDirectService.C2590b c2590b = WifiDirectService.f6094a;
            Intent intent = new Intent();
            intent.setAction("com.ambrose.overwall.action.STOP");
            myApplication2.sendBroadcast(intent);
            myApplication = MyApplication.f5741c;
            i = R.string.proxy_close;
        } else {
            MyApplication myApplication3 = MyApplication.f5741c;
            WifiDirectService.C2590b c2590b2 = WifiDirectService.f6094a;
            Intent intent2 = new Intent(myApplication3, WifiDirectService.class);
            intent2.setAction("com.ambrose.overwall.action.START");
            myApplication3.startService(intent2);
            myApplication = MyApplication.f5741c;
            i = R.string.proxy_success;
        }
        Toast.makeText(myApplication, c2439o.getString(i), 0).show();
    }
}
