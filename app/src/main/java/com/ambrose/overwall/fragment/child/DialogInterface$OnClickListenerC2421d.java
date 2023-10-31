package com.ambrose.overwall.fragment.child;

import android.content.DialogInterface;
import android.widget.Toast;
import com.ambrose.overwall.R;
import com.android.tool.ApplicationC2534a;
import com.android.tool.pref.C2556b;
import java.util.HashSet;

/* renamed from: com.ambrose.overwall.fragment.child.d */
/* loaded from: classes.dex */
public final class DialogInterface$OnClickListenerC2421d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2414b f5811a;

    public DialogInterface$OnClickListenerC2421d(C2414b c2414b) {
        this.f5811a = c2414b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApplicationC2534a applicationC2534a;
        int i2;
        C2414b c2414b = this.f5811a;
        if (i != 0) {
            if (i == 1) {
                c2414b.f5801w.f6052a.getClass();
                ApplicationC2534a.f6025a.getSharedPreferences("DISALLOWED_APPS_PREF", 0).edit().putStringSet("DISALLOWED_PACKAGES_App", new HashSet()).apply();
                c2414b.f5802x = new HashSet();
                c2414b.m9418x(true);
                applicationC2534a = ApplicationC2534a.f6025a;
                i2 = R.string.open_toast;
            }
            dialogInterface.dismiss();
        }
        c2414b.getClass();
        c2414b.f5802x = new HashSet();
        for (T t : c2414b.f5800v.f9967h) {
            c2414b.f5802x.add(t.f6048b);
        }
        HashSet hashSet = c2414b.f5802x;
        C2556b c2556b = c2414b.f5801w;
        c2556b.getClass();
        HashSet hashSet2 = new HashSet(hashSet);
        c2556b.f6052a.getClass();
        ApplicationC2534a.f6025a.getSharedPreferences("DISALLOWED_APPS_PREF", 0).edit().putStringSet("DISALLOWED_PACKAGES_App", hashSet2).apply();
        c2414b.m9418x(false);
        applicationC2534a = ApplicationC2534a.f6025a;
        i2 = R.string.close_toast;
        Toast.makeText(applicationC2534a, i2, 0).show();
        dialogInterface.dismiss();
    }
}
