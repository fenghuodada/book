package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.datastore.preferences.protobuf.C1169e;
import com.github.appintro.AppIntroBaseFragmentKt;

/* renamed from: com.adcolony.sdk.q4 */
/* loaded from: classes.dex */
public final class C2264q4 {

    /* renamed from: a */
    public C2100e2 f5514a;

    /* renamed from: b */
    public AlertDialog f5515b;

    /* renamed from: c */
    public boolean f5516c;

    /* renamed from: com.adcolony.sdk.q4$a */
    /* loaded from: classes.dex */
    public class C2265a implements InterfaceC2203m2 {
        public C2265a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            if (C2201m0.m9587e() && (C2201m0.f5363a instanceof Activity)) {
                boolean m9444o = c2100e2.f5098b.m9444o("on_resume");
                C2264q4 c2264q4 = C2264q4.this;
                if (m9444o) {
                    c2264q4.f5514a = c2100e2;
                    return;
                } else {
                    c2264q4.m9512a(c2100e2);
                    return;
                }
            }
            C1169e.m11129c("Missing Activity reference, can't build AlertDialog.", 0, 0, true);
        }
    }

    /* renamed from: com.adcolony.sdk.q4$b */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2266b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5518a;

        public DialogInterface$OnClickListenerC2266b(C2100e2 c2100e2) {
            this.f5518a = c2100e2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C2264q4 c2264q4 = C2264q4.this;
            c2264q4.f5515b = null;
            dialogInterface.dismiss();
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9656l(c2367y1, "positive", true);
            c2264q4.f5516c = false;
            this.f5518a.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.q4$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2267c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5520a;

        public DialogInterface$OnClickListenerC2267c(C2100e2 c2100e2) {
            this.f5520a = c2100e2;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C2264q4 c2264q4 = C2264q4.this;
            c2264q4.f5515b = null;
            dialogInterface.dismiss();
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9656l(c2367y1, "positive", false);
            c2264q4.f5516c = false;
            this.f5520a.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.q4$d */
    /* loaded from: classes.dex */
    public class DialogInterface$OnCancelListenerC2268d implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5522a;

        public DialogInterface$OnCancelListenerC2268d(C2100e2 c2100e2) {
            this.f5522a = c2100e2;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            C2264q4 c2264q4 = C2264q4.this;
            c2264q4.f5515b = null;
            c2264q4.f5516c = false;
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9656l(c2367y1, "positive", false);
            this.f5522a.m9641a(c2367y1).m9640b();
        }
    }

    /* renamed from: com.adcolony.sdk.q4$e */
    /* loaded from: classes.dex */
    public class RunnableC2269e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AlertDialog.Builder f5524a;

        public RunnableC2269e(AlertDialog.Builder builder) {
            this.f5524a = builder;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2264q4 c2264q4 = C2264q4.this;
            c2264q4.f5516c = true;
            c2264q4.f5515b = this.f5524a.show();
        }
    }

    public C2264q4() {
        C2201m0.m9590b("Alert.show", new C2265a());
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void m9512a(C2100e2 c2100e2) {
        Context context = C2201m0.f5363a;
        if (context == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context, 16974374);
        C2367y1 c2367y1 = c2100e2.f5098b;
        String m9436w = c2367y1.m9436w("message");
        String m9436w2 = c2367y1.m9436w(AppIntroBaseFragmentKt.ARG_TITLE);
        String m9436w3 = c2367y1.m9436w("positive");
        String m9436w4 = c2367y1.m9436w("negative");
        builder.setMessage(m9436w);
        builder.setTitle(m9436w2);
        builder.setPositiveButton(m9436w3, new DialogInterface$OnClickListenerC2266b(c2100e2));
        if (!m9436w4.equals("")) {
            builder.setNegativeButton(m9436w4, new DialogInterface$OnClickListenerC2267c(c2100e2));
        }
        builder.setOnCancelListener(new DialogInterface$OnCancelListenerC2268d(c2100e2));
        C2232o6.m9548o(new RunnableC2269e(builder));
    }
}
