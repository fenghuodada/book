package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0054a;
import kotlin.jvm.internal.C10843j;

/* renamed from: androidx.activity.result.contract.d */
/* loaded from: classes.dex */
public final class C0062d extends AbstractC0058a<Intent, C0054a> {
    @Override // androidx.activity.result.contract.AbstractC0058a
    public final Intent createIntent(Context context, Intent intent) {
        Intent input = intent;
        C10843j.m430f(context, "context");
        C10843j.m430f(input, "input");
        return input;
    }

    @Override // androidx.activity.result.contract.AbstractC0058a
    public final C0054a parseResult(int i, Intent intent) {
        return new C0054a(i, intent);
    }
}
