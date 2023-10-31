package com.ambrose.overwall.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.widget.Toast;
import cn.hutool.core.codec.C2026c;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.util.util.request.C2605b;
import com.qmuiteam.qmui.util.C9144e;
import java.util.Locale;

/* renamed from: com.ambrose.overwall.fragment.k0 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2464k0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2451e0 f5892a;

    public View$OnClickListenerC2464k0(C2451e0 c2451e0) {
        this.f5892a = c2451e0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C2451e0 c2451e0 = this.f5892a;
        if (Locale.getDefault().toString().toLowerCase().contains("fa")) {
            str = "mailto:bestcolorvolly@proton.me";
        } else {
            str = "mailto:bestcolorvolly@gmail.com";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?subject=");
            sb.append(Uri.encode("From:" + c2451e0.getString(R.string.app_name) + " - " + C9144e.m2641a(c2451e0.getContext()) + " - Android users"));
            sb.append("&body=");
            StringBuilder sb2 = new StringBuilder("\n\n\n");
            sb2.append(c2451e0.getString(R.string.app_name));
            sb2.append(":");
            sb2.append(C9144e.m2641a(c2451e0.getContext()));
            sb2.append("\nPhotoType:");
            sb2.append(Build.MANUFACTURER);
            sb2.append("-");
            sb2.append(Build.MODEL);
            sb2.append("\nAndroidVersion:");
            sb2.append(Build.VERSION.RELEASE);
            sb2.append("\nAndroidStatus:");
            sb2.append(Build.VERSION.SDK_INT);
            sb2.append("\nUserID:");
            sb2.append(C2026c.m9720c(C2605b.m9334a(ApplicationC2534a.f6025a) + "-" + C2605b.m9333b(ApplicationC2534a.f6025a)));
            sb.append(Uri.encode(sb2.toString()));
            String sb3 = sb.toString();
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(sb3));
            if (intent.resolveActivity(MyApplication.f5741c.getPackageManager()) != null) {
                c2451e0.startActivity(intent);
            }
        } catch (Exception unused) {
            Toast.makeText(MyApplication.f5741c, c2451e0.getString(R.string.mial_tips), 0).show();
        }
    }
}
