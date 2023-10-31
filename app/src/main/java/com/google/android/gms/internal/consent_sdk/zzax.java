package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.FormError;
import com.google.android.ump.InterfaceC7921a;
import com.google.android.ump.InterfaceC7926e;
import com.google.android.ump.InterfaceC7927f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzax implements InterfaceC7927f, InterfaceC7926e {
    private final InterfaceC7927f zza;
    private final InterfaceC7926e zzb;

    public /* synthetic */ zzax(InterfaceC7927f interfaceC7927f, InterfaceC7926e interfaceC7926e, zzav zzavVar) {
        this.zza = interfaceC7927f;
        this.zzb = interfaceC7926e;
    }

    @Override // com.google.android.ump.InterfaceC7926e
    public final void onConsentFormLoadFailure(FormError formError) {
        this.zzb.onConsentFormLoadFailure(formError);
    }

    @Override // com.google.android.ump.InterfaceC7927f
    public final void onConsentFormLoadSuccess(InterfaceC7921a interfaceC7921a) {
        this.zza.onConsentFormLoadSuccess(interfaceC7921a);
    }
}
