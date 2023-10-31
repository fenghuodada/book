package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.internal.d */
/* loaded from: classes.dex */
public final class C6446d extends AbstractC6453j {

    /* renamed from: a */
    public final List<AbstractC6458m> f10129a;

    public C6446d(ArrayList arrayList) {
        this.f10129a = arrayList;
    }

    @Override // com.google.android.datatransport.cct.internal.AbstractC6453j
    @NonNull
    @Encodable.Field(name = "logRequest")
    /* renamed from: a */
    public final List<AbstractC6458m> mo6337a() {
        return this.f10129a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6453j) {
            return this.f10129a.equals(((AbstractC6453j) obj).mo6337a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f10129a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f10129a + "}";
    }
}
