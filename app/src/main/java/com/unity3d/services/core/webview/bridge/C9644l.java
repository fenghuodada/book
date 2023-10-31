package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.core.log.C9549a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.unity3d.services.core.webview.bridge.l */
/* loaded from: classes3.dex */
public class C9644l implements Parcelable {
    public static final Parcelable.Creator<C9644l> CREATOR = new C9645a();

    /* renamed from: a */
    private boolean f19157a;

    /* renamed from: b */
    private int f19158b;

    /* renamed from: c */
    private String f19159c;

    /* renamed from: com.unity3d.services.core.webview.bridge.l$a */
    /* loaded from: classes3.dex */
    public static class C9645a implements Parcelable.Creator<C9644l> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9644l createFromParcel(Parcel parcel) {
            return new C9644l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9644l[] newArray(int i) {
            return new C9644l[i];
        }
    }

    public C9644l(Parcel parcel) {
        this.f19159c = parcel.readString();
        this.f19157a = parcel.readByte() != 0;
        this.f19158b = parcel.readInt();
    }

    public C9644l(String str, int i) {
        this.f19159c = str;
        this.f19158b = i;
    }

    /* renamed from: a */
    private void m1738a(EnumC9628a enumC9628a, Enum r4, Object... objArr) {
        String str;
        if (this.f19157a || (str = this.f19159c) == null || str.length() == 0) {
            return;
        }
        this.f19157a = true;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        arrayList.add(0, this.f19159c);
        C9632e m1764a = C9632e.m1764a(this.f19158b);
        if (m1764a != null) {
            m1764a.m1763a(enumC9628a, r4, arrayList.toArray());
            return;
        }
        C9549a.m2017c("Couldn't get batch with id: " + m1739a());
    }

    /* renamed from: a */
    public int m1739a() {
        return this.f19158b;
    }

    /* renamed from: a */
    public void m1737a(Enum r2, Object... objArr) {
        m1738a(EnumC9628a.ERROR, r2, objArr);
    }

    /* renamed from: a */
    public void m1736a(Object... objArr) {
        m1738a(EnumC9628a.OK, null, objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 45678;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19159c);
        parcel.writeByte(this.f19157a ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f19158b);
    }
}
