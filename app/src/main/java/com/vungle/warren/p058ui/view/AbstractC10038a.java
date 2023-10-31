package com.vungle.warren.p058ui.view;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.webkit.WebView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.vungle.warren.AbstractActivityC9743a;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.InterfaceC10008d;
import com.vungle.warren.p058ui.InterfaceC10009e;
import com.vungle.warren.p058ui.InterfaceC9998a;
import com.vungle.warren.p058ui.contract.InterfaceC10002a;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.utility.C10087i;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.vungle.warren.ui.view.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10038a<T extends InterfaceC10003b> implements InterfaceC10002a<T> {

    /* renamed from: a */
    public final InterfaceC10008d f20213a;

    /* renamed from: b */
    public final InterfaceC9998a f20214b;

    /* renamed from: c */
    public final String f20215c;

    /* renamed from: d */
    public final FullAdWidget f20216d;

    /* renamed from: e */
    public final Context f20217e;

    /* renamed from: f */
    public AlertDialog f20218f;

    /* renamed from: com.vungle.warren.ui.view.a$a */
    /* loaded from: classes3.dex */
    public class DialogInterface$OnClickListenerC10039a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ DialogInterface.OnClickListener f20219a;

        public DialogInterface$OnClickListenerC10039a(DialogInterface.OnClickListener onClickListener) {
            this.f20219a = onClickListener;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC10038a.this.f20218f = null;
            DialogInterface.OnClickListener onClickListener = this.f20219a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }
    }

    /* renamed from: com.vungle.warren.ui.view.a$b */
    /* loaded from: classes3.dex */
    public class DialogInterface$OnDismissListenerC10040b implements DialogInterface.OnDismissListener {
        public DialogInterface$OnDismissListenerC10040b() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            AbstractC10038a abstractC10038a = AbstractC10038a.this;
            abstractC10038a.f20218f.setOnDismissListener(new DialogInterface$OnDismissListenerC10042b(abstractC10038a));
        }
    }

    /* renamed from: com.vungle.warren.ui.view.a$c */
    /* loaded from: classes3.dex */
    public static class DialogInterface$OnClickListenerC10041c implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: a */
        public final AtomicReference<DialogInterface.OnClickListener> f20222a;

        /* renamed from: b */
        public final AtomicReference<DialogInterface.OnDismissListener> f20223b;

        public DialogInterface$OnClickListenerC10041c(DialogInterface$OnClickListenerC10039a dialogInterface$OnClickListenerC10039a, DialogInterface$OnDismissListenerC10042b dialogInterface$OnDismissListenerC10042b) {
            AtomicReference<DialogInterface.OnClickListener> atomicReference = new AtomicReference<>();
            this.f20222a = atomicReference;
            AtomicReference<DialogInterface.OnDismissListener> atomicReference2 = new AtomicReference<>();
            this.f20223b = atomicReference2;
            atomicReference.set(dialogInterface$OnClickListenerC10039a);
            atomicReference2.set(dialogInterface$OnDismissListenerC10042b);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DialogInterface.OnClickListener onClickListener = this.f20222a.get();
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i);
            }
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            AtomicReference<DialogInterface.OnDismissListener> atomicReference = this.f20223b;
            DialogInterface.OnDismissListener onDismissListener = atomicReference.get();
            if (onDismissListener != null) {
                onDismissListener.onDismiss(dialogInterface);
            }
            atomicReference.set(null);
            this.f20222a.set(null);
        }
    }

    public AbstractC10038a(@NonNull Context context, @NonNull FullAdWidget fullAdWidget, @NonNull InterfaceC10008d interfaceC10008d, @NonNull InterfaceC9998a interfaceC9998a) {
        new Handler(Looper.getMainLooper());
        this.f20215c = getClass().getSimpleName();
        this.f20216d = fullAdWidget;
        this.f20217e = context;
        this.f20213a = interfaceC10008d;
        this.f20214b = interfaceC9998a;
    }

    /* renamed from: b */
    public final boolean m1315b() {
        return this.f20218f != null;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: c */
    public final void mo1306c() {
        FullAdWidget fullAdWidget = this.f20216d;
        WebView webView = fullAdWidget.f20192e;
        if (webView != null) {
            webView.onPause();
        }
        fullAdWidget.getViewTreeObserver().removeOnGlobalLayoutListener(fullAdWidget.f20206s);
        fullAdWidget.removeCallbacks(fullAdWidget.f20205r);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public void close() {
        this.f20214b.close();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: d */
    public final void mo1314d() {
        this.f20216d.f20195h.setVisibility(0);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: e */
    public final void mo1305e(String str, @NonNull String str2, C10011f c10011f, InterfaceC10009e interfaceC10009e) {
        String m12192b = C0552c.m12192b("Opening ", str2);
        String str3 = this.f20215c;
        Log.d(str3, m12192b);
        if (!C10087i.m1271b(str, str2, this.f20217e, c10011f, false, interfaceC10009e)) {
            Log.e(str3, "Cannot open url " + str2);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: g */
    public final void mo1304g() {
        this.f20216d.m1317c(0L);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final String getWebsiteUrl() {
        return this.f20216d.getUrl();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: h */
    public final void mo1303h() {
        FullAdWidget fullAdWidget = this.f20216d;
        WebView webView = fullAdWidget.f20192e;
        if (webView != null) {
            webView.onResume();
        }
        fullAdWidget.post(fullAdWidget.f20205r);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: k */
    public final void mo1313k(@Nullable String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable DialogInterface.OnClickListener onClickListener) {
        Context context = this.f20217e;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        DialogInterface$OnClickListenerC10041c dialogInterface$OnClickListenerC10041c = new DialogInterface$OnClickListenerC10041c(new DialogInterface$OnClickListenerC10039a(onClickListener), new DialogInterface$OnDismissListenerC10042b(this));
        if (!TextUtils.isEmpty(str)) {
            builder.setTitle(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            builder.setMessage(str2);
        }
        builder.setPositiveButton(str3, dialogInterface$OnClickListenerC10041c);
        builder.setNegativeButton(str4, dialogInterface$OnClickListenerC10041c);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.f20218f = create;
        create.setOnDismissListener(dialogInterface$OnClickListenerC10041c);
        this.f20218f.show();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: n */
    public final boolean mo1301n() {
        return this.f20216d.f20192e != null;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: p */
    public final void mo1299p() {
        FullAdWidget fullAdWidget = this.f20216d;
        fullAdWidget.getViewTreeObserver().addOnGlobalLayoutListener(fullAdWidget.f20206s);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: q */
    public final void mo1298q(long j) {
        FullAdWidget fullAdWidget = this.f20216d;
        VideoView videoView = fullAdWidget.f20190c;
        videoView.stopPlayback();
        videoView.setOnCompletionListener(null);
        videoView.setOnErrorListener(null);
        videoView.setOnPreparedListener(null);
        videoView.suspend();
        fullAdWidget.m1317c(j);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: r */
    public final void mo1312r() {
        if (m1315b()) {
            this.f20218f.setOnDismissListener(new DialogInterface$OnDismissListenerC10040b());
            this.f20218f.dismiss();
            this.f20218f.show();
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final void setOrientation(int i) {
        AbstractActivityC9743a.this.setRequestedOrientation(i);
    }
}
