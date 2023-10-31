package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.ComponentActivity;

/* renamed from: androidx.activity.g */
/* loaded from: classes.dex */
public final class RunnableC0045g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f86a;

    /* renamed from: b */
    public final /* synthetic */ IntentSender.SendIntentException f87b;

    /* renamed from: c */
    public final /* synthetic */ ComponentActivity.C0028b f88c;

    public RunnableC0045g(ComponentActivity.C0028b c0028b, int i, IntentSender.SendIntentException sendIntentException) {
        this.f88c = c0028b;
        this.f86a = i;
        this.f87b = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f88c.m13051a(this.f86a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f87b));
    }
}
