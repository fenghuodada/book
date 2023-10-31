package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk
@SafeParcelable.Class(creator = "MethodInvocationCreator")
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zan();
    @SafeParcelable.Field(getter = "getMethodKey", m4845id = 1)
    private final int zaa;
    @SafeParcelable.Field(getter = "getResultStatusCode", m4845id = 2)
    private final int zab;
    @SafeParcelable.Field(getter = "getConnectionResultStatusCode", m4845id = 3)
    private final int zac;
    @SafeParcelable.Field(getter = "getStartTimeMillis", m4845id = 4)
    private final long zad;
    @SafeParcelable.Field(getter = "getEndTimeMillis", m4845id = 5)
    private final long zae;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingModuleId", m4845id = 6)
    private final String zaf;
    @Nullable
    @SafeParcelable.Field(getter = "getCallingEntryPoint", m4845id = 7)
    private final String zag;
    @SafeParcelable.Field(defaultValue = "0", getter = "getServiceId", m4845id = 8)
    private final int zah;
    @SafeParcelable.Field(defaultValue = "-1", getter = "getLatencyMillis", m4845id = 9)
    private final int zai;

    @KeepForSdk
    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @SafeParcelable.Constructor
    public MethodInvocation(@SafeParcelable.Param(m4844id = 1) int i, @SafeParcelable.Param(m4844id = 2) int i2, @SafeParcelable.Param(m4844id = 3) int i3, @SafeParcelable.Param(m4844id = 4) long j, @SafeParcelable.Param(m4844id = 5) long j2, @Nullable @SafeParcelable.Param(m4844id = 6) String str, @Nullable @SafeParcelable.Param(m4844id = 7) String str2, @SafeParcelable.Param(m4844id = 8) int i4, @SafeParcelable.Param(m4844id = 9) int i5) {
        this.zaa = i;
        this.zab = i2;
        this.zac = i3;
        this.zad = j;
        this.zae = j2;
        this.zaf = str;
        this.zag = str2;
        this.zah = i4;
        this.zai = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        SafeParcelWriter.writeInt(parcel, 2, this.zab);
        SafeParcelWriter.writeInt(parcel, 3, this.zac);
        SafeParcelWriter.writeLong(parcel, 4, this.zad);
        SafeParcelWriter.writeLong(parcel, 5, this.zae);
        SafeParcelWriter.writeString(parcel, 6, this.zaf, false);
        SafeParcelWriter.writeString(parcel, 7, this.zag, false);
        SafeParcelWriter.writeInt(parcel, 8, this.zah);
        SafeParcelWriter.writeInt(parcel, 9, this.zai);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
