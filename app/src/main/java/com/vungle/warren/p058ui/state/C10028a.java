package com.vungle.warren.p058ui.state;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.vungle.warren.ui.state.a */
/* loaded from: classes3.dex */
public final class C10028a implements InterfaceC10030b, Parcelable {
    public static final Parcelable.Creator<C10028a> CREATOR = new C10029a();

    /* renamed from: a */
    public final HashMap f20185a = new HashMap();

    /* renamed from: b */
    public final HashMap f20186b = new HashMap();

    /* renamed from: c */
    public final HashMap f20187c = new HashMap();

    /* renamed from: com.vungle.warren.ui.state.a$a */
    /* loaded from: classes3.dex */
    public class C10029a implements Parcelable.Creator<C10028a> {
        @Override // android.os.Parcelable.Creator
        public final C10028a createFromParcel(Parcel parcel) {
            return new C10028a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C10028a[] newArray(int i) {
            return new C10028a[i];
        }
    }

    public C10028a() {
    }

    public C10028a(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f20187c.put(parcel.readString(), (Integer) parcel.readValue(String.class.getClassLoader()));
        }
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.f20185a.put(parcel.readString(), (String) parcel.readValue(String.class.getClassLoader()));
        }
        int readInt3 = parcel.readInt();
        for (int i3 = 0; i3 < readInt3; i3++) {
            this.f20186b.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
    }

    @Override // com.vungle.warren.p058ui.state.InterfaceC10030b
    /* renamed from: b */
    public final String mo1320b() {
        return (String) this.f20185a.get("saved_report");
    }

    /* renamed from: c */
    public final void m1323c(int i) {
        this.f20187c.put("videoPosition", Integer.valueOf(i));
    }

    /* renamed from: d */
    public final void m1322d(String str) {
        this.f20185a.put("saved_report", str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void m1321e(String str, boolean z) {
        this.f20186b.put(str, Boolean.valueOf(z));
    }

    @Override // com.vungle.warren.p058ui.state.InterfaceC10030b
    public final boolean getBoolean(String str, boolean z) {
        Boolean bool = (Boolean) this.f20186b.get(str);
        return bool == null ? z : bool.booleanValue();
    }

    @Override // com.vungle.warren.p058ui.state.InterfaceC10030b
    public final Integer getInt(int i) {
        Integer num = (Integer) this.f20187c.get("videoPosition");
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        HashMap hashMap = this.f20187c;
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : hashMap.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeValue(entry.getValue());
        }
        HashMap hashMap2 = this.f20185a;
        parcel.writeInt(hashMap2.size());
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            parcel.writeString((String) entry2.getKey());
            parcel.writeValue(entry2.getValue());
        }
        HashMap hashMap3 = this.f20186b;
        parcel.writeInt(hashMap3.size());
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            parcel.writeString((String) entry3.getKey());
            parcel.writeValue(entry3.getValue());
        }
    }
}
